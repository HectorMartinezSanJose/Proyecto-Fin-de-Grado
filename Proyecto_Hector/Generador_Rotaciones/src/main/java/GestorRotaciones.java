
package main.java;

import main.java.controller.CambioContrasenaController;
import main.java.controller.InscribirseController;
import main.java.model.logic.RotacionLogic;
import main.java.model.logic.OperarioLogic;
import main.java.controller.LoginController;
import main.java.controller.MouseEventController;
import main.java.controller.OperarioController;
import main.java.controller.PrincipalController;
import main.java.controller.RegistroController;
import main.java.model.beans.Categoria;
import main.java.model.beans.Equipo;
import main.java.model.beans.Operario;
import main.java.model.beans.Rotacion;
import main.java.model.beans.Trabajador;
import main.java.model.beans.Usuario;
import main.java.model.logic.CategoriaLogic;
import main.java.model.logic.EquipoLogic;
import main.java.model.logic.UsuarioLogic;
import main.java.view.VistaCambioContrasena;
import main.java.view.VistaInscribirse;
import main.java.view.VistaLogin;
import main.java.view.VistaOperarios;
import main.java.view.VistaPrincipal;
import main.java.view.VistaRegistro;


public class GestorRotaciones {
    public static void main(String args[]) {
        
        VistaOperarios vistaO = new VistaOperarios();
        VistaPrincipal vistaP = new VistaPrincipal();
        VistaLogin vistaL = new VistaLogin();
        VistaCambioContrasena vistaCC = new VistaCambioContrasena();
        VistaInscribirse vistaI = new VistaInscribirse();
        VistaRegistro vistaR = new VistaRegistro();
        Trabajador trabajador = new Trabajador();
        Operario operario = new Operario();
        Usuario usuario = new Usuario();
        OperarioLogic operarioL = new OperarioLogic();
        UsuarioLogic usuarioLogic = new UsuarioLogic();
        RotacionLogic rotacionL = new RotacionLogic();
        Rotacion rotacion = new Rotacion();
        Categoria categoria = new Categoria();
        CategoriaLogic categoriaL = new CategoriaLogic();
        Equipo equipo = new Equipo();
        EquipoLogic equipoL = new EquipoLogic();
        
        LoginController lc = new LoginController(vistaL,vistaP,vistaCC,vistaI,vistaO,usuario,usuarioLogic,operarioL,equipoL);
        CambioContrasenaController ccc = new CambioContrasenaController(vistaCC, vistaL,usuario, operario, usuarioLogic, operarioL);
        InscribirseController ic = new InscribirseController(vistaI,vistaL,operario, operarioL, usuario,usuarioLogic);
        OperarioController oc = new OperarioController(vistaP,vistaO,vistaL,trabajador,operario,operarioL,categoria,categoriaL,equipo,equipoL);
        PrincipalController pc = new PrincipalController(vistaP,vistaO,vistaR,vistaL,rotacion, rotacionL, equipoL,operarioL);
        RegistroController rc = new RegistroController(vistaR,vistaP,rotacion, rotacionL, equipoL);
        MouseEventController mec = new MouseEventController(vistaP,vistaO,vistaL);
        
        lc.iniciar();
        ccc.iniciar();
        ic.iniciar();
        pc.iniciar();
        oc.iniciar();
        rc.iniciar();
        vistaL.setVisible(true);
       
        
    }
    
}
