package main.java.model.logic;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import main.java.model.beans.Usuario;
import main.java.model.dao.UsuarioDAO;
import static main.java.model.logic.Conexion.getConnection;

public class UsuarioLogic extends Conexion implements UsuarioDAO {

    PreparedStatement ps;
    ResultSet rs;

    //Metodo Buscar
    @Override
    public boolean buscar(Usuario usuario) {
        Connection conexion = getConnection();

        try {
            ps = conexion.prepareStatement("select * from usuario where alias=?");
            ps.setString(1, usuario.getAlias());
            rs = ps.executeQuery();

            if (rs.next()) {
                usuario.setId_Trabajador(rs.getInt("id_trabajador"));
                usuario.setAlias(rs.getString("alias"));
                usuario.setContrasena(rs.getString("contrasena"));
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
    public ArrayList<Usuario> listarUsuario() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean insertar(Usuario usuario) {
        Connection conexion = getConnection();
        int res = 0;
        try {
            ps = conexion.prepareStatement("select count(categoria) from trabajador where id_trabajador=? and categoria = 2");
            ps.setInt(1, usuario.getId_Trabajador());
            rs = ps.executeQuery();
            if (rs.next()) {
                res = rs.getInt("count(categoria)");
            }
            if (res != 0) {//Validamos que hay una id_trabajador es coodinador.
                ps = conexion.prepareStatement("insert into usuario (id_trabajador,alias,contrasena) values (?,?,?)");
                ps.setInt(1, usuario.getId_Trabajador());
                ps.setString(2, usuario.getAlias());
                ps.setString(3, usuario.getContrasena());

                int resultado = ps.executeUpdate();
                if (resultado > 0) {
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
    public boolean modificarContrasena(Usuario usuario) {
        Connection conexion = getConnection();

        try {
            ps = conexion.prepareStatement("update usuario set contrasena=? where id_trabajador=?");
            ps.setString(1, usuario.getContrasena());
            ps.setInt(2, usuario.getId_Trabajador());
            ps.executeUpdate();

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

}
