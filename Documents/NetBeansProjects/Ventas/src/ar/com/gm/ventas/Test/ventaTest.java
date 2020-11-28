
package ar.com.gm.ventas.Test;

import ar.com.gm.ventas.*;
public class ventaTest {
    public static void main(String[] args) {
        
       Producto producto1 = new Producto("Coca-cola Zero", 20.00, "Litros : 1.5");
       Producto producto2 = new Producto("Coca-Cola", 18.00, "Litros : 1.5"); 
       Producto producto3 = new Producto("Shampoo Sedal", 19.00, "Contenido: 500ml" );
       Producto producto4 = new Producto("Frutillas", 64.00, "Unidad de venta: kilo");
       
       Orden orden1 = new Orden();
       orden1.agregarProducto(producto1);
       orden1.agregarProducto(producto2);
       orden1.agregarProducto(producto3);
       orden1.agregarProducto(producto4);
       orden1.mostrarOrden();
        
     
        
        
        
        
        
        
    }
    
}
