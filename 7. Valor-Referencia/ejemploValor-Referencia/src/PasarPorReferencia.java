public class PasarPorReferencia {
    public static void main(String[] args) {
        int[] edad = {10,11,12};
        System.out.println("Iniciamos el metodo main");
        for (int i = 0; i < edad.length; i++){
            System.out.println("edad[i] = " + edad[i]);
        }
        System.out.println("Antes de invocar al metodo test()");
        test(edad);
        System.out.println("Despues de llamar el metodo test()");
        for (int i = 0; i < edad.length; i++){
            System.out.println("edad[i] = " + edad[i]);
        }
        System.out.println("Finalizamos el metodo main");
    }

    public static void test(int[] edadesArray){
        System.out.println("Iniciamos el metodo test");
        for (int i = 0; i < edadesArray.length; i++){
            edadesArray[i] += 20;
        }
        System.out.println("Finalizamos el metodo test");
    }
}
