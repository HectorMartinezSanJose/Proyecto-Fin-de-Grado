package main.java.model.dao;

public interface EquipoDAO {

    int nombre_to_id(String nombre_equipo);

    String id_to_nombre(int id_equipo);

    int operariosXequipo(int id_equipo);

}
