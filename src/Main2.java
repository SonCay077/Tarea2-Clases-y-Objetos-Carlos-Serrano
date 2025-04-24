import java.util.Scanner;
public class Main2 {
    static class Empleado {
        String nombre;
        String cargo;
        double salario;
        String FechaIngreso;

        public Empleado(String nombre, String cargo, double salario, String FechaIngreso) {
            this.nombre = nombre;
            this.cargo = cargo;
            this.salario = salario;
            this.FechaIngreso = FechaIngreso;
        }

        public void Informacion() {
            System.out.println("/////////////////////////////////");
            System.out.println("Nombre: " + this.nombre);
            System.out.println("Cargo: " + this.cargo);
            System.out.println("Salario: " + this.salario);
            System.out.println("Fecha de Ingreso: " + this.FechaIngreso);
            System.out.println("/////////////////////////////////");
        }
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            Empleado emp1 = new Empleado("María Cardenas", "Contador", 900, "24/2/2025");
            Empleado emp2 = new Empleado("Rodrigo Nuñez", "Técnico", 1000, "12/4/2025");

            System.out.println("Ingrese los datos del tercer empleado: ");
            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();
            System.out.print("Cargo: ");
            String cargo = scanner.nextLine();
            System.out.print("Salario: ");
            double salario = scanner.nextDouble();
            scanner.nextLine();
            System.out.print("Fecha de Ingreso (dd/mm/aaaa): ");
            String FechaIngreso = scanner.nextLine();

            Empleado emp3 = new Empleado(nombre, cargo, salario, FechaIngreso);

            emp1.Informacion();
            emp2.Informacion();
            emp3.Informacion();

            scanner.close();
        }
    }
}