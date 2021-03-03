package ventadecarros;
/**
 * @author Paola Gomez
 */
public class VentadeCarros {
    public static void main(String[] args) {
        Carros carros = new Carros ();
        carros.marca = "Toyota";
        carros.modelo = "Corolla";
        carros.color = "Blanco";
        carros.estado = "Usado";
        carros.precio = 250000;
                
        Comprador comprador = new Comprador ();
        comprador.nombre = "Juan ";
        comprador.apellido = "Perez";
        comprador.nacionalidad = "Mexicana";
        comprador.ID = "A02019";
        comprador.metododepago = "tarjeta de credito";
        
        Vendedor vendedor = new Vendedor ();
        vendedor.Nombre = "Alberto ";
        vendedor.Apellido = "Aguilar";
        vendedor.codvendedor = 0123;
         
         
        carros.run();
        comprador.correr ();
        vendedor.correr2();
        
    }
    
}
