public class ejercicio3 {
    public static void main(String[] args) {
        new Mensajes();
        new Mensajes("Breaking Bad");
        new Mensajes("Bohemian Rhapsody", 1);
        new Mensajes("Jugar videojuegos", 1.5);

        Datos d = new Datos();
        d.setNombre("Juan Perez");
        d.setCarne("A00123");

        System.out.println(d.getNombre() + " " + d.getCarne());
    }
}