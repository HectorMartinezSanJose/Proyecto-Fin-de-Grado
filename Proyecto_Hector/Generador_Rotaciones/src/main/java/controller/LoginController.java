package main.java.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import main.java.model.beans.Operario;
import main.java.model.beans.Usuario;
import main.java.model.logic.EquipoLogic;
import main.java.model.logic.OperarioLogic;
import main.java.model.logic.UsuarioLogic;
import main.java.view.VistaLogin;
import main.java.view.VistaPrincipal;
import main.java.view.VistaCambioContrasena;
import main.java.view.VistaInscribirse;
import main.java.view.VistaOperarios;

public class LoginController implements ActionListener {

    private VistaLogin vistaL;
    private VistaPrincipal vistaP;
    private VistaCambioContrasena vistaCC;
    private VistaInscribirse vistaI;
    private VistaOperarios vistaO;
    private Usuario usuario;
    private UsuarioLogic usuarioLogic;
    private OperarioLogic operarioLogic;
    private EquipoLogic equipoL;

    public LoginController(VistaLogin vistaL, VistaPrincipal vistaP, VistaCambioContrasena vistaCC, VistaInscribirse vistaI, VistaOperarios vistaO, Usuario usuario, UsuarioLogic usuarioLogic, OperarioLogic operarioLogic, EquipoLogic equipoL) {
        this.vistaL = vistaL;
        this.vistaP = vistaP;
        this.vistaCC = vistaCC;
        this.vistaI = vistaI;
        this.vistaO = vistaO;
        this.usuario = usuario;
        this.usuarioLogic = usuarioLogic;
        this.operarioLogic = operarioLogic;
        this.equipoL = equipoL;

        vistaL.botonCerrar.addActionListener((ActionListener) this);
        vistaL.botonIniciar.addActionListener((ActionListener) this);
        vistaL.botonCambiarContrasena.addActionListener((ActionListener) this);
        vistaL.botonInscribirse.addActionListener((ActionListener) this);

    }

    public void iniciar() {
        vistaL.setTitle("Login");
        vistaL.setLocationRelativeTo(null);
        vistaP.setTitle("Principal");
        vistaP.setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {

        //INICIAR
        if (ae.getSource() == vistaL.botonIniciar) {
            usuario.setAlias(vistaL.cajaUsuario.getText());
            if (usuarioLogic.buscar(usuario)) {
                String passText = new String(vistaL.jPasswordF.getPassword());
                if (passText.equals(usuario.getContrasena())) {
                    vistaP.setVisible(true);
                    vistaL.setVisible(false);
                    Operario operario = new Operario();
                    operario.setId_Trabajador(usuario.getId_Trabajador());
                    if (operarioLogic.buscarConId(operario)) {
                        vistaP.cajaCoord.setText(String.valueOf(operario.getNum_Trabajador()));
                        vistaP.cajaEquipo.setText(equipoL.id_to_nombre(operario.getId_equipo()));
                        vistaP.cajaAlias.setText(usuario.getAlias());
                        vistaO.cajaAlias.setText(usuario.getAlias());
                        fecha();
                    }
                    limpiarcajas();
                } else {
                    JOptionPane.showMessageDialog(null, "No existe ese usuario o contraseña");
                    limpiarcajas();
                }

            } else {
                JOptionPane.showMessageDialog(null, "No existe ese usuario o contraseña");
                limpiarcajas();
            }

        }
        //Ir a VistaCambioContrasena
        if (ae.getSource() == vistaL.botonCambiarContrasena) {
            vistaL.setVisible(false);
            vistaCC.setVisible(true);
            limpiarcajas();
        }
        //Ir a VistaInscribirse
        if (ae.getSource() == vistaL.botonInscribirse) {
            vistaL.setVisible(false);
            vistaI.setVisible(true);
            limpiarcajas();
        }
        //CERRAR
        if (ae.getSource() == vistaL.botonCerrar) {
            System.exit(0);
        }

    }

    //METODO LIMPIAR
    public void limpiarcajas() {
        vistaL.cajaUsuario.setText(null);
        vistaL.jPasswordF.setText(null);
    }

    //FECHA
    public void fecha() {
        Date fechaActual = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        vistaP.cajaFecha.setText(sdf.format(fechaActual));
    }

}
