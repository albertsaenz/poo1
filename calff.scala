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
