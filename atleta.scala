println("----------------------------------Atleta---------------------------")
var suma=0

for(i<-1 to 10)
{
println("ingrese tiempo que hizo en el dia " + i)
val tm = readInt()
if (tm < 16)
{
}
suma = suma + tm
}
val pro= suma/10
println("el promedio es: " + pro)

if(  pro <= 15  ){
println("el atleta es apto")
}
else
{
  println("el atleta no es apto")
}
