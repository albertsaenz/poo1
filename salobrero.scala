println("----salario semanal de un obrero---------")
println("Ingrese horas que trabajo esta semana:")
var h1 = readInt()

if(h1<=40)
{
println("usted trabajo: " + h1 +"horas")
var psemana = (h1*160)
println("su pago de esta semana es: " + psemana)
println("Enviando dinero.......")
println("Dinero enviado....")
}
else
{
println("usted trabajo: "+ h1 +"horas")
var hex = (h1-40)
println("De las horas que trabajo "+ hex +"son horas extras")
var ph = (40*160)
println("---------------------------------------------------")
println("pago por horas:" + ph)
var pex = hex*200
println("pago por horas extras: " + pex)
var total = ph + pex
println("---------------------------------------------------")
println("su pago total de la semana es: " + total)
println("Enviando dinero.......")
println("Dinero enviado....")
}