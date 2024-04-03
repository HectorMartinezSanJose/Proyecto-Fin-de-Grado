package main.java.model.logic;

import main.java.model.beans.Rotacion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import main.java.model.dao.RotacionDAO;

public class RotacionLogic extends Conexion implements RotacionDAO {

    PreparedStatement ps;
    ResultSet rs;

    //Metodo GENERAR R1
    @Override
    public boolean generarRotacion(Rotacion rotacion) {
        Connection conexion = getConnection();

        try {

            //GENERAR P1
            ps = conexion.prepareStatement("SELECT t.num_trabajador FROM trabajador t JOIN operario o ON t.id_trabajador = o.id_operario WHERE o.p1 = true and t.equipo = ?;");
            ps.setInt(1, rotacion.getId_equipo());
            rs = ps.executeQuery();
            List<Integer> P1List = new ArrayList<>();
            while (rs.next()) {
                P1List.add(rs.getInt("num_trabajador")); //Array con la lista de num_Operario que saben p1
            }
            Collections.shuffle(P1List);
            rotacion.setP1(P1List.get(0));

            //GENERAR P2
            ps = conexion.prepareStatement("SELECT t.num_trabajador FROM trabajador t JOIN operario o ON t.id_trabajador = o.id_operario WHERE o.p2 = true and t.equipo = ? and t.num_trabajador !=?;");
            ps.setInt(1, rotacion.getId_equipo());
            ps.setInt(2, rotacion.getP1());
            rs = ps.executeQuery();
            List<Integer> P2List = new ArrayList<>();
            while (rs.next()) {
                P2List.add(rs.getInt("num_trabajador")); //Array con la lista de num_Operario que saben p2
            }
            Collections.shuffle(P2List);

            rotacion.setP2(P2List.get(0));

            //GENERAR P3
            ps = conexion.prepareStatement("SELECT t.num_trabajador FROM trabajador t JOIN operario o ON t.id_trabajador = o.id_operario WHERE o.p3 = true and t.equipo = ? and t.num_trabajador !=? and t.num_trabajador !=?;");
            ps.setInt(1, rotacion.getId_equipo());
            ps.setInt(2, rotacion.getP1());
            ps.setInt(3, rotacion.getP2());
            rs = ps.executeQuery();
            List<Integer> P3List = new ArrayList<>();
            while (rs.next()) {
                P3List.add(rs.getInt("num_trabajador")); //Array con la lista de num_Operario que saben p3
            }
            Collections.shuffle(P3List);

            rotacion.setP3(P3List.get(0));

            //GENERAR P4
            ps = conexion.prepareStatement("SELECT t.num_trabajador FROM trabajador t JOIN operario o ON t.id_trabajador = o.id_operario WHERE o.p4 = true and t.equipo = ? and t.num_trabajador !=? and t.num_trabajador !=? and t.num_trabajador !=?;");
            ps.setInt(1, rotacion.getId_equipo());
            ps.setInt(2, rotacion.getP1());
            ps.setInt(3, rotacion.getP2());
            ps.setInt(4, rotacion.getP3());
            rs = ps.executeQuery();
            List<Integer> P4List = new ArrayList<>();
            while (rs.next()) {
                P4List.add(rs.getInt("num_trabajador")); //Array con la lista de num_Operario que saben p4
            }
            Collections.shuffle(P4List);
            if (P4List.size() != 0) { //Validamos que la lista contiene el elemento.
                rotacion.setP4(P4List.get(0));

                //GENERAR P5
                ps = conexion.prepareStatement("SELECT t.num_trabajador FROM trabajador t JOIN operario o ON t.id_trabajador = o.id_operario WHERE o.p5 = true and t.equipo = ? and t.num_trabajador !=? and t.num_trabajador !=? and t.num_trabajador !=? and t.num_trabajador !=?;");
                ps.setInt(1, rotacion.getId_equipo());
                ps.setInt(2, rotacion.getP1());
                ps.setInt(3, rotacion.getP2());
                ps.setInt(4, rotacion.getP3());
                ps.setInt(5, rotacion.getP4());
                rs = ps.executeQuery();
                List<Integer> P5List = new ArrayList<>();
                while (rs.next()) {
                    P5List.add(rs.getInt("num_trabajador")); //Array con la lista de num_Operario que saben p4
                }

                Collections.shuffle(P5List);
                if (P5List.size() != 0) { //Validamos que la lista contiene el elemento.
                    rotacion.setP5(P5List.get(0));
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }

        } catch (Exception ex) {
            System.err.println("Error, " + ex);
            return false;

        } finally {
            try {
                conexion.close();
            } catch (Exception ex) {
                System.err.println("Error, " + ex);
            }
        }
    }

    @Override
    public boolean insertar(Rotacion rotacion) {
        Connection conexion = getConnection();

        try {
            //Insertar datos
            ps = conexion.prepareStatement("insert into rotacion (num_rotacion,id_equipo,fecha,coordinador,p1,p2,p3,p4,p5) values (?,?,?,?,?,?,?,?,?)");
            ps.setInt(1, rotacion.getNum_rotacion());
            ps.setInt(2, rotacion.getId_equipo());
            ps.setDate(3, (java.sql.Date) rotacion.getFecha());
            ps.setInt(4, rotacion.getId_coordinador());
            ps.setInt(5, rotacion.getP1());
            ps.setInt(6, rotacion.getP2());
            ps.setInt(7, rotacion.getP3());
            ps.setInt(8, rotacion.getP4());
            ps.setInt(9, rotacion.getP5());
            int resultado = ps.executeUpdate();

            if (resultado > 0) {
                return true;
            } else {
                return false;
            }

        } catch (Exception ex) {
            System.err.println("Error, " + ex);
            return false;

        } finally {
            try {
                conexion.close();
            } catch (Exception ex) {
                System.err.println("Error, " + ex);
            }
        }
    }

    @Override
    public boolean compararColecciones(List<Integer> lista1, List<Integer> lista2) {
        boolean elementosIguales = false;
        for (int i = 0; i < lista1.size(); i++) {
            // Utiliza el método equals para comparar los elementos en la misma posición
            if (lista1.get(i).equals(lista2.get(i))) {
                elementosIguales = true;// Si encuentra elementos diferentes, las listas no son iguales
            }
        }
        if (!elementosIguales) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public void ListarRotaciones(Date fecha, int equipo, DefaultTableModel listadoRotaciones) {
        Connection conexion = getConnection();
        Object[] registros = new Object[9];
        try {
            ps = conexion.prepareStatement("SELECT num_rotacion, id_equipo, fecha, coordinador, p1, p2, p3, p4, p5 FROM rotacion WHERE id_equipo =? AND fecha =?");
            ps.setInt(1, equipo);
            ps.setDate(2, fecha);
            rs = ps.executeQuery();
            while (rs.next()) {
                registros[0] = rs.getInt("num_rotacion");
                registros[1] = rs.getInt("id_equipo");
                registros[2] = rs.getDate("fecha");
                registros[3] = rs.getInt("coordinador");
                registros[4] = rs.getInt("p1");
                registros[5] = rs.getInt("p2");
                registros[6] = rs.getInt("p3");
                registros[7] = rs.getInt("p4");
                registros[8] = rs.getInt("p5");
                listadoRotaciones.addRow(registros);
            }
        } catch (SQLException ex) {
            Logger.getLogger(RotacionLogic.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
