public class primitivosconpunto {
    public static void main(String[] args) {
        float numeroreal = 1.0f;//1000e3f mueve el punto tres posiciones a la derecha
        System.out.println(numeroreal);
        float numeroComa = 0000001e-3f; // mueve el punto a la izquierda
        System.out.println(numeroComa);
        System.out.println("Valor maximo de un float: " + Float.MAX_VALUE); // maximo de un float
        System.out.println("Valor minimo de un float: " + Float.MIN_VALUE); // minimo de un float

        double realDouble = 3.14243234d;
        System.out.println("Valor maximo de un double: " + Double.MAX_VALUE); // maximo de un double
        System.out.println("Valor minimo de un double: " + Double.MIN_VALUE); // minimo de un double
    }
}
