import java.math.RoundingMode
import java.text.DecimalFormat
import kotlin.math.pow

fun main() {

    val lista = listOf(282.19 , 652.84 , 385.24 , 316.47 , 831.28 )
    println((resta(lista) { a -> cuadrados(a) }))
}

fun cuadrados(valor: Double) = valor + (valor.pow(2))

fun resta(valores: List<Double>, cuad: (Double) -> Double): List<Double> {

    val lis = mutableListOf<Double>()
    for (i in valores.indices) {
        val df = DecimalFormat("#.##")
        df.roundingMode = RoundingMode.HALF_UP
        lis.add(df.format(cuad(valores[i]) - (valores[i] / 2.0)).toDouble())
    }

    return lis
}