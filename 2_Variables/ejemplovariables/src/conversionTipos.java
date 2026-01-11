public class conversionTipos {
    public static void main(String[] args) {
        // Convertir de tipo string a otro tipo (int, double, byte, long, char)
        String numeroString = "50";
        int numeroEntero =  Integer.parseInt(numeroString);
        System.out.println(numeroEntero);

        // La inversa, convertir de tipo primitivos a string
        float numeroFlotante = 3.14f;
        String cadenaFlotante = Float.toString(numeroFlotante);
        System.out.println(cadenaFlotante);

        // Convertir de un primitivo a primitivo
        int i = 1000;
        long numeroLong= (long)i; // casteo
        System.out.println(numeroLong); // El casteo solamente se puede hacer entre tipos numericos
    }
}
