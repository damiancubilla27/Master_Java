import java.util.Scanner;

public class MedidorGasolina {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Ingrese medida actual en litros del estanque: ");
        int numero = Integer.parseInt(s.nextLine());
        if(numero == 70){
            System.out.println("Estanque lleno");
        } else if (numero >= 60 && numero < 70) {
            System.out.println("Estanque casi lleno");
        } else if (numero >= 40 && numero < 60) {
            System.out.println("Estanque 3/4");
        } else if (numero >= 35 && numero < 40) {
            System.out.println("Medio Estanque");
        } else if (numero >= 20 && numero < 35) {
            System.out.println("Suficiente");
        } else if (numero >= 1 && numero < 20) {
            System.out.println("Insuficiente");
        }
    }
}
