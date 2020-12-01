
package ar.com.gm.ventas;


public class Producto implements Comparable{

        private final int idProducto;
        private String nombre;
        private double precio;
        private String contenido;
        private static int contadorProductos;

    

        private Producto() {
            this.idProducto = ++Producto.contadorProductos;

        }
        
      
        public Producto(String nombre, double precio, String contenido) {
            this();
            this.nombre = nombre;
            this.precio = precio;
            this.contenido= contenido;
        }
      
        

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public double getPrecio() {
            return precio;
        }

        public void setPrecio(double precio) {
            this.precio = precio;
        }

        public int getIdProducto() {
            return idProducto;
        }


    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }
    

    @Override
    public String toString() {
        return "Producto " + "idProducto" + idProducto + " Nombre= " + nombre + "/// Precio= " + precio + ", ///Contenido= " + contenido ;
    }

    @Override
    public int compareTo(Object p) {
        Producto otroProducto = (Producto)p;
        
        if (this.precio<otroProducto.precio) {
            System.out.println("Producto Mas barato");
            return -1;  
            
        }else if (this.precio>otroProducto.precio) {
            System.out.println("Producto mas caro");
            return 1;
        }
        return 0;
}

   
   
        
        
     



    
    
    
 }

    
    

