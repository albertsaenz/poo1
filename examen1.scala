var opcion="s"
do{
def evaluar()
{
println("----Evaluar números - - - - ")
var numero= 0
var cantidadPositivos= 0
var cantidadNegativos= 0
var cantidadNeutros= 0
for( i <- 1 to 20)
{
println("Ingresa numero " + i)
numero = readInt()
if(numero > 0)
{
cantidadPositivos += 1
} else if(numero < 0)
{
cantidadNegativos += 1
} else
{
cantidadNeutros += 1
}
}
println("Sean ingresados:" + cantidadPositivos + " numeros positivos")
println("Sean ingresados:" + cantidadNegativos + " numeros negativos")
println("Sean ingresados:" + cantidadNeutros + " numeros neutros")
}
def ccalificacion()
{
println("--calcular calificación menor----")
var menor=11.0
var calificacion=0.0
for(i <- 1 to 40)
{
println("Ingresa tu calificacion " + (i) + ":")
calificacion=readFloat()
if(calificacion<menor)
{
menor=calificacion
}
}
println("La calificacion menor es: " +menor)
}
def reloj()
{
println("----Problema simular reloj----")
for(horas <- 0 to 23)
{
for(minutos <- 0 to 59)
{
for( segundos <- 0 to 59)
{
println(horas + ":" + minutos + ":" + segundos)
}
}
}
}
def tienda()
{
println("----problema tienda descuento de naranjas----")
var kilos = 0.0
var totalCliente= 0.0
var totalTienda= 0.0
println("Ingrese el precio del kilo de naranja:$ ")
val precioKilo= readFloat()
for( i <- 1 to 15)
{
println("Cliente " + (i))
println("ingrese total de kilos ")
kilos= readFloat()
totalCliente= precioKilo * kilos
if(kilos > 10)
{
totalCliente= totalCliente * 0.85
}
totalTienda += totalCliente
println("El total a pagar es de: $" + totalCliente)
}
println("El ingreso de la tienda es de $: " + totalTienda)
}
println("------Programa examen - - - - - ")

println("----Seleccione una opción----")
println("1.-Evaluar Numeros. ")
println("2.-Calcular calificación ")
println("3.-Problema reloj ")
println("4.-Tienda de naranjas ")
println("5.-salir ")

var seleccion= readInt()
seleccion match
{
case 1 => evaluar()
case 2 => ccalificacion()
case 3 => reloj()
case 4 => tienda()
case default => println("saliendo.........")
}
println("¿Deseas seleccionar otra opcion? ")
println("presione s=si o n=no")
opcion = readLine()
}while(opcion=="s")
