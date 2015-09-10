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
