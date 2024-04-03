package main.java.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import main.java.model.beans.Rotacion;
import main.java.model.logic.EquipoLogic;
import main.java.model.logic.RotacionLogic;
import main.java.view.VistaPrincipal;
import main.java.view.VistaRegistro;

public class RegistroController implements ActionListener {

    DefaultTableModel modelo = new DefaultTableModel();
    private VistaRegistro vistaR;
    private VistaPrincipal vistaP;
    private Rotacion rotacion;
    private RotacionLogic rotacionL;
    private EquipoLogic equipoL;

    public RegistroController(VistaRegistro vistaR, VistaPrincipal vistaP, Rotacion rotacion, RotacionLogic rotacionL, EquipoLogic equipoL) {
        this.vistaR = vistaR;
        this.vistaP = vistaP;
        this.rotacion = rotacion;
        this.rotacionL = rotacionL;
        this.equipoL = equipoL;

        vistaR.botonBuscar.addActionListener((ActionListener) this);
        vistaR.botonLimpiar.addActionListener((ActionListener) this);
        vistaR.botonCerrar.addActionListener((ActionListener) this);
        vistaR.botonIPrincipal.addActionListener((ActionListener) this);
        vistaR.jComboBoxEquipo.addActionListener((ActionListener) this);
    }

    public void iniciar() {
        vistaR.setTitle("Resgitro de rotaciones");
        vistaR.setLocationRelativeTo(null);
        modelo.setColumnIdentifiers(new String[]{"Rotación", "Equipo", "Fecha", "Coordinador", "P1", "P2", "P3", "P4", "P5"});
        vistaR.jTable.setModel(modelo);
        vistaR.jTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        //BuSCAR
        if (ae.getSource() == vistaR.botonBuscar) {
            limpiarTabla();
            modelo.setColumnIdentifiers(new String[]{"Rotación", "Equipo", "Fecha", "Coordinador", "P1", "P2", "P3", "P4", "P5"});
            vistaR.jTable.setModel(modelo);

            // Obtener la fecha del JCalendar
            java.util.Date uDate = vistaR.jDateChooser.getDate();

            // Convertir la fecha al formato adecuado para la base de datos
            java.sql.Date sqlDate = new java.sql.Date(uDate.getTime());

            rotacionL.ListarRotaciones(sqlDate, equipoL.nombre_to_id(vistaR.jComboBoxEquipo.getSelectedItem().toString()), modelo);

        }
        //LIMPIAR
        if (ae.getSource() == vistaR.botonLimpiar) {
            limpiarcajas();
            limpiarTabla();
        }
        //PASAR A VISTAPRINCIPAL
        if (ae.getSource() == vistaR.botonIPrincipal) {
            limpiarcajas();
            limpiarTabla();
            vistaR.setVisible(false);
            vistaP.setVisible(true);
        }
        //CERRAR
        if (ae.getSource() == vistaR.botonCerrar) {
            System.exit(0);
        }
    }

    //METODO LIMPIAR
    public void limpiarcajas() {
        vistaR.jComboBoxEquipo.setSelectedIndex(0);
        vistaR.jDateChooser.setDate(null);
    }

    //METODO LIMPIAR
    public void limpiarTabla() {
        for (int i = 0; i < modelo.getRowCount(); i++) {
            modelo.removeRow(i);
            i -= 1;
        }
    }

}
