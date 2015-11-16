def menuN(){
  println("---------------------------Calculo de Nomina--------------------------")
  println("                    ╔═════════════════════════╗")
  println("                    ║ $$$$$$$$$$$$$$$$$$$$$$$ ║")
  println("                    ║ $$$$$$$$$$$$$$$$$$$$$$$ ║")
  println("                    ║ $$$$$$$$$$$$$$$$$$$$$$$ ║")
  println("                    ╚═════════════════════════╝")


}
class Profesor(n:String){
var nombre =n
var categoria :String =""
var horasClase: Double=0.0
var horasAsesoria : Double=0.0

def categorizar(c:String){
  categoria =c
  categoria match{
    case "HC" =>{horasClase = 75;horasAsesoria=225}
    case "MT" => {horasClase =120;horasAsesoria=240}
    case "TC" =>{horasClase =180;horasAsesoria=320}
  }
}
}
class Nomina(){
  val profesores= new Array[profesorPago](50)
  var profesorPago=0
  def calculo(profesor:Profesor, horasApagar:Int,horasAsesorias:Int){
    profesores(profesorPago)=new profesorPago(profesor,horasApagar,horasAsesorias)
    profesorPago += 1
  }
  def pagoNomina():Double={
    var totalnomina=0.0
    for(i<-0 to profesorPago-1){
      totalnomina += profesores(i).pagoAsesoria()}
return totalnomina
    }
  }

class profesorPago(p:Profesor,h:Int,a:Int){
  val profesor =p
  val hora= h
  val horasAsesorias= a
  def pagoAsesoria(): Double={
    var pago=profesor.horasClase * hora + profesor.horasAsesoria* horasAsesorias
    return pago

    }
  }

  val nomina = new Nomina()
var opcion='n'
do
{
  menuN()
  val profesores=new Profesor(" ")
  print("╝Ingrese el nombre del profesor:  ")
  var nombre=readLine()
  println("")
  print("╝Ingrese la categoria del profesor: |HC| |MT| |TC| :  ")
  var categoria=readLine()
  println("")
  print("╝Ingrese la cantidad de horas a pagar:  ")
  var horasApagar=readInt()
  println("")
  print("╝Ingrese la cantidad de horas de asesoria a pagar:  ")
  var horasAsesorias=readInt()
  profesores.categorizar(categoria)
  nomina.calculo(profesores,horasApagar,horasAsesorias)
  println("")
  print("╝Quieres realizar otro pago??")
  opcion=readChar()
}
while(opcion!='n')
println("")
println("╝total apagar es:   $"+ nomina.pagoNomina())
