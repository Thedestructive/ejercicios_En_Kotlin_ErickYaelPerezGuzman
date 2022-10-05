import java.math.RoundingMode
import java.text.DecimalFormat
import kotlin.math.pow
import kotlin.math.sqrt

fun main() {
    val df = DecimalFormat("#.##")
    df.roundingMode = RoundingMode.HALF_UP
    val v1 = Triple(34.6, 12.8, -5.6)
    val v2 = Pair(67.8, -9.6)
    println(df.format(modulo3D(v1)))
    println(df.format(modulo2D(v2)))
}

fun modulo3D(v: Triple<Double, Double, Double>) = sqrt(v.first.pow(2.0) + v.second.pow(2.0) + v.third.pow(2.0))
fun modulo2D(v: Pair<Double, Double>) = sqrt(v.first.pow(2.0) + v.second.pow(2.0))
