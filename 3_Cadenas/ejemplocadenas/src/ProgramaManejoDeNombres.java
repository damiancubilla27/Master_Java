import java.util.Scanner;

public class ProgramaManejoDeNombres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer nombre: ");
        String primerNombre = scanner.nextLine();
        System.out.print("Ingrese el segundo nombre: ");
        String segundoNombre = scanner.nextLine();
        System.out.print("Ingrese el tercer nombre: ");
        String tercerNombre = scanner.nextLine();

        String primeraConca = String.valueOf(primerNombre.charAt(1));
        String primerConcaDos = primeraConca.toUpperCase().concat(".").concat(primerNombre.substring(primerNombre.length()-2));

        String segundaConca = String.valueOf(segundoNombre.charAt(1));
        String segundaConcaDos = segundaConca.toUpperCase().concat(".").concat(segundoNombre.substring(segundoNombre.length()-2));

        String terceraConca = String.valueOf(segundoNombre.charAt(1));
        String terceraConcaDos = terceraConca.toUpperCase().concat(".").concat(tercerNombre.substring(tercerNombre.length()-2));
        String guion = "_";
        System.out.println(primerConcaDos.concat(guion).concat(segundaConcaDos).concat(guion).concat(terceraConcaDos));
    }
}
