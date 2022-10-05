import java.math.RoundingMode
import java.text.DecimalFormat

fun main(args: Array<String>) {
    val dif=DecimalFormat("#-##")

    dif.roundingMode= RoundingMode.HALF_UP
    val carrito= listOf(
        894.70 to 89.0, 692.48 to 42.0, 280.76 to 76.0, 993.35 to 22.0
    )
    println(dif.format(totalCarrito(carrito,{a,b -> descuento(a,b)},{a -> IVA(a)})))
}
fun descuento(original: Double, desc:Double)=original-(original*desc/100)

fun IVA(original:Double) = original+(original*0.16)

fun totalCarrito(carrito: List<Pair<Double,Double>>, desc:(Double, Double) ->Double, IVA:(Double) -> Double):Double{
    var total = 0.0
    for (i in carrito.indices) {
        total += IVA(desc(carrito[i].first,carrito[i].second))
    }
    return total
}