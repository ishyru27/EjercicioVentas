
package ar.com.gm.ventas;

public class Orden{
    
    private int idOrden;
    private Producto productos[];
    private static int contadorOrdenes;
    private int contadorProductos;
    private static final int MAX_PRODUCTOS = 5;
   

    public Orden() {
        this.idOrden = ++Orden.contadorOrdenes;
        this.productos = new Producto[Orden.MAX_PRODUCTOS];
                
    }
    public void agregarProducto(Producto producto){
        
        if (this.contadorProductos < Orden.MAX_PRODUCTOS) {
            productos[contadorProductos++] = producto;
            
        }
        else{
            System.out.println("Se ha superado el maximo de productos: " + Orden.MAX_PRODUCTOS);
        }  
        
       } 
    
    public double cacularTotal() {
        
           double total = 0;
           for (int i = 0; i < this.contadorProductos; i++) {
               total += this.productos[i].getPrecio();
                       
           }
           return total;   
       }
    public void mostrarOrden()
    {
        
        System.out.println("Id orden: " + this.idOrden);
        double totalOrden = this.cacularTotal();
        System.out.println("Total de la orden: $"+ totalOrden);
        System.out.println("Productos de la Orden: ");
        
        for (int i = 0; i < this.contadorProductos; i++)
        {
            System.out.println(this.productos[i]);
            
        }
    }

  
}
    
    
    
    

        
        
        
        
        
        
    
    
    
    

