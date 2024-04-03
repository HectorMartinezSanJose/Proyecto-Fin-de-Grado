package main.java.controller;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import main.java.view.VistaLogin;
import main.java.view.VistaOperarios;
import main.java.view.VistaPrincipal;

public class MouseEventController implements MouseListener {

    int xMouse, yMouse;
    //Colores
    Color color_Azul = new Color(36, 56, 130);
    Color color_AzulClaro = new Color(73, 99, 198);
    Color color_GrisAzul = new Color(227, 36, 90);

    private VistaPrincipal vistaP;
    private VistaOperarios vistaO;
    private VistaLogin vistaL;

    public MouseEventController(VistaPrincipal vistaP, VistaOperarios vistaO, VistaLogin vistaL) {
        this.vistaP = vistaP;
        this.vistaO = vistaO;
        this.vistaL = vistaL;

        vistaP.botonGenerar.addMouseListener(this);
        vistaP.botonTrabajador.addMouseListener(this);
        vistaP.botonRegistro.addMouseListener(this);
        vistaP.botonGuardar.addMouseListener(this);

        vistaO.botonGuardar.addMouseListener(this);
        vistaO.botonActualizar.addMouseListener(this);
        vistaO.botonBorrar.addMouseListener(this);
        vistaO.botonBuscar.addMouseListener(this);
        vistaO.botonLimpiar.addMouseListener(this);

        vistaL.botonIniciar.addMouseListener(this);
        vistaL.botonInscribirse.addMouseListener(this);
        vistaL.botonCambiarContrasena.addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent me) {
        //Vista Principal
        if (me.getSource() == vistaP.botonGenerar) {
            vistaP.botonGenerar.setBackground(color_Azul);
        }
        if (me.getSource() == vistaP.botonTrabajador) {
            vistaP.botonTrabajador.setBackground(color_Azul);
        }
        if (me.getSource() == vistaP.botonRegistro) {
            vistaP.botonRegistro.setBackground(color_Azul);
        }
        if (me.getSource() == vistaP.botonGuardar) {
            vistaP.botonGuardar.setBackground(color_Azul);
        }
        //Vista Operarios
        if (me.getSource() == vistaO.botonGuardar) {
            vistaO.botonGuardar.setBackground(color_Azul);
        }
        if (me.getSource() == vistaO.botonActualizar) {
            vistaO.botonActualizar.setBackground(color_Azul);
        }
        if (me.getSource() == vistaO.botonBorrar) {
            vistaO.botonBorrar.setBackground(color_Azul);
        }
        if (me.getSource() == vistaO.botonBuscar) {
            vistaO.botonBuscar.setBackground(color_Azul);
        }
        if (me.getSource() == vistaO.botonLimpiar) {
            vistaO.botonLimpiar.setBackground(color_Azul);
        }
        //Vista Login
        if (me.getSource() == vistaL.botonIniciar) {
            vistaL.botonIniciar.setBackground(color_Azul);
        }
        if (me.getSource() == vistaL.botonInscribirse) {
            vistaL.botonInscribirse.setForeground(color_Azul);
        }
        if (me.getSource() == vistaL.botonCambiarContrasena) {
            vistaL.botonCambiarContrasena.setForeground(color_Azul);
        }
    }

    @Override
    public void mousePressed(MouseEvent me) {
        //Vista Principal
        if (me.getSource() == vistaP.botonGenerar) {
            vistaP.botonGenerar.setBackground(color_GrisAzul);
        }
        if (me.getSource() == vistaP.botonTrabajador) {
            vistaP.botonTrabajador.setBackground(color_GrisAzul);
        }
        if (me.getSource() == vistaP.botonRegistro) {
            vistaP.botonRegistro.setBackground(color_GrisAzul);
        }
        if (me.getSource() == vistaP.botonGuardar) {
            vistaP.botonGuardar.setBackground(color_GrisAzul);
        }
        //Vista Operarios
        if (me.getSource() == vistaO.botonGuardar) {
            vistaO.botonGuardar.setBackground(color_GrisAzul);
        }
        if (me.getSource() == vistaO.botonActualizar) {
            vistaO.botonActualizar.setBackground(color_GrisAzul);
        }
        if (me.getSource() == vistaO.botonBorrar) {
            vistaO.botonBorrar.setBackground(color_GrisAzul);
        }
        if (me.getSource() == vistaO.botonBuscar) {
            vistaO.botonBuscar.setBackground(color_GrisAzul);
        }
        if (me.getSource() == vistaO.botonLimpiar) {
            vistaO.botonLimpiar.setBackground(color_GrisAzul);
        }
        //Vista Login
        if (me.getSource() == vistaL.botonIniciar) {
            vistaL.botonIniciar.setBackground(color_GrisAzul);
        }
        if (me.getSource() == vistaL.botonInscribirse) {
            vistaL.botonInscribirse.setForeground(color_GrisAzul);
        }
        if (me.getSource() == vistaL.botonCambiarContrasena) {
            vistaL.botonCambiarContrasena.setForeground(color_GrisAzul);
        }
    }

    @Override
    public void mouseReleased(MouseEvent me) {
        //Vista Principal
        if (me.getSource() == vistaP.botonGenerar) {
            vistaP.botonGenerar.setBackground(color_Azul);
        }
        if (me.getSource() == vistaP.botonTrabajador) {
            vistaP.botonTrabajador.setBackground(color_Azul);
        }
        if (me.getSource() == vistaP.botonRegistro) {
            vistaP.botonRegistro.setBackground(color_Azul);
        }
        if (me.getSource() == vistaP.botonGuardar) {
            vistaP.botonGuardar.setBackground(color_Azul);
        }
        //Vista Operarios
        if (me.getSource() == vistaO.botonGuardar) {
            vistaO.botonGuardar.setBackground(color_Azul);
        }
        if (me.getSource() == vistaO.botonActualizar) {
            vistaO.botonActualizar.setBackground(color_Azul);
        }
        if (me.getSource() == vistaO.botonBorrar) {
            vistaO.botonBorrar.setBackground(color_Azul);
        }
        if (me.getSource() == vistaO.botonBuscar) {
            vistaO.botonBuscar.setBackground(color_Azul);
        }
        if (me.getSource() == vistaO.botonLimpiar) {
            vistaO.botonLimpiar.setBackground(color_Azul);
        }
        //Vista Login
        if (me.getSource() == vistaL.botonIniciar) {
            vistaL.botonIniciar.setBackground(color_Azul);
        }
        if (me.getSource() == vistaL.botonInscribirse) {
            vistaL.botonInscribirse.setForeground(color_Azul);
        }
        if (me.getSource() == vistaL.botonCambiarContrasena) {
            vistaL.botonCambiarContrasena.setForeground(color_Azul);
        }
    }

    @Override
    public void mouseEntered(MouseEvent me) {
        //Vista Principal
        if (me.getSource() == vistaP.botonGenerar) {
            vistaP.botonGenerar.setBackground(color_AzulClaro);
        }
        if (me.getSource() == vistaP.botonTrabajador) {
            vistaP.botonTrabajador.setBackground(color_AzulClaro);
        }
        if (me.getSource() == vistaP.botonRegistro) {
            vistaP.botonRegistro.setBackground(color_AzulClaro);
        }
        if (me.getSource() == vistaP.botonGuardar) {
            vistaP.botonGuardar.setBackground(color_AzulClaro);
        }
        //Vista Operarios
        if (me.getSource() == vistaO.botonGuardar) {
            vistaO.botonGuardar.setBackground(color_AzulClaro);
        }
        if (me.getSource() == vistaO.botonActualizar) {
            vistaO.botonActualizar.setBackground(color_AzulClaro);
        }
        if (me.getSource() == vistaO.botonBorrar) {
            vistaO.botonBorrar.setBackground(color_AzulClaro);
        }
        if (me.getSource() == vistaO.botonBuscar) {
            vistaO.botonBuscar.setBackground(color_AzulClaro);
        }
        if (me.getSource() == vistaO.botonLimpiar) {
            vistaO.botonLimpiar.setBackground(color_AzulClaro);
        }
        //Vista Login
        if (me.getSource() == vistaL.botonIniciar) {
            vistaL.botonIniciar.setBackground(color_AzulClaro);
        }
        if (me.getSource() == vistaL.botonInscribirse) {
            vistaL.botonInscribirse.setForeground(color_AzulClaro);
        }
        if (me.getSource() == vistaL.botonCambiarContrasena) {
            vistaL.botonCambiarContrasena.setForeground(color_AzulClaro);
        }
    }

    @Override
    public void mouseExited(MouseEvent me) {
        //Vista Principal
        if (me.getSource() == vistaP.botonGenerar) {
            vistaP.botonGenerar.setBackground(color_Azul);
        }
        if (me.getSource() == vistaP.botonTrabajador) {
            vistaP.botonTrabajador.setBackground(color_Azul);
        }
        if (me.getSource() == vistaP.botonRegistro) {
            vistaP.botonRegistro.setBackground(color_Azul);
        }
        if (me.getSource() == vistaP.botonGuardar) {
            vistaP.botonGuardar.setBackground(color_Azul);
        }
        //Vista Operarios
        if (me.getSource() == vistaO.botonGuardar) {
            vistaO.botonGuardar.setBackground(color_Azul);
        }
        if (me.getSource() == vistaO.botonActualizar) {
            vistaO.botonActualizar.setBackground(color_Azul);
        }
        if (me.getSource() == vistaO.botonBorrar) {
            vistaO.botonBorrar.setBackground(color_Azul);
        }
        if (me.getSource() == vistaO.botonBuscar) {
            vistaO.botonBuscar.setBackground(color_Azul);
        }
        if (me.getSource() == vistaO.botonLimpiar) {
            vistaO.botonLimpiar.setBackground(color_Azul);
        }
        //Vista Login
        if (me.getSource() == vistaL.botonIniciar) {
            vistaL.botonIniciar.setBackground(color_Azul);
        }
        if (me.getSource() == vistaL.botonInscribirse) {
            vistaL.botonInscribirse.setForeground(color_Azul);
        }
        if (me.getSource() == vistaL.botonCambiarContrasena) {
            vistaL.botonCambiarContrasena.setForeground(color_Azul);
        }
    }

}
