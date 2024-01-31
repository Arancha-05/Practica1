public class Usuario{
    private String nombre;
    private String email;
    private String apellidos;

    public Usuario(String nombre, String apellidos, String email){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email = email;
    }

    public void mostrar(){
        System.out.println("Nombre: "  + nombre);
        System.out.println("Apellidos: " + apellidos);
        System.out.println("Email: " + email);
    }
}
