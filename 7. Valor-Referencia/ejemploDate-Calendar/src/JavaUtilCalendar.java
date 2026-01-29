import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class JavaUtilCalendar {
    public static void main(String[] args) {
        Calendar calendario = Calendar.getInstance();
        calendario.set(Calendar.YEAR, 2026);
        calendario.set(Calendar.MONTH, Calendar.JANUARY);
        calendario.set(Calendar.DAY_OF_MONTH, 29);
        //calendario.set(Calendar.HOUR_OF_DAY, 16);
        calendario.set(Calendar.HOUR, 4);
        calendario.set(Calendar.AM_PM, Calendar.PM);
        calendario.set(Calendar.MINUTE, 38);
        calendario.set(Calendar.SECOND, 10);
        calendario.set(Calendar.MILLISECOND, 125);

        Date fecha = calendario.getTime();
        System.out.println("calendario = " + fecha);

        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        String fechaConFormato = formato.format(fecha);
        System.out.println("fecha con formato= " + fechaConFormato);
    }
}
