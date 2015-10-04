def Calificacion (){
println("---Programa Calificacion Final---")
println("--------------------------------------------------------")

println("Ingrese Primera Calificacion")
val p1 = readFloat()

println("Ingrese Segunda Calificacion")
val p2 = readFloat()

println("Ingrese Tercera Calificacion")
val p3 = readFloat()
val prom = (p1 + p2 + p3)/3
println("primedio de los 3 exmamenes es:"+ prom)
println("Ingrese Calificacion Del Examen final")
val exf = readFloat()

println("Ingrese Calificacion Del Trabajo final")
val tf = readFloat()
println("--------------------------------------------------------")

val pc = (prom *55)/100
println("promedio de los 3 examenes:" + pc)
val pex = (exf *30)/100
println("promedio del examen final:" + pex)
val pt = (tf *15)/100
println("promedio del trabajo final:" + pt)

val calf = (pc + pex + pt)
println("--------------------------------------------------------")
println("La calificacion final de la materia es:" + calf)

}
def Hospital (){
println("------presupuesto correspondiente para cada area del hospital------")
println("inttroduzca el presupuesto anual del hospital")

val panual = readFloat()
println("---------------------------------------------------------------------")
println("Presupuesto para el area de ginecologia:::")
val gin = (panual * 40)/100
println(" $"+ gin)
println("Presupuesto para el area de traumatologia:::")
val tra = (panual * 30)/100
println(" $"+ tra)
println("Presupuesto para el area de pedriatria:::")
val ped = (panual * 30 )/100
println(" $"+ ped)

println("---------------------------------------------------------------------")
}

def Empresa (){println("------ INVERCION EN UNA EMPRESA------")
println("-------------------------------------------------------")
println("introduce cantidad de dinero que invirtio persona 1:")
val d1 = readFloat()

println("introduce cantidad de dinero que invirtio persona 2")
val d2 = readFloat()

println("introduce cantidad de dinero que invirtio persona 3")
val d3 = readFloat()

val total= d1 + d2 + d3

println("La prsona 1 invirtio un:")
val p1 = (d1 * 100)/total
println (p1 +"% del total de dinero invertido")

println("La prsona 2 invirtio un:")
val p2 = (d2 * 100)/total
println (p2 +"% del total de dinero invertido")

println("La prsona 3 invirtio un:")
val p3 = (d3 * 100)/total
println (p3 +"% del total de dinero invertido")
}


println ("Elige la opcion que deseés calcular")
println ("1-Calcular Calificacion")
println ("2-Calcular Presupuesto de Hospital")
println  ("3-Invercion de una Empresa")
val opcion = readInt()

opcion match {

case 1=> Calificacion()
case 2 => Hospital()
case 3 => Empresa()
case default => println("Opcion no valida")
}
