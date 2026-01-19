public class concatenandoCadenas {
    public static void main(String[] args) {
        String cadena = "Hola";
        String cadenaDos = "Mundo";
        String concatenando = cadena + cadenaDos;
        System.out.println(concatenando);

        boolean comparacion = cadena.equals(cadenaDos);
        System.out.println(comparacion);

        String cadenaTres = " ";
        String completo = cadena.concat(cadenaTres).concat(cadenaDos);
        System.out.println(completo);

    }
}
