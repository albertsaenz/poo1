println("-----------------tienda----------------------")
println("Ingrese el total de la compra")
 val tc = readFloat()
 println("ingres color de la bolita para aplicar el descuento")
 println("Si es blanca ingrese 1 ")
 println("Si es verde ingrese 2 ")
 println("Si es amarrilla ingrese 3 ")
 println("Si es azul ingrese 4 ")
 println("Si es roja ingrese 5 ")
 val bolita = readInt

 if(bolita==1){
 println("Bolita blanca No se le aplicara descuento")
 var des = (tc-0)
 println("El total a pagar es: $" + des)
 }

 if(bolita==2){
 println("Bolita verde  se le aplicara un descuento del 10%")
 var des = tc-(tc*.10)
 println("El total a pagar es: $" + des)
  }

 if(bolita==3){
 println("Bolita amarilla se le aplicara un descuento del 25%")
 var des = tc-(tc*.25)
 println("El total a pagar es: $" + des)
 }

 if(bolita==4){
 println("Bolita azul se le aplicara un descuentod del 50%")
 var des = tc-(tc*.50)
 println("El total a pagar es: $" + des)
 }

 if(bolita==5){
 println("Bolita roja se le aplicara un descuento del 100%")
 var des = (tc-tc)
 println("El total a pagar es: $" + des)
 }
println("gracias por su compra.......................")
