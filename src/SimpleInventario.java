import java.security.PublicKey;
import java.util.Scanner;

public class SimpleInventario {
public static void agragarinventario(String s){
    System.out.println("Agregar un Articulo: ");
}

    public static String obtenerNombreArticulo(){
      Scanner scanner = new Scanner (System.in);
      System.out.println("Ingrese el nombre de articulo: ");
      String nombredeArticulo;
      nombredeArticulo = scanner.next();
      System.out.println("Usted a ingresado el articulo" + nombredeArticulo);
      return nombredeArticulo;

    }






        public static void removerArticuloint(int id) {
}

    public static double ObtenerPrecioArticulo(int id) {
        return 0.00;
    }

        public static void imprimirinventario(){
            System.out.println("Ingrese su Nombre");
            Scanner scanner = new Scanner(System.in);
            String usuario;
            usuario = scanner.next();
            System.out.println("Bienvenido " + usuario);
            String articuloExistente = obtenerNombreArticulo();
            System.out.println("Articulo existente: " + articuloExistente);
        }

        public static void main(String[] args){
           imprimirinventario();
        }
}










