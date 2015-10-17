var opcion="s"
do{
def salobrero()
{
  println("----salario semanal de un obrero---------")
  println("Ingrese horas que trabajo esta semana:")
  var h1 = readInt()

  if(h1<=40)
  {
  println("usted trabajo: " + h1 +"horas")
  var psemana = (h1*160)
  println("su pago de esta semana es: " + psemana)
  println("Enviando dinero.......")
  println("Dinero enviado....")
  }
  else
  {
  println("usted trabajo: "+ h1 +"horas")
  var hex = (h1-40)
  println("De las horas que trabajo "+ hex +"son horas extras")
  var ph = (40*160)
  println("---------------------------------------------------")
  println("pago por horas:" + ph)
  var pex = hex*200
  println("pago por horas extras: " + pex)
  var total = ph + pex
  println("---------------------------------------------------")
  println("su pago total de la semana es: " + total)
  println("Enviando dinero.......")
  println("Dinero enviado....")
  }
}
def compra()
{
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
}
def destienda()
{
println("-----------------tienda----------------------")
println("Ingrese el total de la compra")
 val tc = readFloat()
 println("ingres color de la bolita para aplicar el descuento")
 println("Si es blanca ingrese 1 ")
 println("Si es verde ingrese 2 ")
 println("Si es amarrilla ingrese 3 ")
 println("Si es azul ingrese 4 ")
 println("Si es roja ingrese 5 ")
 val bolita = readInt

 if(bolita==1){
 println("Bolita blanca No se le aplicara descuento")
 var des = (tc-0)
 println("El total a pagar es: $" + des)
 }

 if(bolita==2){
 println("Bolita verde  se le aplicara un descuento del 10%")
 var des = tc-(tc*.10)
 println("El total a pagar es: $" + des)
  }

 if(bolita==3){
 println("Bolita amarilla se le aplicara un descuento del 25%")
 var des = tc-(tc*.25)
 println("El total a pagar es: $" + des)
 }

 if(bolita==4){
 println("Bolita azul se le aplicara un descuentod del 50%")
 var des = tc-(tc*.50)
 println("El total a pagar es: $" + des)
 }

 if(bolita==5){
 println("Bolita roja se le aplicara un descuento del 100%")
 var des = (tc-tc)
 println("El total a pagar es: $" + des)
 }
println("gracias por su compra.......................")
}
def edadjub()
{
println("------------------------imms--------------------")

println("ingrese edad y antiguedad")
val edad = readInt
val ant = readInt
if( edad >= 60 && ant < 25 ){
println("usted esta en la calasificacion de jubilacion por edad")
}
if(  edad < 60 && ant > 25 ){
println("usted esta en la calasificacion de jubilacion por antiguedad joven")
}
if(  edad >= 60 && ant > 25 ){
println("usted esta en la calasificacion de jubilacion por antiguedad adulta")
}
}
println("------ Eercicios 2y3 - - - - - ")

println("----Seleccione una opción----")
println("1.-Calcular salario ")
println("2.-Compra e Invercion ")
println("3.-Aplicar descuento de compra ")
println("4.-clasificacion de jubilacion ")
println("5.-salir ")

var seleccion= readInt()
seleccion match
{
case 1 => salobrero()
case 2 => compra()
case 3 => destienda()
case 4 => edadjub()
case default => println("saliendo.........")
}
println("¿Deseas seleccionar otra opcion? ")
println("presione s=si o n=no")
opcion = readLine()
}while(opcion=="s")
