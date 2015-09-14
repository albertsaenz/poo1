println("------------------------imms--------------------")

println("ingrese edad y antiguedad")
val edad = readInt
val ant = readInt
if( edad >= 60 && ant < 25 ){
println("usted esta en la calasificacion de jubilacion por edad")
}
if(  edad < 60 && ant > 25 ){
println("usted esta en la calasificacion de jubilacion por antiguedad joven")
}
if(  edad >= 60 && ant > 25 ){
println("usted esta en la calasificacion de jubilacion por antiguedad adulta")
}
