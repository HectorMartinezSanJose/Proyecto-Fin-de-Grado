package main.java.model.dao;

import java.sql.Date;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import main.java.model.beans.Rotacion;

public interface RotacionDAO {

    boolean generarRotacion(Rotacion rotacion);

    boolean insertar(Rotacion rotacion);

    boolean compararColecciones(List<Integer> lista1, List<Integer> lista2);

    void ListarRotaciones(Date fecha, int equipo, DefaultTableModel listadoRotaciones);

}
