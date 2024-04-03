package main.java.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.sql.Date;
import java.util.List;
import javax.swing.JOptionPane;
import main.java.model.beans.Rotacion;
import main.java.model.logic.EquipoLogic;
import main.java.model.logic.OperarioLogic;
import main.java.model.logic.RotacionLogic;
import main.java.view.VistaLogin;
import main.java.view.VistaOperarios;
import main.java.view.VistaPrincipal;
import main.java.view.VistaRegistro;

public class PrincipalController implements ActionListener {

    private VistaPrincipal vistaP;
    private VistaOperarios vistaO;
    private VistaRegistro vistaR;
    private VistaLogin vistaL;
    private Rotacion rotacion;
    private RotacionLogic rotacionL;
    private EquipoLogic equipoL;
    private OperarioLogic operarioL;

    public PrincipalController(VistaPrincipal vistaP, VistaOperarios vistaO, VistaRegistro vistaR, VistaLogin vistaL, Rotacion rotacion, RotacionLogic rotacionL, EquipoLogic equipoL, OperarioLogic operarioL) {
        this.vistaP = vistaP;
        this.vistaO = vistaO;
        this.vistaR = vistaR;
        this.vistaL = vistaL;
        this.rotacion = rotacion;
        this.rotacionL = rotacionL;
        this.equipoL = equipoL;
        this.operarioL = operarioL;

        vistaP.botonRegistro.addActionListener(this);
        vistaP.botonTrabajador.addActionListener(this);
        vistaP.botonCerrar.addActionListener(this);
        vistaP.botonGenerar.addActionListener(this);
        vistaP.botonLogout.addActionListener(this);
        vistaP.botonGuardar.addActionListener(this);
    }

    public void iniciar() {
        vistaP.setTitle("Principal");
        vistaP.setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        //GENERAR
        if (ae.getSource() == vistaP.botonGenerar) {//TODO: Rehacer
            Rotacion rotacion1 = new Rotacion();
            rotacion1.setId_equipo(equipoL.nombre_to_id(vistaP.cajaEquipo.getText()));
            rotacion1.setId_coordinador(Integer.valueOf(vistaP.cajaCoord.getText()));

            if (equipoL.operariosXequipo(equipoL.nombre_to_id(vistaP.cajaEquipo.getText())) == 5) {
                
                //R1
                while (!rotacionL.generarRotacion(rotacion1)) {
                }//No saldra del while  mientras no se tenga una rotacion
                vistaP.cajaR1P1.setText(String.valueOf(rotacion1.getP1()));
                vistaP.cajaR1P2.setText(String.valueOf(rotacion1.getP2()));
                vistaP.cajaR1P3.setText(String.valueOf(rotacion1.getP3()));
                vistaP.cajaR1P4.setText(String.valueOf(rotacion1.getP4()));
                vistaP.cajaR1P5.setText(String.valueOf(rotacion1.getP5()));
                List<Integer> R1List = new ArrayList<>();
                R1List.add(rotacion1.getP1());
                R1List.add(rotacion1.getP2());
                R1List.add(rotacion1.getP3());
                R1List.add(rotacion1.getP4());
                R1List.add(rotacion1.getP5());

                //R2
                Rotacion rotacion2 = new Rotacion();
                rotacion2.setId_equipo(equipoL.nombre_to_id(vistaP.cajaEquipo.getText()));
                rotacion2.setId_coordinador(Integer.valueOf(vistaP.cajaCoord.getText()));
                List<Integer> R2List = new ArrayList<>();
                do {
                    R2List.clear();
                    while (!rotacionL.generarRotacion(rotacion2)) {
                    }//No saldra del while  mientras no se tenga una rotacion
                    R2List.add(rotacion2.getP1());
                    R2List.add(rotacion2.getP2());
                    R2List.add(rotacion2.getP3());
                    R2List.add(rotacion2.getP4());
                    R2List.add(rotacion2.getP5());
                } while (rotacionL.compararColecciones(R1List, R2List));

                vistaP.cajaR2P1.setText(String.valueOf(R2List.get(0)));
                vistaP.cajaR2P2.setText(String.valueOf(R2List.get(1)));
                vistaP.cajaR2P3.setText(String.valueOf(R2List.get(2)));
                vistaP.cajaR2P4.setText(String.valueOf(R2List.get(3)));
                vistaP.cajaR2P5.setText(String.valueOf(R2List.get(4)));

                //R3
                Rotacion rotacion3 = new Rotacion();
                rotacion3.setId_equipo(equipoL.nombre_to_id(vistaP.cajaEquipo.getText()));
                rotacion3.setId_coordinador(Integer.valueOf(vistaP.cajaCoord.getText()));
                List<Integer> R3List = new ArrayList<>();
                do {
                    R3List.clear();
                    while (!rotacionL.generarRotacion(rotacion3)) {
                    }//No saldra del while  mientras no se tenga una rotacion
                    R3List.add(rotacion3.getP1());
                    R3List.add(rotacion3.getP2());
                    R3List.add(rotacion3.getP3());
                    R3List.add(rotacion3.getP4());
                    R3List.add(rotacion3.getP5());
                } while (rotacionL.compararColecciones(R2List, R3List));

                vistaP.cajaR3P1.setText(String.valueOf(R3List.get(0)));
                vistaP.cajaR3P2.setText(String.valueOf(R3List.get(1)));
                vistaP.cajaR3P3.setText(String.valueOf(R3List.get(2)));
                vistaP.cajaR3P4.setText(String.valueOf(R3List.get(3)));
                vistaP.cajaR3P5.setText(String.valueOf(R3List.get(4)));

                //R4
                Rotacion rotacion4 = new Rotacion();
                rotacion4.setId_equipo(equipoL.nombre_to_id(vistaP.cajaEquipo.getText()));
                rotacion4.setId_coordinador(Integer.valueOf(vistaP.cajaCoord.getText()));
                List<Integer> R4List = new ArrayList<>();
                do {
                    R4List.clear();
                    while (!rotacionL.generarRotacion(rotacion4)) {
                    }//No saldra del while  mientras no se tenga una rotacion
                    R4List.add(rotacion4.getP1());
                    R4List.add(rotacion4.getP2());
                    R4List.add(rotacion4.getP3());
                    R4List.add(rotacion4.getP4());
                    R4List.add(rotacion4.getP5());
                } while (rotacionL.compararColecciones(R3List, R4List));
                vistaP.cajaR4P1.setText(String.valueOf(R4List.get(0)));
                vistaP.cajaR4P2.setText(String.valueOf(R4List.get(1)));
                vistaP.cajaR4P3.setText(String.valueOf(R4List.get(2)));
                vistaP.cajaR4P4.setText(String.valueOf(R4List.get(3)));
                vistaP.cajaR4P5.setText(String.valueOf(R4List.get(4)));

                //R5
                Rotacion rotacion5 = new Rotacion();
                rotacion5.setId_equipo(equipoL.nombre_to_id(vistaP.cajaEquipo.getText()));
                rotacion5.setId_coordinador(Integer.valueOf(vistaP.cajaCoord.getText()));
                List<Integer> R5List = new ArrayList<>();
                do {
                    R5List.clear();
                    while (!rotacionL.generarRotacion(rotacion5)) {
                    }//No saldra del while  mientras no se tenga una rotacion
                    R5List.add(rotacion5.getP1());
                    R5List.add(rotacion5.getP2());
                    R5List.add(rotacion5.getP3());
                    R5List.add(rotacion5.getP4());
                    R5List.add(rotacion5.getP5());
                } while (rotacionL.compararColecciones(R4List, R5List));
                vistaP.cajaR5P1.setText(String.valueOf(R5List.get(0)));
                vistaP.cajaR5P2.setText(String.valueOf(R5List.get(1)));
                vistaP.cajaR5P3.setText(String.valueOf(R5List.get(2)));
                vistaP.cajaR5P4.setText(String.valueOf(R5List.get(3)));
                vistaP.cajaR5P5.setText(String.valueOf(R5List.get(4)));
            } else {
                JOptionPane.showMessageDialog(null, "La rotación no se genera con equipos con menos de 5 miembros");
            }
        }
        //GUARDAR
        if (ae.getSource() == vistaP.botonGuardar) {
            List<Boolean> lista_boolean_rotacion = new ArrayList<>();
            for (int i = 1; i <= 5; i++) {
                java.util.Date fechaActual = new java.util.Date();
                rotacion.setNum_rotacion(i);
                rotacion.setId_coordinador(operarioL.num_trabajador_to_id(Integer.valueOf(vistaP.cajaCoord.getText())));
                rotacion.setId_equipo(equipoL.nombre_to_id(vistaP.cajaEquipo.getText()));
                rotacion.setFecha(new Date(fechaActual.getTime()));
                switch (i) {
                    case 1:
                        rotacion.setP1(Integer.valueOf(vistaP.cajaR1P1.getText()));
                        rotacion.setP2(Integer.valueOf(vistaP.cajaR1P2.getText()));
                        rotacion.setP3(Integer.valueOf(vistaP.cajaR1P3.getText()));
                        rotacion.setP4(Integer.valueOf(vistaP.cajaR1P4.getText()));
                        rotacion.setP5(Integer.valueOf(vistaP.cajaR1P5.getText()));
                        break;
                    case 2:
                        rotacion.setP1(Integer.valueOf(vistaP.cajaR2P1.getText()));
                        rotacion.setP2(Integer.valueOf(vistaP.cajaR2P2.getText()));
                        rotacion.setP3(Integer.valueOf(vistaP.cajaR2P3.getText()));
                        rotacion.setP4(Integer.valueOf(vistaP.cajaR2P4.getText()));
                        rotacion.setP5(Integer.valueOf(vistaP.cajaR2P5.getText()));
                        break;
                    case 3:
                        rotacion.setP1(Integer.valueOf(vistaP.cajaR3P1.getText()));
                        rotacion.setP2(Integer.valueOf(vistaP.cajaR3P2.getText()));
                        rotacion.setP3(Integer.valueOf(vistaP.cajaR3P3.getText()));
                        rotacion.setP4(Integer.valueOf(vistaP.cajaR3P4.getText()));
                        rotacion.setP5(Integer.valueOf(vistaP.cajaR3P5.getText()));
                        break;
                    case 4:
                        rotacion.setP1(Integer.valueOf(vistaP.cajaR4P1.getText()));
                        rotacion.setP2(Integer.valueOf(vistaP.cajaR4P2.getText()));
                        rotacion.setP3(Integer.valueOf(vistaP.cajaR4P3.getText()));
                        rotacion.setP4(Integer.valueOf(vistaP.cajaR4P4.getText()));
                        rotacion.setP5(Integer.valueOf(vistaP.cajaR4P5.getText()));
                        break;
                    case 5:
                        rotacion.setP1(Integer.valueOf(vistaP.cajaR5P1.getText()));
                        rotacion.setP2(Integer.valueOf(vistaP.cajaR5P2.getText()));
                        rotacion.setP3(Integer.valueOf(vistaP.cajaR5P3.getText()));
                        rotacion.setP4(Integer.valueOf(vistaP.cajaR5P4.getText()));
                        rotacion.setP5(Integer.valueOf(vistaP.cajaR5P5.getText()));
                        break;

                }
                if (rotacionL.insertar(rotacion)) {
                    lista_boolean_rotacion.add(true);
                } else {
                    lista_boolean_rotacion.add(false);
                }
            }
            if (lista_boolean_rotacion.contains(false)) {
                JOptionPane.showMessageDialog(null, "No se ha podido guardar");
            } else {
                JOptionPane.showMessageDialog(null, "Rotación guardada correctamente");
            }
        }
        //TRABAJADORES
        if (ae.getSource() == vistaP.botonTrabajador) {
            vistaP.setVisible(false);
            invisibleCheck();
            vistaO.setVisible(true);
        }
        //REGISTRO
        if (ae.getSource() == vistaP.botonRegistro) {
            vistaP.setVisible(false);
            vistaR.setVisible(true);
        }
        //Login
        if (ae.getSource() == vistaP.botonLogout) {
            vistaP.setVisible(false);
            limpiarcajas();
            vistaL.setVisible(true);
        }
        //CERRAR
        if (ae.getSource() == vistaP.botonCerrar) {
            System.exit(0);
        }
    }

    //METODO invisibleCheck
    public void invisibleCheck() {
        vistaO.LabelPuesto.setVisible(false);
        vistaO.checkP1.setVisible(false);
        vistaO.checkP2.setVisible(false);
        vistaO.checkP3.setVisible(false);
        vistaO.checkP4.setVisible(false);
        vistaO.checkP5.setVisible(false);
    }

    //METODO LIMPIAR
    public void limpiarcajas() {
        vistaP.cajaR1P1.setText(null);
        vistaP.cajaR1P2.setText(null);
        vistaP.cajaR1P3.setText(null);
        vistaP.cajaR1P4.setText(null);
        vistaP.cajaR1P5.setText(null);

        vistaP.cajaR2P1.setText(null);
        vistaP.cajaR2P2.setText(null);
        vistaP.cajaR2P3.setText(null);
        vistaP.cajaR2P4.setText(null);
        vistaP.cajaR2P5.setText(null);

        vistaP.cajaR3P1.setText(null);
        vistaP.cajaR3P2.setText(null);
        vistaP.cajaR3P3.setText(null);
        vistaP.cajaR3P4.setText(null);
        vistaP.cajaR3P5.setText(null);

        vistaP.cajaR4P1.setText(null);
        vistaP.cajaR4P2.setText(null);
        vistaP.cajaR4P3.setText(null);
        vistaP.cajaR4P4.setText(null);
        vistaP.cajaR4P5.setText(null);

        vistaP.cajaR5P1.setText(null);
        vistaP.cajaR5P2.setText(null);
        vistaP.cajaR5P3.setText(null);
        vistaP.cajaR5P4.setText(null);
        vistaP.cajaR5P5.setText(null);

        vistaP.cajaAlias.setText(null);
        vistaP.cajaCoord.setText(null);
        vistaP.cajaEquipo.setText(null);
        vistaP.cajaFecha.setText(null);
    }

}
