import java.util.Scanner;

public class utilizandoTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        String numeroCadena = scanner.nextLine(); // con .nextInt() tambien puedo tomar el entero
        int numeroIngresado = Integer.parseInt(numeroCadena);
        System.out.println(numeroIngresado);
    }
}
