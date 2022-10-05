fun main() {
    val valores: MutableList<Double> =mutableListOf()

    for(i in 1..30){
        val r= (20..50).random().toDouble()
        valores.add(r)
    }

    valores.add(505.0)
    valores.add(200.0)
    valores.add(1000.0)
    valores.add(250.0)
    valores.add(125.0)
    valores.add(281.0)
    valores.add(9281.0)

    valores.sort()
    println(atipicos(valores))
}

fun atipicos(valores: List<Double>): List<Double> {
    val a: MutableList<Double> = mutableListOf()
    val sup: List<Double>
    val inf: List<Double>
    if (valores.size % 2 == 0) {
        sup = valores.subList(0, valores.size / 2)
        inf = valores.subList(valores.size / 2, valores.size)

    } else {
        sup = valores.subList(0, valores.size / 2)
        inf = valores.subList(valores.size / 2 + 1, valores.size)
    }
    val q1 = mediana(sup)
    println("Primer Cuartil: $q1")
    val q3 = mediana(inf)
    println("Tercer Cuartil: $q3")
    val riq = q3 - q1

    val qInf = q1 - 1.5 * riq

    val qExt = q3 + 1.5 * riq
    println("Valores atipicos:")
    for (i in valores.indices) {
        if (valores[i] < qInf || valores[i] > qExt) a.add(valores[i])
    }
    return a
}

private fun mediana(data: List<Double>): Double {
    return if (data.size % 2 == 0) (data[data.size / 2] + data[data.size / 2 - 1]) / 2
    else data[data.size / 2]
}