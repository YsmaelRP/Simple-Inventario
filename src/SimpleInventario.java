import java.util.Scanner;

public class SimpleInventario {
    static String[] articulo = new String[5];
    public static void agregarArticulo() {
        for (int i = 0; i < articulo.length; i++){
            articulo[i] = obtenerNombreArticulo();
        }


    }

    public static String obtenerNombreArticulo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre de articulo: ");
        String nombredeArticulo;
        nombredeArticulo = scanner.next();
        System.out.println("Usted a ingresado el articulo" + nombredeArticulo);
        return nombredeArticulo;

    }


    public static void removerArticuloint(int id) {
        if (id > 0.00) {
            System.out.println("Articulo Removido");
        }
    }

    public static double ObtenerPrecioArticulo(String articulo) {
        double precio = (Math.random() * 5000) + 100;
        if (articulo.startsWith("A") || articulo.startsWith("D")) {
            return precio;
        } else if (articulo.startsWith("C") || articulo.startsWith("M")) {
        return precio * 0.8;
    } else {
        return precio;
    }
    }

    public static void modificarArticulo(){
        String nombreArticulo = obtenerNombreArticulo();
        double precioArticulo = ObtenerPrecioArticulo(nombreArticulo);
        if (precioArticulo >= 150 && precioArticulo <= 250) {
            precioArticulo *= 1.02;
        } else if (precioArticulo >= 250 && precioArticulo <= 500) {
            precioArticulo *= 1.08;
        } else {
            precioArticulo *= 1.15;
        }

        System.out.println("Nuevo precio del articulo " + nombreArticulo + " es: " + precioArticulo);
    }


    public static void imprimirinventario () {
        System.out.println("Ingrese su Nombre");
        Scanner scanner = new Scanner(System.in);
        String usuario;
        usuario = scanner.next();
        System.out.println("Bienvenido " + usuario);
        String articuloExistente = obtenerNombreArticulo();
        System.out.println("Articulo existente: " + articuloExistente);
        System.out.println("Articulos registrados");
        for (String articulo: articulo){
            System.out.println(articulo);
        }
    }

    public static void main (String[]args){
        agregarArticulo();
        imprimirinventario();
    }
}










