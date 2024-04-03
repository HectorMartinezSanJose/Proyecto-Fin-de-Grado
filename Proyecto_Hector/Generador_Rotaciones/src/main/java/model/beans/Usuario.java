
package main.java.model.beans;


public class Usuario extends Trabajador{
    
    private String  Alias;
    private String Contrasena;

    public Usuario() {}

    public String getAlias() {
        return Alias;
    }

    public void setAlias(String Alias) {
        this.Alias = Alias;
    }

    public String getContrasena() {
        return Contrasena;
    }

    public void setContrasena(String Contrasena) {
        this.Contrasena = Contrasena;
    }

    
    
}
