fun main() {
    try {
       print("Введите день недели: ")
       val days = readLine()!!.toString()
        val pmday = DayOfWeek.valueOf(days)
        println("${printNumDay(pmday)}. ${printDayOfWeek(pmday)} - ${printPar(pmday)} , ${checkWeekend(pmday)}")

        println()

        print("Введите цвет: ")
        val color = readLine()!!.toString()
        val pmColor = Color.valueOf(color)
        println("${printColor(pmColor)} (${getColorSmesh(pmColor)}) - ${pirntRGBcolor(pmColor)}. ${printRainbowChvet(pmColor)}")
    }
    catch (e: Exception){
        println("Ошибка, повторите ввод данных")
        return
    }
}