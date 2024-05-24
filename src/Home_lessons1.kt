// ДЗ https://neco-desarrollo.es/2021/04/%D0%BF%D1%80%D0%B0%D0%BA%D1%82%D0%B8%D0%BA%D0%B0-%D1%83%D1%80%D0%BE%D0%BA-21

fun main() {

    val bad = 0..3 // Плохие оценки
    val normal = 4..6 // Нормальные оценки
    val nice = 7..9 // Хорошие оценки
    val excellent = 10 // Отличные оценки
    val gradeArray = arrayOf(4, 7, 3, 6, 10, 2)
    val nameArray = arrayOf("Антон", "Егор", "Маша", "Светлана", "Юля", "Семен")
    val badArray = ArrayList<String>()
    val normalArray = ArrayList<String>()
    val niceArray = ArrayList<String>()
    val excellentArray = ArrayList<String>()

    for ((index, name) in nameArray.withIndex()) {
        if (gradeArray[index] in bad) {
            badArray.add("Плохие оценки: Ученик: $name – ${gradeArray[index]}")

        } else if (gradeArray[index] in normal) {
            normalArray.add("Нормальные оценки: Ученик: $name – ${gradeArray[index]}")

        } else if (gradeArray[index] in nice) {
            niceArray.add("Хорошие оценки: Ученик: $name – ${gradeArray[index]}")

        } else if (gradeArray[index] == excellent) {
            excellentArray.add("Отличные оценки: Ученик: $name – ${gradeArray[index]}")
        }
    }
    badArray.forEach{println(it)}
    normalArray.forEach{println(it)}
    niceArray.forEach{println(it)}
    excellentArray.forEach{println(it)}
}
