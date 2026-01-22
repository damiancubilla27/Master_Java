public class SentenciaIfElse {
    public static void main(String[] args) {
        float promedio = 4.0f;
        if (promedio >= 6.5){
            System.out.println("Felicitaciones aprobaste!");
        } else if (promedio >= 6.0) {
            System.out.println("Necesitas estudiar un poco mas!");
        } else if (promedio >= 5.0) {
            System.out.println("Vamos tenes que ponerte las pilas!");
        }else {
            System.out.println("Insuficiente, deberas de recursar la materia!");
        }
        System.out.println("Tu promedio es: " + promedio);
    }
}
