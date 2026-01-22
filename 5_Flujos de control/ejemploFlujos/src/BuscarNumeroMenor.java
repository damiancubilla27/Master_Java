import java.util.Scanner;

public class BuscarNumeroMenor {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] numeros = new int[10];
        int numeroMenor = 0;
        for (int i = 0; i < 10 ; i++){
            System.out.print("Ingrese numero: ");
            numeros[i] = s.nextInt();
        }
        for (int j = 0; j < 10; j++){
            if(j == 0 || numeroMenor > numeros[j])
            {
                numeroMenor = numeros[j];
            }
        }
        System.out.println("El numero menor ingresado es: " + numeroMenor);
        if(numeroMenor < 10){
            System.out.println( "El número menor es menor que 10!");
        }else{
            System.out.println( "El numero menor es igual o mayor que 10!");
        }
    }
}
