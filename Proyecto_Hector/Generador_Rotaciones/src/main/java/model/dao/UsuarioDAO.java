package main.java.model.dao;

import java.util.ArrayList;
import main.java.model.beans.Usuario;

public interface UsuarioDAO {

    boolean buscar(Usuario usuario);

    boolean insertar(Usuario usuario);

    boolean modificarContrasena(Usuario usuario);

    ArrayList<Usuario> listarUsuario();

}
