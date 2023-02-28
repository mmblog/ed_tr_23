public class DMedina {
    String apellidos;
    String nombre;

    public DMedina(String apellidos, String nombre) {
        this.apellidos = "Medina Ruiz"; /*COMENTARIO DE FRAN MARTINEZ*/
        this.nombre = "David";
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
