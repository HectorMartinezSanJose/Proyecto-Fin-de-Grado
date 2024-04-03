/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.java.model.logic;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import main.java.model.beans.Categoria;
import main.java.model.dao.CategoriaDAO;
import static main.java.model.logic.Conexion.getConnection;

/**
 *
 * @author Hector
 */
public class CategoriaLogic extends Conexion implements CategoriaDAO {

    PreparedStatement ps;
    ResultSet rs;

    @Override
    public int nombre_to_id(String nombre_categoria) {
        Connection conexion = getConnection();
        Categoria categoria = new Categoria();

        try {
            ps = conexion.prepareStatement("select id_categoria from categoria where nombre_categoria=?");
            ps.setString(1, nombre_categoria);
            rs = ps.executeQuery();
            if (rs.next()) {
                categoria.setId_categoria(rs.getInt("id_categoria"));

                return categoria.getId_categoria();
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
    public String id_to_nombre(int id_categoria) {
        Connection conexion = getConnection();
        Categoria categoria = new Categoria();

        try {
            ps = conexion.prepareStatement("select nombre_categoria from categoria where id_categoria=?");
            ps.setInt(1, id_categoria);
            rs = ps.executeQuery();
            if (rs.next()) {
                categoria.setNombre_categoria(rs.getString("nombre_categoria"));

                return categoria.getNombre_categoria();
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

}
