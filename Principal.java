import java.time.LocalDateTime;
public class Principal{
    public static void main (String [] args){
        System.out.println("Hola mundo");
        fecha();
    }

    public static void fecha(){
    LocalDateTime date = LocalDateTime.now();
    System.out.println(date.getDayOfMonth() + "/" + date.getMonth() + "/" + date.getYear() + " " + date.getHour()+":"+date.getMinute());

    }
}
