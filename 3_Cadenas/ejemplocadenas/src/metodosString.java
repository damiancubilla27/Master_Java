public class metodosString {
    public static void main(String[] args) {
        String nombre = "Damian";
        System.out.println("nombre.lenght(): " + nombre.length()); //longitud de cadena
        System.out.println("nombre.toUpperCase(): " + nombre.toUpperCase()); //mayuscula
        System.out.println("nombre.toLowerCase(): " + nombre.toLowerCase());//minuscula
        System.out.println("nombre.equals(\"Damian\"): " + nombre.equals("Damian")); //compara cadenas
        System.out.println("nombre.equals(\"damian\"): " + nombre.equals("damian"));
        System.out.println("nombre.equalsIgnoreCase(\"damian\"): " + nombre.equalsIgnoreCase("damian")); //compara cadenas pero ignoras las mayusculas y minusculas
        System.out.println("nombre.charAt(0): " + nombre.charAt(0)); //indice del caracter
        System.out.println("nombre.substring(2): " + nombre.substring(2)); //busca desde que indice indicado hasta el final

        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas.replace(\"a\",\".\"): " + trabalenguas.replace("a", ".")); //reemplaza caracteres
        System.out.println("trabalenguas.indexOf(\'a\'): " + trabalenguas.indexOf('a'));//Primera aparicion de el caracater indicado
        System.out.println("trabalenguas.lastIndexOf(\'a\'): " + trabalenguas.lastIndexOf('a'));// Ultima aparicion de el caracter indicado
        System.out.println("trabalenguas.contains(\"t\"): " + trabalenguas.contains("t")); //Para saber si contiene cierto texto en la cadena de texto
        System.out.println("trabalenguas.startsWith(\"lenguas\"): " + trabalenguas.startsWith("lenguas")); // Para saber si comienza con el argumento pasado
        System.out.println("trabalenguas.endsWith(\"lenguas\"): " + trabalenguas.endsWith("lenguas")); // Para saber si termina con el argumento pasado
        System.out.println("     Aguante River    ".trim()); // Para sacar los espacios en la cadena

    }
}
