
package main.java.model.beans;


public class Trabajador {
    
    private int Id_Trabajador;
    private int Num_Trabajador;
    private String Nombre;
    private String Apellidos;
    private int Telefono;
    private int Id_categoria;
    private int Id_equipo;
    
    
    
    public Trabajador(){};

    public int getId_Trabajador() {
        return Id_Trabajador;
    }

    public void setId_Trabajador(int Id_Trabajador) {
        this.Id_Trabajador = Id_Trabajador;
    }

    public int getNum_Trabajador() {
        return Num_Trabajador;
    }

    public void setNum_Trabajador(int Num_Trabajador) {
        this.Num_Trabajador = Num_Trabajador;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public int getTelefono() {
        return Telefono;
    }

    public void setTelefono(int Telefono) {
        this.Telefono = Telefono;
    }

    public int getId_categoria() {
        return Id_categoria;
    }

    public void setId_categoria(int Id_categoria) {
        this.Id_categoria = Id_categoria;
    }

    public int getId_equipo() {
        return Id_equipo;
    }

    public void setId_equipo(int Id_equipo) {
        this.Id_equipo = Id_equipo;
    }
    
}
