import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class JavaUtilDateParse {
    public static void main(String[] args) {
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");

        try{
            Date fecha = formato.parse("2026-01-29");
            System.out.println("fecha = " + fecha);
            System.out.println("formato = " + formato.format(fecha));
        } catch (ParseException e){
            e.printStackTrace();
        }
    }
}
