class Racional(n: Int, d: Int) {
val numerador = n
val denominador = d

def sumar(b: Racional): Racional = {
new Racional(
numerador * b.denominador + denominador * b.numerador,
denominador * b.denominador)

}
def restar(b: Racional): Racional = {
new Racional(
numerador * b.denominador - denominador * b.numerador,
denominador * b.denominador)
}
def multiplicar(b: Racional): Racional = {
new Racional(numerador * b.denominador * denominador * b.numerador,
denominador * b.denominador)
}
def dividir(b: Racional): Racional = {
new Racional(
numerador * b.denominador / denominador * b.numerador,
denominador * b.numerador)
}
}
var opcion="s"
do{
println("--------------------------Programa fracciones------------------------ - - - - - ")

println("----Seleccione una opción----")
println("1//Sumar......")
println("2//Restar...... ")
println("3//Multiplicar........")
println("4//Dividir.........")

var seleccion= readInt()

print("Numerador de la primera fraccion: ")
val n1 = readInt()
print("Denominador de la primera fraccion: ")
val d1 = readInt()
val fraccion1 = new Racional(n1, d1)

print("Numerador de la primera fraccion: ")
val n2 = readInt()
print("Denominador de la primera fraccion: ")
val d2 = readInt()
val fraccion2 = new Racional(n2, d2)


seleccion match
{
case  1  =>
{
val sumar = fraccion1.sumar(fraccion2)
println ("La suma es:"  + sumar.numerador +  "/"  + sumar.denominador)
}
case  2  =>
{
val  restar = fraccion1.restar (fraccion2)
println ("La Resta es:"  + restar.numerador +  "/"  + restar.denominador)
}
case  3  =>
{
val  dividir = fraccion1.dividir (fraccion2)
println ("La division es:"  + dividir.numerador +  "/"  + dividir.denominador)
}
case  4  =>
{
val  multiplicar = fraccion1.multiplicar (fraccion2)
println ("La Multiplicación es:"  + multiplicar.numerador +  "/"  + multiplicar.denominador)
}
case default => println ("Adiossssss...........saliendo ...")
}

println("¿Deseas seleccionar otra opcion? ")
println("presione s=si o n=no")
opcion = readLine()
}while(opcion=="s")
