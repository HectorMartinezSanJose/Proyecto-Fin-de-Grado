package main.java.model.dao;

public interface CategoriaDAO {

    int nombre_to_id(String nombre_categoria);

    String id_to_nombre(int id_categoria);

}
