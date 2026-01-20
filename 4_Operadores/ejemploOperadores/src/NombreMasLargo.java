import java.util.Scanner;

public class NombreMasLargo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Ingrese Nombre y Apellido: ");
        String nombreUno = s.nextLine();
        System.out.print("Ingrese Nombre y Apellido: ");
        String nombreDos = s.nextLine();
        System.out.print("Ingrese Nombre y Apellido: ");
        String nombreTres = s.nextLine();

        String masLargo = nombreUno.length() > nombreDos.length() ? nombreUno : nombreDos;
        masLargo = masLargo.length() > nombreTres.length() ? masLargo : nombreTres;
        System.out.println(masLargo + " tiene el nombre mas largo.");
    }
}
