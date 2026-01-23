public class AutoboxingInteger {
    public static void main(String[] args) {
        Integer[] numeros = {1,2,3,4,5,6,7,8,9,10};
        int suma = 0;
        for(Integer i : numeros){
            if(i.intValue() % 2 == 0){ // el intValue() retorna el valor de obajeto en primitivo
                System.out.println("Es un numero par: " + i);
                suma += i.intValue();
            }
        }
        System.out.println("Suma: " + suma);
    }
}
