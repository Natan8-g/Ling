
package basededatoscont;


public class cont {
    private int tele;
    private String nombre, correo;

    public cont(int telefono, String nombre, String correo) {
        this.tele = telefono;
        this.nombre = nombre;
        this.correo = correo;
    }
    public int getTelefono() {
        return tele;
    }
    public String getNombre() {
        return nombre;
    }
    public String getCorreo() {
        return correo;
    }
    public void setTelefono(int telefono) {
        this.tele = telefono;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }
}
