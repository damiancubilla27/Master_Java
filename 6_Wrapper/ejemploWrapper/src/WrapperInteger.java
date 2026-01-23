public class WrapperInteger {
    public static void main(String[] args) {
        Integer intObjeto = Integer.valueOf(3245); // Forma de dar valor a un objeto integer
        Integer intObjeto2 = 3245; // la forma mas simple
        System.out.println(intObjeto2);

        int num = intObjeto.intValue(); // pasar de un objeto integer a un int primitivo
        int num2 = intObjeto2; // la forma mas simple
        System.out.println(intObjeto2);

        String valorTv = "128";
        Integer precioObjeto = Integer.valueOf(valorTv); // Otra forma de pasar un string a un objeto Integer
        System.out.println(precioObjeto);

        Short precioShortObj = precioObjeto.shortValue(); // Otra forma de pasar de Integer a Short
        System.out.println(precioShortObj);

    }
}
