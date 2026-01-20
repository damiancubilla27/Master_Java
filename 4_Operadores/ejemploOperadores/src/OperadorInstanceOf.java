public class OperadorInstanceOf {
    public static void main(String[] args) {
        String texto = "Creando un String ";
        Integer numero = 7;
        boolean b1 = numero instanceof Integer; // InstanceOf nos sirve para saber de que tipo es la instancia
        boolean b2 = texto instanceof String;
        System.out.println(b1);
        System.out.println(b2);
    }
}