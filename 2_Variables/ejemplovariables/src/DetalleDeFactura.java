import java.util.Scanner;

public class DetalleDeFactura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese nombre factura: ");
        String nombreFactura = scanner.nextLine();

        System.out.print("Ingrese primer precio: ");
        double numeroUno = Double.parseDouble(scanner.nextLine());
        System.out.print("Ingrese segundo precio: ");
        double numeroDos = Double.parseDouble(scanner.nextLine());
        double suma = numeroUno + numeroDos;
        double impuesto = (suma*19)/100;
        double total = suma + impuesto;
        System.out.println("La factura producto: " + nombreFactura + " - tiene un total bruto de " + suma + ", con un impuesto de " + impuesto + " y el monto después de impuesto es de " + total);
    }
}
