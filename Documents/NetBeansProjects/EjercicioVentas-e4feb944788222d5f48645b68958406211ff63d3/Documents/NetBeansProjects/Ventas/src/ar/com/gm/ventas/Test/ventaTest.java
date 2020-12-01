
package ar.com.gm.ventas.Test;

import ar.com.gm.ventas.Orden;
import ar.com.gm.ventas.Producto;
import java.util.Arrays;

public class ventaTest {
    
    public static void main(String[] args) {
        
       Producto product1Orden1 = new Producto("Coca-cola Zero", 20.00, "Litros : 1.5");
       Producto product2Orden1 = new Producto("Coca-Cola", 18.00, "Litros : 1.5"); 
       Producto product3Orden1 = new Producto("Shampoo Sedal", 19.00, "Contenido: 500ml" );
       Producto product4Orden1 = new Producto("Frutillas", 64.00, "Unidad de venta: kilo");
       
       Orden orden1 = new Orden();
       orden1.agregarProducto(product1Orden1);
       orden1.agregarProducto(product2Orden1);
       orden1.agregarProducto(product3Orden1);
       orden1.agregarProducto(product4Orden1);
       orden1.mostrarOrden();
       
       
       Producto product1Orden2 = new Producto("Coca-cola", 40.00, "Litros : 3");
       Producto product2Orden2 = new Producto("Pepsi", 36.00, "Litros : 3"); 
       Producto product3Orden2 = new Producto("Queso cremoso Paulina", 80.00, "Unidad de venta: Kilo" );
       Producto product4Orden2 = new Producto("Jamon serrano", 125.00, "Unidad de venta: kilo");
       
       Orden orden2 = new Orden();
       
       orden2.agregarProducto(product1Orden2);
       orden2.agregarProducto(product2Orden2);
       orden2.agregarProducto(product3Orden2);
       orden2.agregarProducto(product4Orden2);
       orden2.mostrarOrden();
        
       Arrays.sort();
       
        
    }
    
}
