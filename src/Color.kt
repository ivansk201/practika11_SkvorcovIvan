enum class Color() {
    Красный, Оранжевый, Желтый, Зеленый, Синий,Фиолетовый, Розовый;
}
fun printColor(color: Color): String {
    return when (color) {
        Color.Красный -> "Красный"
        Color.Оранжевый-> "Ораньжевый"
        Color.Желтый-> "Желтый"
        Color.Зеленый -> "Зеленый"
        Color.Синий -> "Синий"
        Color.Фиолетовый -> "Фиолетовый"
        Color.Розовый -> "Розовый"
    }
}
fun pirntRGBcolor(color: Color): String {
    return when (color) {
        Color.Красный -> "(255, 0, 0) в системе RGB"
        Color.Оранжевый-> "(255, 102, 0) в системе RGB"
        Color.Желтый-> "(255, 255, 0) в системе RGB"
        Color.Зеленый -> "(0, 255, 0) в системе RGB"
        Color.Синий -> "(66, 170, 255) в системе RGB"
        Color.Фиолетовый -> "(139, 0, 255) в системе RGB"
        Color.Розовый -> "(255, 192, 203) в системе RGB"
    }
}
fun getColorSmesh(color: Color): String {
    return when (color) {
        Color.Красный -> "Можно смешать с Желтым"
        Color.Оранжевый -> "Можно смешать с Черным"
        Color.Желтый-> "Можно смешать с Синим"
        Color.Зеленый -> "Можно смешать с Оранжевым"
        Color.Синий -> "Можно смешать с Белым"
        Color.Фиолетовый -> "Можно смешать с Красным"
        Color.Розовый -> "Можно смешать с Зеленым"
    }
}
fun printRainbowChvet(color: Color): String {
    return if (color == Color.Красный || color == Color.Оранжевый || color == Color.Желтый || color == Color.Зеленый || color == Color.Синий || color == Color.Фиолетовый)
        "Этот цвет является цветом радуги."
    else
        "Этот цвет не является цвет радуги."
}