class Persona{
    private String nombre;

    public void modificarNombre(String nombre){
        this.nombre = nombre;
    }
    public String leerNombre(){
        return this.nombre;
    }
}

public class PasarPorReferenciaDos {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.modificarNombre("Damian");
        System.out.println("Iniciamos el metodo main");
        System.out.println("persona.nombre = " + persona.leerNombre());
        System.out.println("Antes de invocar al metodo test()");
        test(persona);
        System.out.println("Despues de llamar el metodo test()");
        System.out.println("persona.nombre = " + persona.leerNombre());
        System.out.println("Finalizamos el metodo main");
    }

    public static void test(Persona persona){
        System.out.println("Iniciamos el metodo test");
        persona.modificarNombre("Francisco");
        System.out.println("Finalizamos el metodo test");
    }
}
