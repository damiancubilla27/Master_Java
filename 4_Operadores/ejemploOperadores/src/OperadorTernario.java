public class OperadorTernario {
    public static void main(String[] args) {

        // varaible donde se guarda el resultado
        // condicion a evaluacion
        // ? (pasa saber cuales van a ser los posibles resultados)
        // resultado1
        // :
        // resultado2
        String variable = 5==5 ? "Si es verdadero" : "Es falso";
        System.out.println("Resultado: " + variable);

        double promedio = 4.31;
        String estado = promedio >= 5.0 ? "Esta aprobado" : "Desaprobado";
        System.out.println("El alumno esta: " + estado);

        int num1 = 3;
        int num2 = 5;
        int num3 = 1;
        int max = 0;
        max = (num1>num2) ? num1 : num2;
        max = (max>num3) ? max : num3;
        System.out.println(max);
    }
}
