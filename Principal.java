import java.time.LocalDateTime;
import java.util.Scanner;
public class Principal{
    public static void main (String [] args){
        System.out.println("Hola mundo");
        Usuario[] u1 = new Usuario[dimensionGrupo()];
        fecha();
        for(int i = 0; i < u1.length;i++){
            u1[i]= pedirUsuario();
        }
        for(int i=0; i<u1.length;i++){
            mostrar(u1[i]);
        }
        
    }

    public static void fecha(){
    LocalDateTime date = LocalDateTime.now();
    System.out.println(date.getDayOfMonth() + "/" + date.getMonth() + "/" + date.getYear() + " " + date.getHour()+":"+date.getMinute());

    }
    public static Usuario pedirUsuario(){
        Scanner sc = new Scanner (System.in);
        String nombre;
        String apellidos;
        String email;
        Usuario nuevoUsuario;


        System.out.println("Introduce el nombre");
        nombre = sc.nextLine();
        System.out.println("Introduce los apellidos");
        apellidos = sc.nextLine();
        System.out.println("Introduce el email");
        email = sc.nextLine();

        return  new Usuario(nombre, apellidos, email);
    
    }
    //Dimensionar grupo
    public static  int dimensionGrupo(){
        Scanner sc = new Scanner (System.in);
        int dimension;
        System.out.println("Introduce la dimension del grupo");
        dimension = sc.nextInt();

        if ((dimension >= 5) && (dimension <= 30)){
            return dimension;
        }
        return 0;
    }
    //Metodo visualizacion
    public static void mostrar (Usuario u1){
        u1.mostrar();
    }

}
