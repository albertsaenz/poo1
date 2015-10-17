class Producto(n: String, p: Float, c: String)
{
val nombre= n
val precio= p
val codigo= c
}
main()
def main()
{
var productos = new Array[Producto](50)
catalogo(productos)
}
def catalogo
(productos: Array[Producto])
 {
var opcion = 3
var cantidadProductos = 0
var productosAgregados = 0
do {
mostrarMenuPrincipal()
opcion = readInt()
opcion match {
case 1 => {
productosAgregados = agregarProductos(
productos, cantidadProductos)
cantidadProductos = productosAgregados
}
case 2 => {
nota(productos, cantidadProductos)
}
case default => println("Adios...")
}
} while (opcion != 3)
}

def mostrarMenuPrincipal() {
println("1) Agregar productos")
println("2) Nota")
println("3) Salir")
}

def agregarProductos(
productos: Array[Producto],
cantidadProductos: Int
) : Int = {
var continuar = 'n'
var i = cantidadProductos
do {
capturarDatosProducto(productos, i)
mostrarCatalogoProductos(productos, i)
i = i + 1
print("¿Quieres agregar otro producto (s/n)? ")
continuar = readChar()
} while (continuar == 's')
i
}

def capturarDatosProducto(
productos: Array[Producto],
i: Int
) {
println("Ingresa los datos del producto")
print("Nombre: ")
var nombre = readLine()
print("Precio: ")
var precio = readFloat()
print("Código de barras: ")
var codigo = readLine()
productos(i)= new Producto(nombre, precio, codigo)
}

def mostrarCatalogoProductos(
productos: Array[Producto],
i: Int
) {
println("Nombre | Precio | Código")
for (j <- 0 to i) {
println(productos(j).nombre
+ " |" +  productos(j).precio
+ " | " + productos(j).codigo)
}
}
def nota(productos: Array[Producto],
cantidadProductos: Int)
{
var totalNota=0.0
var i = cantidadProductos-1
var otro='n'
mostrarCatalogoProductos(productos, i)
i = i + 1
do{
println("ingresa el numero del producto: ")
var producto=readInt()
println("Cantidad de productos:")
var cantidad=readInt()
totalNota += productos(producto - 1).precio * cantidad
println("Agregar otro producto: (s/n) ")
otro=readChar()
}while(otro!='n')
println("Total a pagar: " + totalNota)
}
