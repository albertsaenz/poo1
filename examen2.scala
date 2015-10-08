var opcion="s"
do{
def auto()
{
  var puntos=0.0
  var suma=0.0
  var promedio=0.0
  var menor=11.0
  var mayor=11.0
  println("--------------Puntos contaminantes de automoviles--------")
  for(i <-1 to 25)
  {
  println("ingrese los punntos contaminantes del carro: " + i)
  puntos=readFloat()
  suma=suma+puntos
  promedio= (suma/25)

  if(puntos < menor)
  {
    menor=puntos
  }
  if(puntos>mayor)
  {
    mayor=puntos
  }
  }


  println("el promedio de los puntos de los 25 autos es: " + promedio)
  println("los puntos menores de contaminacion de los autos ingresados es; " + menor)
  println("los puntos mayores de contaminacion de los autos ingresados es; " + mayor)
}
def arbolesmx()
{
  var hecta=0.0
  var pinos=0.0
  var oyamel=0.0
  var cedros=0.0
  var tpinos=0.0
  var toyamel=0.0
  var tcedros=0.0
  println("----------------plantacion de arboles--------------")
  println
  println("")
    print("ingrese el valor de la hectarea en M cuadrados:  ")
  hecta=readInt()
  if(hecta <= 1000000)
  {
    {
    println("el valor ingresado es menor o igual a 1000000")
  println("")
  pinos=(hecta*50)/100
  oyamel=(hecta*30)/100
  cedros=(hecta*20)/100
  tpinos= (pinos*8)/10
  toyamel=(oyamel*15)/15
  tcedros=(cedros*10)/18
  }
  println("el total de pinos plantados es; " + tpinos)
  println("el total de oyameles plantados es; " + toyamel)
  println("el total de cedros plantados es; " + tcedros)
  }
  if(hecta > 1000000){
    {
    println("el valor ingresado es mayor a 1000000")
  println("")
    pinos=(hecta*70)/100
    oyamel=(hecta*20)/100
    cedros=(hecta*10)/100
    tpinos= (pinos*8)/10
    toyamel=(oyamel*15)/15
    tcedros=(cedros*10)/18
  }
  println("el total de pinos plantados es; " + tpinos)
  println("el total de oyameles plantados es; " + toyamel)
  println("el total de cedros plantados es; " + tcedros)
  }
  println("escrbe 'si' si quieres repetir el programa o escribe 'no' si deseas salir")
  println("------------------------------------------------------------------------")

}
println("------Programa examen 2  - - - - - ")

println("----Seleccione una opción----")
println("1.- Puntos contaminantes de automoviles")
println("2.-plantacion de arboles ")
println("3.-salir ")
var seleccion= readInt()
seleccion match
{
case 1 => auto()
case 2 => arbolesmx()
case default => println("saliendo.........")
}
println("¿Deseas seleccionar otra opcion? ")
println("presione s=si o n=no")
opcion = readLine()
}while(opcion=="s")
