import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class CalcularEdad {
    public static void main(String[] args) {

        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
        Scanner s = new Scanner(System.in);

        System.out.println("Ingrese año, mes y día de nacimiento (yyyy-MM-dd): ");
        String fechaIngresada = s.nextLine();

        try {
            Date fechaNacimiento = formato.parse(fechaIngresada);
            Date fechaActual = new Date();

            long milisegundosNacimiento = fechaNacimiento.getTime();
            long milisegundosActual = fechaActual.getTime();

            long diferencia = milisegundosActual - milisegundosNacimiento;

            // milisegundos en un año
            double milisegundosPorAnio = 1000.0 * 60 * 60 * 24 * 365.25;

            int edad = (int) (diferencia / milisegundosPorAnio);

            System.out.println("Edad: " + edad + " años");

        } catch (ParseException e) {
            System.out.println("Formato de fecha incorrecto");
        }
    }
}
