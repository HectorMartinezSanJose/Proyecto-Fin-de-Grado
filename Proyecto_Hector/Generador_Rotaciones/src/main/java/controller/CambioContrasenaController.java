package main.java.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import main.java.model.beans.Operario;
import main.java.model.beans.Usuario;
import main.java.model.logic.OperarioLogic;
import main.java.model.logic.UsuarioLogic;
import main.java.view.VistaCambioContrasena;
import main.java.view.VistaLogin;

public class CambioContrasenaController implements ActionListener {

    private VistaCambioContrasena vistaCC;
    private VistaLogin vistaL;
    private Usuario usuario;
    private Operario operario;
    private UsuarioLogic usuarioL;
    private OperarioLogic operarioL;

    public CambioContrasenaController(VistaCambioContrasena vistaCC, VistaLogin vistaL, Usuario usuario, Operario operario, UsuarioLogic usuarioL, OperarioLogic operarioL) {
        this.vistaCC = vistaCC;
        this.vistaL = vistaL;
        this.usuario = usuario;
        this.operario = operario;
        this.usuarioL = usuarioL;
        this.operarioL = operarioL;

        vistaCC.botonCerrar.addActionListener(this);
        vistaCC.botonIPrincipal.addActionListener(this);
        vistaCC.botonCambiar.addActionListener(this);
    }

    public void iniciar() {
        vistaCC.setTitle("Cambio de Contraseña");
        vistaCC.setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        //Cambiar Contrasena
        if (ae.getSource() == vistaCC.botonCambiar) {//TODO: Falta las validaciones
            usuario.setAlias(vistaCC.cajaUsuario.getText());
            operario.setNum_Trabajador(Integer.valueOf(vistaCC.cajaNumeroTrabajador.getText()));
            if (vistaCC.jPasswordF.getText().equals(vistaCC.jPasswordF1.getText()) && usuarioL.buscar(usuario) && operarioL.buscar(operario)) {//Validamos que se ha escrito la misma contraseña
                usuario.setContrasena(vistaCC.jPasswordF.getText());
                if (usuarioL.modificarContrasena(usuario)) {
                    JOptionPane.showMessageDialog(null, "Contraseña actualizada");
                    limpiarcajas();
                } else {
                    JOptionPane.showMessageDialog(null, "Error al actualizar contraseña");
                    limpiarcajas();
                }
            } else {
                JOptionPane.showMessageDialog(null, "Algun dato es erroneo");
            }

        }
        //Ir a Login
        if (ae.getSource() == vistaCC.botonIPrincipal) {
            vistaCC.setVisible(false);
            vistaL.setVisible(true);
            limpiarcajas();
        }
        //Cerrar
        if (ae.getSource() == vistaCC.botonCerrar) {
            System.exit(0);
        }
    }

    //METODO LIMPIAR
    public void limpiarcajas() {
        vistaCC.cajaUsuario.setText(null);
        vistaCC.cajaNumeroTrabajador.setText(null);
        vistaCC.jPasswordF.setText(null);
        vistaCC.jPasswordF1.setText(null);
    }

}
