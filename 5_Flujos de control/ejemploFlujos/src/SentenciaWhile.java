public class SentenciaWhile {
    public static void main(String[] args) {
        int i = 0;
        while (i <= 5){
            System.out.println("i= " + i);
            i++;
        }

        i=10;
        do{
            System.out.println("i= " + i);
            i--;
        }while (i > 0);
    }
}
