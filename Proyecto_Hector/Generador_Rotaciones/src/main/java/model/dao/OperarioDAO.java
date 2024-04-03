package main.java.model.dao;

import main.java.model.beans.Operario;
import main.java.model.beans.Trabajador;

public interface OperarioDAO {

    boolean insertar(Trabajador trabajador);

    boolean buscar(Operario operario);

    boolean buscarConId(Operario operario);

    boolean buscarConTelefono(Operario operario);

    boolean modificar(Trabajador trabajador);

    boolean borrar(Operario operario);

    int num_trabajador_to_id(int num_trabajador);

}
