import java.util.Scanner;

public class CuentaBancaria {
    private String titular;
    private double saldo;
    private Scanner sc = new Scanner(System.in);

    public CuentaBancaria() {
        System.out.print("Ingrese el nombre del titular: ");
        this.titular = sc.nextLine();
        System.out.print("Ingrese el saldo inicial: ");
        this.saldo = sc.nextDouble();
        System.out.println("Bienvenido " + titular);
    }

    private void menu() {
        int opcion = 0;
        while (opcion != 3) {
            System.out.println("1. Abonar");
            System.out.println("2. Retirar");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();

            if (opcion == 1) abonar();
            if (opcion == 2) retirar();
        }
    }

    private void abonar() {
        System.out.print("Cantidad a abonar: ");
        double cantidad = sc.nextDouble();
        if (cantidad > 0) {
            saldo += cantidad;
            System.out.println("Nuevo saldo: " + saldo);
        } else System.out.println("Cantidad inválida");
    }

    private void retirar() {
        System.out.print("Cantidad a retirar: ");
        double cantidad = sc.nextDouble();
        if (cantidad > 0 && cantidad <= saldo) {
            saldo -= cantidad;
            System.out.println("Nuevo saldo: " + saldo);
        } else System.out.println("Cantidad inválida");
    }

    public void iniciar() {
        menu();
    }
}