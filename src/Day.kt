enum class DayOfWeek { Понедельник, Вторник, Среда, Четверг, Пятница, Суббота, Воскресенье}
fun printDayOfWeek(day: DayOfWeek): String {
    return when (day) {
        DayOfWeek.Понедельник -> "Понедельник"
        DayOfWeek.Вторник -> "Вторник"
        DayOfWeek.Среда -> "Среда"
        DayOfWeek.Четверг -> "Четверг"
        DayOfWeek.Пятница -> "Пятница"
        DayOfWeek.Суббота -> "Суббота"
        DayOfWeek.Воскресенье -> "Воскресенье"
    }
}

fun printPar(day: DayOfWeek): String {
    return when (day) {
        DayOfWeek.Понедельник-> "у нас в этот день 3 пары"
        DayOfWeek.Вторник -> "у нас в этот день 3 пары"
        DayOfWeek.Среда -> "у нас в этот день 4 пары"
        DayOfWeek.Четверг -> "у нас в этот день нет пар"
        DayOfWeek.Пятница -> "у нас в этот день 4 пары"
        DayOfWeek.Суббота -> "у нас в этот день нет пар"
        DayOfWeek.Воскресенье -> "у нас в этот день нет пар"
    }
}

fun printNumDay(day: DayOfWeek): Int {
    return when (day) {
        DayOfWeek.Понедельник -> 1
        DayOfWeek.Вторник -> 2
        DayOfWeek.Среда -> 3
        DayOfWeek.Четверг -> 4
        DayOfWeek.Пятница -> 5
        DayOfWeek.Суббота -> 6
        DayOfWeek.Воскресенье -> 7
    }
}



fun checkWeekend(day: DayOfWeek): String {
    return if (day == DayOfWeek.Суббота || day == DayOfWeek.Воскресенье)
        "это будет выхондной день (мини-праздник)"
    else "это рабочий скучный день"
}




