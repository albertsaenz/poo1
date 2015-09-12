println("-------------------Invercion y Compra--------------------")
println("ingrese el total de la compra: $")
var tc = readInt()
println("La forma de pago al fabricante queda asi:")
if(tc >= 500000)
{
var dpropio = (tc*55)/100
println("Dinero propio invertido: $" + dpropio)
var pbanco = (tc*30)/100
println("Dinero del prestamo del banco: $" + pbanco)
var credito = (tc*15)/100
var interes = (credito*20)/100
var tcredito = interes + credito 
println("pago solicitado a credito al fabricante + el 20% de interes : $" + tcredito )

}
else
{
var dpropio = (tc*70)/100
println("Dinero propio invertido: $" + dpropio)
var credito = (tc*30)/100
var interes = (credito*20)/100
var tcredito = interes + credito 
println("pago solicitado a credito al fabricante + el 20% de interes : $" + tcredito )
}
