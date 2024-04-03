package main.java.model.logic;

import java.sql.Statement;
import main.java.model.beans.Trabajador;
import main.java.model.beans.Operario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import main.java.model.dao.OperarioDAO;

/*   Metodos
    -insetar
    -insetarC
    -buscar
    -modificar
    -modificarC
    -borrar
 */
public class OperarioLogic extends Conexion implements OperarioDAO {

    PreparedStatement ps;
    ResultSet rs;

    //Metodo Insertar trabajador
    @Override
    public boolean insertar(Trabajador trabajador) {
        Connection conexion = getConnection();

        try {
            //Insertar datos en la tabla trabajador
            ps = conexion.prepareStatement("insert into trabajador (num_trabajador,nombre,apellidos,telefono,categoria,equipo) values (?,?,?,?,?,?)", Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, trabajador.getNum_Trabajador());
            ps.setString(2, trabajador.getNombre());
            ps.setString(3, trabajador.getApellidos());
            ps.setInt(4, trabajador.getTelefono());
            ps.setInt(5, trabajador.getId_categoria());
            ps.setInt(6, trabajador.getId_equipo());
            int resultado = ps.executeUpdate();

            //Obtener el id del trabajador insertado
            ResultSet keysGeneradas = ps.getGeneratedKeys();
            if (1 == trabajador.getId_categoria()) { //Validamos si es operario id_categoria: 1
                if (keysGeneradas.next()) {
                    int id_trabajador = keysGeneradas.getInt(1);

                    //Casting a operario
                    Operario operario = (Operario) trabajador;

                    //Insertar datos en la tabla operario
                    ps = conexion.prepareStatement("insert into operario (id_operario,p1,p2,p3,p4,p5) values (?,?,?,?,?,?)");
                    ps.setInt(1, id_trabajador);
                    ps.setBoolean(2, operario.getP1());
                    ps.setBoolean(3, operario.getP2());
                    ps.setBoolean(4, operario.getP3());
                    ps.setBoolean(5, operario.getP4());
                    ps.setBoolean(6, operario.getP5());
                    ps.executeUpdate();
                }
            }
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

    //Metodo Buscar
    @Override
    public boolean buscar(Operario operario) {
        Connection conexion = getConnection();

        try {
            ps = conexion.prepareStatement("SELECT * FROM trabajador JOIN operario ON trabajador.id_trabajador=operario.id_operario WHERE trabajador.num_trabajador = ?");
            ps.setInt(1, operario.getNum_Trabajador());
            rs = ps.executeQuery();

            if (rs.next()) {
                operario.setId_Trabajador(rs.getInt("id_trabajador"));
                operario.setNum_Trabajador(rs.getInt("num_trabajador"));
                operario.setNombre(rs.getString("nombre"));
                operario.setApellidos(rs.getString("apellidos"));
                operario.setTelefono(rs.getInt("telefono"));
                operario.setId_categoria(rs.getInt("categoria"));
                operario.setId_equipo(rs.getInt("equipo"));
                operario.setP1(rs.getBoolean("p1"));
                operario.setP2(rs.getBoolean("p2"));
                operario.setP3(rs.getBoolean("p3"));
                operario.setP4(rs.getBoolean("p4"));
                operario.setP5(rs.getBoolean("p5"));

                return true;
            } else {
                ps = conexion.prepareStatement("SELECT * FROM trabajador WHERE num_trabajador = ?");
                ps.setInt(1, operario.getNum_Trabajador());
                rs = ps.executeQuery();

                if (rs.next()) {
                    operario.setId_Trabajador(rs.getInt("id_trabajador"));
                    operario.setNum_Trabajador(rs.getInt("num_trabajador"));
                    operario.setNombre(rs.getString("nombre"));
                    operario.setApellidos(rs.getString("apellidos"));
                    operario.setTelefono(rs.getInt("telefono"));
                    operario.setId_categoria(rs.getInt("categoria"));
                    operario.setId_equipo(rs.getInt("equipo"));
                    return true;
                } else {
                    return false;
                }
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

    //Metodo Modificar
    @Override
    public boolean modificar(Trabajador trabajador) {
        Connection conexion = getConnection();

        try {
            //Update datos en la tabla trabajador
            ps = conexion.prepareStatement("update trabajador set num_trabajador=?,nombre=?,apellidos=?,telefono=?,categoria=?,equipo=? where num_trabajador=?");
            ps.setInt(1, trabajador.getNum_Trabajador());
            ps.setString(2, trabajador.getNombre());
            ps.setString(3, trabajador.getApellidos());
            ps.setInt(4, trabajador.getTelefono());
            ps.setInt(5, trabajador.getId_categoria());
            ps.setInt(6, trabajador.getId_equipo());
            ps.setInt(7, trabajador.getNum_Trabajador());
            ps.executeUpdate();

            if (1 == trabajador.getId_categoria()) { //Validamos si es operario id_categoria: 1
                ps = conexion.prepareStatement("select * from operario where id_operario=?");
                ps.setInt(1, trabajador.getId_Trabajador());
                rs = ps.executeQuery();
                //Casting a operario
                Operario operario = (Operario) trabajador;
                if (rs.next()) {//Validamos si existe el operario
                    //Update datos en la tabla operario
                    ps = conexion.prepareStatement("update operario set p1=?,p2=?,p3=?,p4=?,p5=? where id_operario=?");
                    ps.setBoolean(1, operario.getP1());
                    ps.setBoolean(2, operario.getP2());
                    ps.setBoolean(3, operario.getP3());
                    ps.setBoolean(4, operario.getP4());
                    ps.setBoolean(5, operario.getP5());
                    ps.setInt(6, operario.getId_Trabajador());
                } else {
                    //Si no existe lo creamos
                    ps = conexion.prepareStatement("insert into operario (id_operario,p1,p2,p3,p4,p5) values (?,?,?,?,?,?)");
                    ps.setInt(1, trabajador.getId_Trabajador());
                    ps.setBoolean(2, operario.getP1());
                    ps.setBoolean(3, operario.getP2());
                    ps.setBoolean(4, operario.getP3());
                    ps.setBoolean(5, operario.getP4());
                    ps.setBoolean(6, operario.getP5());
                }
            }
            if (2 == trabajador.getId_categoria()) { //Validamos si es coordinador id_categoria: 2

                //Update datos en la tabla operario(lo eliminamos por que deja de ser un operario)
                ps = conexion.prepareStatement("delete from operario where id_operario=?");
                ps.setInt(1, trabajador.getId_Trabajador());
            }

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

    //Metodo Borrar
    @Override
    public boolean borrar(Operario operario) {
        Connection conexion = getConnection();

        try {
            ps = conexion.prepareStatement("delete from trabajador where id_trabajador=?");
            ps.setInt(1, operario.getId_Trabajador());
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
    public boolean buscarConId(Operario operario) {
        Connection conexion = getConnection();
        try {
            ps = conexion.prepareStatement("SELECT * FROM trabajador WHERE id_trabajador = ?");
            ps.setInt(1, operario.getId_Trabajador());
            rs = ps.executeQuery();

            if (rs.next()) {
                operario.setId_Trabajador(rs.getInt("id_trabajador"));
                operario.setNum_Trabajador(rs.getInt("num_trabajador"));
                operario.setNombre(rs.getString("nombre"));
                operario.setApellidos(rs.getString("apellidos"));
                operario.setTelefono(rs.getInt("telefono"));
                operario.setId_categoria(rs.getInt("categoria"));
                operario.setId_equipo(rs.getInt("equipo"));
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
    public boolean buscarConTelefono(Operario operario) {
        Connection conexion = getConnection();
        try {
            ps = conexion.prepareStatement("SELECT * FROM trabajador WHERE num_trabajador = ? AND telefono = ?");
            ps.setInt(1, operario.getNum_Trabajador());
            ps.setInt(2, operario.getTelefono());
            rs = ps.executeQuery();

            if (rs.next()) {
                operario.setId_Trabajador(rs.getInt("id_trabajador"));
                operario.setNum_Trabajador(rs.getInt("num_trabajador"));
                operario.setNombre(rs.getString("nombre"));
                operario.setApellidos(rs.getString("apellidos"));
                operario.setTelefono(rs.getInt("telefono"));
                operario.setId_categoria(rs.getInt("categoria"));
                operario.setId_equipo(rs.getInt("equipo"));
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
    public int num_trabajador_to_id(int num_trabajador) {
        Connection conexion = getConnection();
        Trabajador trabajador = new Trabajador();

        try {
            ps = conexion.prepareStatement("select id_trabajador from trabajador where num_trabajador=?");
            ps.setInt(1, num_trabajador);
            rs = ps.executeQuery();
            if (rs.next()) {
                trabajador.setId_Trabajador(rs.getInt("id_trabajador"));

                return trabajador.getId_Trabajador();
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

}
