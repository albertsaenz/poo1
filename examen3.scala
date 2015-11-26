abstract class ProductoAPagar(n:String,c:Int){
   private val nombre=n
   val precio: Int
   private val cantidad=c
  def subtotal():Double={
    return precio* cantidad
  }
}
class Productos extends Iterable[ProductoAPagar]{
  private val productosAPagar= new Array[ProductoAPagar](50)
  private var cantidadProductos=0
  def iterator():Iterator[ProductoAPagar]={
    return productosAPagar.slice(0, cantidadProductos).iterator
  }
  def agregar(producto:ProductoAPagar){
    productosAPagar(cantidadProductos)= producto
    cantidadProductos +=1
  }
}

class Nota{
   private val cantidadProductos= new Productos()
   def notas(producto:ProductoAPagar){
     cantidadProductos.agregar(producto)
   }
  def total():Double={
    var total=0.0
    for(producto<- cantidadProductos)
    {
      total += producto.subtotal()
    }
    return total
  }
}
val nota = new Nota()
var opcion='n'
do{
  println("Ingrese el nombre del producto:")
  var nombre=readLine()
  println("Ingrese el precio del producto:")
  var precio = readInt()
  println("ingrese la cantidad de productos que deseé commprar: ")
  var cantidadProductos =readInt()

  println("Desea agregar otro producto?")
  println("")
  println("")
  println("                s=Si                         n=No")
  opcion=readChar()
}while(opcion!='n')
println(nota.total())
