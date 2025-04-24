import java.util.Scanner;
public class Main {
    static class Jugador {
        String nombre;
        String posicion;
        int edad;
        int numCamiseta;

        public Jugador(String nombre, String posicion, int edad, int numCamiseta) {
            this.nombre = nombre;
            this.posicion = posicion;
            this.edad = edad;
            this.numCamiseta = numCamiseta;
        }

        public void Informacion() {
            System.out.println("///////////////////////////////");
            System.out.println("Nombre: " + nombre);
            System.out.println("Posicion: " + posicion);
            System.out.println("Edad: " + edad);
            System.out.println("NumCamiseta: " + numCamiseta);
            System.out.println("Holas");
            System.out.println("///////////////////////////////");
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Ingrese los datos del primer jugador: ");
            System.out.println("Nombre: ");
            String nombre = scanner.nextLine();
            System.out.println("Posicion: ");
            String posicion = scanner.nextLine();
            System.out.println("Edad: ");
            int edad = scanner.nextInt();
            System.out.println("NumCamiseta: ");
            int numCamiseta = scanner.nextInt();

            Jugador jug1 = new Jugador(nombre, posicion, edad, numCamiseta);

            Jugador jug2 = new Jugador("Ricardo Pérez", "Delantero", 25, 9);
            Jugador jug3 = new Jugador("Javier López", "Defensa", 27, 5);

            jug1.Informacion();
            jug2.Informacion();
            jug3.Informacion();

            scanner.close();
        }
    }
}