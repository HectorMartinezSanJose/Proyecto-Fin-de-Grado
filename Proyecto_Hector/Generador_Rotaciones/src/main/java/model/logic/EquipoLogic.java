package main.java.model.logic;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import main.java.model.beans.Equipo;
import main.java.model.dao.EquipoDAO;

public class EquipoLogic extends Conexion implements EquipoDAO {

    PreparedStatement ps;
    ResultSet rs;

    @Override
    public int nombre_to_id(String nombre_equipo) {
        Connection conexion = getConnection();
        Equipo equipo = new Equipo();

        try {
            ps = conexion.prepareStatement("select id_equipo from equipo where nombre_equipo=?");
            ps.setString(1, nombre_equipo);
            rs = ps.executeQuery();
            if (rs.next()) {
                equipo.setId_equipo(rs.getInt("id_equipo"));

                return equipo.getId_equipo();
            } else {
                return 0;
            }
        } catch (Exception ex) {
            System.err.println("Error, " + ex);
            return 0;

        } finally {
            try {
                conexion.close();
            } catch (Exception ex) {
                System.err.println("Error, " + ex);
            }
        }
    }

    @Override
    public String id_to_nombre(int id_equipo) {
        Connection conexion = getConnection();
        Equipo equipo = new Equipo();
        try {
            ps = conexion.prepareStatement("select nombre_equipo from equipo where id_equipo=?");
            ps.setInt(1, id_equipo);
            rs = ps.executeQuery();
            if (rs.next()) {
                equipo.setNombre_equipo(rs.getString("nombre_equipo"));

                return equipo.getNombre_equipo();
            } else {
                return null;
            }
        } catch (Exception ex) {
            System.err.println("Error, " + ex);
            return null;

        } finally {
            try {
                conexion.close();
            } catch (Exception ex) {
                System.err.println("Error, " + ex);
            }
        }
    }

    @Override
    public int operariosXequipo(int id_equipo) {
        Connection conexion = getConnection();

        try {
            ps = conexion.prepareStatement("SELECT COUNT(id_trabajador) FROM trabajador WHERE equipo = ? and categoria = 1");

            ps.setInt(1, id_equipo);
            rs = ps.executeQuery();
            if (rs.next()) {
                int resultado = rs.getInt("COUNT(id_trabajador)");
                return resultado;
            } else {
                return 0;
            }
        } catch (SQLException ex) {
            Logger.getLogger(EquipoLogic.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        } finally {
            try {
                conexion.close();
            } catch (Exception ex) {
                System.err.println("Error, " + ex);
            }
        }
    }
}
