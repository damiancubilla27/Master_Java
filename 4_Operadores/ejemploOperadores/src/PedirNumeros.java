import java.util.Scanner;

public class PedirNumeros {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Ingrese numero Uno: ");
        int numeroUno = Integer.parseInt(s.nextLine());
        System.out.print("Ingrese numero Dos: ");
        int numeroDos = Integer.parseInt(s.nextLine());
        int max = (numeroUno > numeroDos) ? numeroUno : numeroDos;
        if (max == numeroUno){
            System.out.println(numeroUno + " - " + numeroDos);
        }else {
            System.out.println(numeroDos + " - " + numeroUno);
        }
    }
}
