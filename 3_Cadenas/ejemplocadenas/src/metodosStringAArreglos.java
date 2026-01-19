public class metodosStringAArreglos {
    public static void main(String[] args) {
        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas.toCharArray(): " + trabalenguas.toCharArray());

        char[] arreglo = trabalenguas.toCharArray();
        int cantidad = arreglo.length;
        for(int i = 0; i < cantidad; i++){
            System.out.println("arreglo: " + i + " letra: " + arreglo[i]);
        }
    }
}