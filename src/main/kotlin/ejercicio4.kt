fun main() {
    val notas: Map<String, Int> = mapOf(
        "Gestión de proyectos de Software" to 77, "Programación Web" to 89, "Programación Movil" to 63,
        "Taller de Investigación" to 71, "Enrutamiento de Redes" to 75,
        "Programación Lógica y funcional" to 95, "Internet de las cosas" to 70
    )
    println(calif(notas))

}

fun calif(notas: Map<String, Int>): Map<String, String> {
    val des: MutableMap<String, String> = mutableMapOf()
    for ((k, v) in notas) {
        val d = when (v) {
            in 0..69 -> "Desempeño insuficiente"
            in 70..74 -> "Suficiente"
            in 75..84 -> "Bueno"
            in 85..94 -> "Notable"
            in 95..100 -> "Excelente"
            else -> " "
        }
        des[k.uppercase()] = d
    }
    return des
}