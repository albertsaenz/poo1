println("------ INVERCION EN UNA EMPRESA------")
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
