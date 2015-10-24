class Nota{
  val productos= new Array[Producto](50)
  val cantidades=new Array[Int](50)
  var productosComprados=0

  def agregar(
  producto: Producto,
  cantidad: Int
  ){
    productos(productosComprados)=producto
    cantidades(productosComprados)=cantidad
    productosComprados += 1
  }

  def total(): Double ={
    var total=0.0
      for(i <- 0 to (productosComprados - 1)){
        total += productos(i).precio * cantidades(i)
      }
    return total
  }
}

class Catalogo{
  val productos=new Array[Producto](50)
  var cantidadProducto=0
  def agregar(producto: Producto){
    productos(cantidadProducto)=producto
    cantidadProducto += 1
  }
}

class Producto(n: String, p: Float, c: String){
  val nombre= n
  val precio= p
  val codigo= c
}

main()

def main() {
  catalogo(new Catalogo())
  }

def catalogo(
  catalogo: Catalogo
) {
  var opcion = 3
  do {
    mostrarMenuPrincipal()
    opcion = readInt()
    opcion match {
      case 1 => agregarProductos(catalogo)
      case 2 => notas(catalogo)
      case default => println("Adios...")
   }
  } while (opcion != 3)
}

def mostrarMenuPrincipal() {
  println("1) Agregar productos")
  println("2) Nota")
  println("3) Salir")
}

def agregarProductos(catalogo: Catalogo){
  var continuar = 'n'
  do {
    capturarDatosProducto(catalogo)
    mostrarCatalogoProductos(catalogo)
    print("¿Quieres agregar otro producto (s/n)? ")
    continuar = readChar()
  } while (continuar == 's')
}

def capturarDatosProducto(catalogo: Catalogo) {
  println("Ingresa los datos del producto")
  print("Nombre: ")
  var nombre = readLine()
  print("Precio: ")
  var precio = readFloat()
  print("Código de barras: ")
  var codigo = readLine()
  catalogo.agregar(new Producto(nombre, precio, codigo))
}

def mostrarCatalogoProductos(catalogo: Catalogo) {
  println("Nombre | Precio $| Código")
  for (j <- 0 to catalogo.cantidadProducto-1) {
    println(catalogo.productos(j).nombre + " |"+"$" +  catalogo.productos(j).precio + " | " + catalogo.productos(j).codigo)
  }
}

def notas(
  catalogo: Catalogo
  ){
  val nota= new Nota()
  var otro='n'
  mostrarCatalogoProductos(catalogo)
    do{
      agregarProducto(nota, catalogo)
      println("Agregar otro producto: (s/n) ")
      otro=readChar()
    }while(otro!='n')
    println("Total a pagar: $" + nota.total())
  }

def agregarProducto(
  nota: Nota,
  catalogo: Catalogo
  ){
  println("ingresa el numero del producto: ")
  var seleccionado=readInt()
  println("Cantidad de productos:")
  var cantidad=readInt()
  nota.agregar(catalogo.productos(seleccionado - 1), cantidad)
}
