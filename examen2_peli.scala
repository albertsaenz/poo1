def menuP(){
  println("----------------------------(BLOCK BOSTER)--------------------------------------")
  println("                             ╔══════════╗            ")
  println("                             ║  ████    ║       ")
  println("                             ║  ████    ║         ")
  println("                             ╚══════════╝               ")
  println("escriba la categoria de la cual desea rentar...")
  println("1))) ninos")
  println("2))) regular")
  println("3))) estrenos")
}

class Pelicula(n :String)
{
  val nombre = n
  var clasificacion: String = ""
  var precioPorDia: Double = 0.0
  def clasificar(c: String)
  {
    clasificacion = c

 clasificacion match{
   case "ninos" => precioPorDia = 10
   case "regular" => precioPorDia =15
   case "estrenos" => precioPorDia = 25
 }
  }
}

class PeliculaRentada(p:Pelicula, d :Int)
{
  val pelicula = p
  val diasRentada = d
  def precio():Double ={
    var descuento =0.0
  pelicula.clasificacion match
    {
      case "ninos"=>{ if(diasRentada>=3)
      {
          descuento =0.15
      }
       }

    case "regular"=> {if(diasRentada>=2)
    {
descuento=0.1
    }
  }
case default => descuento=0.0
    }
    var precio = pelicula.precioPorDia * diasRentada
    return precio - precio*descuento
  }
}
class Renta(){
  val peliculas = new Array[PeliculaRentada](50)
  var peliculasRentadas=0
  def rentar (pelicula: Pelicula, dias:Int)
  {
  peliculas(peliculasRentadas)=new PeliculaRentada(pelicula,dias)
  peliculasRentadas += 1
}
def totalAPagar():Double={
  var total=0.0
for(i <- 0 to peliculasRentadas-1)
{
  total += peliculas(i).precio()
}
return total
  }
}

val renta= new Renta()
var opcion='n'
do{
  menuP()
  var clasificacion=readLine()
  val pelicula=new Pelicula("     ")
  pelicula.clasificar(clasificacion)
  println("Introduca el titulo de la pelicula")
  var titulo=readLine()
  println("Por cuantos dias desea rentar la pelicula?: ")
  var dias=readInt()
  renta.rentar(pelicula,dias)
  println("Desea rentar otra pelicula?")
  println("")
  println("")
  println("                s=Si                         n=No")
  opcion=readChar()
}while(opcion!='n')
println("El total a pagar es: $" + renta.totalAPagar())
println("..................Gracias por  su visita...........")
