import java.util.Scanner;

public class Producto {
    private String nombre;
    private double precio;
    private int cantidad;
    private Scanner sc = new Scanner(System.in);

    public Producto(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        System.out.println("Bienvenido al sistema de productos");
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    private void modificarDatos() {
        int opcion = 0;
        while (opcion != 4) {
            System.out.println("1. Modificar nombre");
            System.out.println("2. Modificar precio");
            System.out.println("3. Modificar cantidad");
            System.out.println("4. Regresar");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            if (opcion == 1) {
                System.out.print("Nuevo nombre: ");
                nombre = sc.nextLine();
            }

            if (opcion == 2) {
                System.out.print("Nuevo precio: ");
                double p = sc.nextDouble();
                if (p >= 0) precio = p;
                else System.out.println("Valor inválido");
            }

            if (opcion == 3) {
                System.out.print("Nueva cantidad: ");
                int c = sc.nextInt();
                if (c >= 0) cantidad = c;
                else System.out.println("Valor inválido");
            }
        }
    }

    private void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: " + precio);
        System.out.println("Cantidad: " + cantidad);
    }

    public void iniciar() {
        int opcion = 0;
        while (opcion != 3) {
            System.out.println("1. Modificar datos del producto");
            System.out.println("2. Mostrar datos del producto");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            if (opcion == 1) modificarDatos();
            if (opcion == 2) mostrarDatos();
        }
    }
}