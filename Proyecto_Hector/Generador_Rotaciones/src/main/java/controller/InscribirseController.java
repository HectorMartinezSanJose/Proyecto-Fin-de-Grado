package main.java.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import main.java.model.beans.Operario;
import main.java.model.beans.Usuario;
import main.java.model.logic.OperarioLogic;
import main.java.model.logic.UsuarioLogic;
import main.java.view.VistaInscribirse;
import main.java.view.VistaLogin;

public class InscribirseController implements ActionListener {

    private VistaInscribirse vistaI;
    private VistaLogin vistaL;
    private Operario operario;
    private OperarioLogic operarioL;
    private Usuario usuario;
    private UsuarioLogic usuarioL;

    public InscribirseController(VistaInscribirse vistaI, VistaLogin vistaL, Operario operario, OperarioLogic operarioL, Usuario usuario, UsuarioLogic usuarioL) {
        this.vistaI = vistaI;
        this.vistaL = vistaL;
        this.operario = operario;
        this.operarioL = operarioL;
        this.usuario = usuario;
        this.usuarioL = usuarioL;

        vistaI.botonCerrar.addActionListener(this);
        vistaI.botonIPrincipal.addActionListener(this);
        vistaI.botonInscribirse.addActionListener(this);
    }

    public void iniciar() {
        vistaI.setTitle("Crear Usuario");
        vistaI.setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        //Inscribirse
        if (ae.getSource() == vistaI.botonInscribirse) {//TODO: Falta las validaciones
            operario.setNum_Trabajador(Integer.valueOf(vistaI.cajaNumeroTrabajador.getText()));
            operario.setTelefono(Integer.valueOf(vistaI.cajaTelefono.getText()));
            if (vistaI.jPasswordF.getText().equals(vistaI.jPasswordF1.getText()) && operarioL.buscarConTelefono(operario)) {//Validamos que la contraseña es la elegida y que el trabajador existe
                usuario.setId_Trabajador(operario.getId_Trabajador());
                usuario.setAlias(vistaI.cajaUsuario.getText());
                usuario.setContrasena(vistaI.jPasswordF.getText());
                if (usuarioL.insertar(usuario)) {
                    JOptionPane.showMessageDialog(null, "Usuario creado exitosamente");
                    limpiarcajas();
                } else {
                    JOptionPane.showMessageDialog(null, "Error al crear el usuario");
                    limpiarcajas();
                }
            } else {
                JOptionPane.showMessageDialog(null, "Algun dato es erroneo");
            }
        }
        //Ir a Login
        if (ae.getSource() == vistaI.botonIPrincipal) {
            vistaI.setVisible(false);
            vistaL.setVisible(true);
            limpiarcajas();
        }
        //Cerrar
        if (ae.getSource() == vistaI.botonCerrar) {
            System.exit(0);
        }
    }

    public void limpiarcajas() {
        vistaI.cajaUsuario.setText(null);
        vistaI.cajaNumeroTrabajador.setText(null);
        vistaI.cajaTelefono.setText(null);
        vistaI.jPasswordF.setText(null);
        vistaI.jPasswordF1.setText(null);
    }
}
