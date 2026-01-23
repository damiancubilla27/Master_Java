import java.util.Scanner;

public class SistemaNotas {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double[] numeros = new double[20];
        double sumaCinco = 0;
        double sumaCuatro = 0;
        int contadorCinco = 0;
        int contadorCuatro = 0;
        int contadorUno = 0;
        double sumaTotal = 0;
        double promedioTotal = 0;
        double promedioCinco = 0;
        double promedioCuatro = 0;
        boolean bandera = false;
        for(int i = 0; i < 20; i++){
            System.out.println("Ingrese nota del 1.0 al 7.0 : ");
            numeros[i] = s.nextDouble();
            if(numeros[i] == 0){
                bandera = true;
                break;
            }
            sumaTotal += numeros[i];
            if(numeros[i] > 5){
                sumaCinco += numeros[i];
                contadorCinco++;
            } else if (numeros[i] == 1) {
                contadorUno++;
            } else if (numeros[i] < 4) {
                sumaCuatro += numeros[i];
                contadorCuatro++;
            }
        }
        if (!bandera)
        {
            promedioTotal = sumaTotal / 20 ;
            System.out.println("1. El promedio total de las notas es: " + promedioTotal);
            promedioCinco = sumaCinco / contadorCinco;
            System.out.println("2. El promedio de las notas mayores a 5 es: " + promedioCinco);
            promedioCuatro = sumaCuatro / contadorCuatro;
            System.out.println("3. El promedio de las notas menores a 4 es: " + promedioCuatro);
            System.out.println("4. La cantidad de notas 1 es de: " + contadorUno);
        }else {
            System.out.println("Error, se ingreso un 0. Programa finalizado!");
        }
    }
}