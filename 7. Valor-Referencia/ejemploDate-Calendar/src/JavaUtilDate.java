import java.text.SimpleDateFormat;
import java.util.Date;

public class JavaUtilDate {
    public static void main(String[] args) {
        Date fecha = new Date();
        System.out.println("fecha: " + fecha);

        SimpleDateFormat df = new SimpleDateFormat("dd MMMM, yyyy"); // con buscar SimpleDateFormat en internet
        String fechaString = df.format(fecha); // nos aparecera distintos tipos de formatos en el queremos
        System.out.println("fechaStr: " + fechaString); // imprimir el horario o fecha.
    }
}
