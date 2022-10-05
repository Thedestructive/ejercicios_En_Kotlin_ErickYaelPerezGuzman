fun main() {
    val oracion = "Esto solo es una prueba para ver si funciona esto"
    println(diccionario(oracion))

}

fun diccionario(oracion: String): Map<String, Int> {
    val dic: MutableMap<String, Int> = mutableMapOf()
    val parte = listOf(*oracion.split(" ".toRegex()).toTypedArray())
    for (i in parte.indices) {
        dic[parte[i]] = parte[i].length
    }
    return dic
}