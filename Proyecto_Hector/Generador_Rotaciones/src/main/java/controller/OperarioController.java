package main.java.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import main.java.model.beans.Categoria;
import main.java.model.beans.Equipo;
import main.java.model.beans.Operario;
import main.java.model.beans.Trabajador;
import main.java.model.logic.CategoriaLogic;
import main.java.model.logic.EquipoLogic;
import main.java.model.logic.OperarioLogic;
import main.java.model.logic.ValidarTrabajador;
import main.java.view.VistaLogin;
import main.java.view.VistaOperarios;
import main.java.view.VistaPrincipal;

public class OperarioController implements ActionListener {

    private VistaPrincipal vistaP;
    private VistaOperarios vistaO;
    private VistaLogin vistaL;
    private Trabajador trabajador;
    private Operario operario;
    private OperarioLogic operarioL;
    private Categoria categoria;
    private CategoriaLogic categoriaL;
    private Equipo equipo;
    private EquipoLogic equipoL;

    public OperarioController(VistaPrincipal vistaP, VistaOperarios vistaO, VistaLogin vistaL, Trabajador trabajador, Operario operario, OperarioLogic operarioL, Categoria categoria, CategoriaLogic categoriaL, Equipo equipo, EquipoLogic equipoL) {
        this.vistaP = vistaP;
        this.vistaO = vistaO;
        this.vistaL = vistaL;
        this.trabajador = trabajador;
        this.operario = operario;
        this.operarioL = operarioL;
        this.categoria = categoria;
        this.categoriaL = categoriaL;
        this.equipo = equipo;
        this.equipoL = equipoL;

        vistaO.botonGuardar.addActionListener(this);
        vistaO.botonBuscar.addActionListener(this);
        vistaO.botonActualizar.addActionListener(this);
        vistaO.botonLimpiar.addActionListener(this);
        vistaO.botonBorrar.addActionListener(this);
        vistaO.botonIPrincipal.addActionListener(this);
        vistaO.botonCerrar.addActionListener(this);
        vistaO.comboBoxCategoria.addActionListener(this);
        vistaO.botonLogout.addActionListener(this);
    }

    public void iniciar() {
        vistaO.setTitle("CRUD Trabajadores");
        vistaO.setLocationRelativeTo(null);
        vistaO.caja_ID.setVisible(false);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {

        //GUARDAR
        if (ae.getSource() == vistaO.botonGuardar) {
            // Validamos los datos que se introduzcan en la cajas y en el Combobox.
            if (ValidarTrabajador.validarNumOpe(vistaO.cajaNumOperario.getText()) && ValidarTrabajador.validarTelefono(vistaO.cajaTelefono.getText())
                    && ValidarTrabajador.validarNombre(vistaO.cajaNombre.getText()) && ValidarTrabajador.validarApellidos(vistaO.cajaApellidos.getText())
                    && (ValidarTrabajador.validarComboBoxOperario(vistaO.comboBoxCategoria.getSelectedItem().toString()) || ValidarTrabajador.validarComboBoxCoordinador(vistaO.comboBoxCategoria.getSelectedItem().toString()))) {

                if ("Operario".equals(vistaO.comboBoxCategoria.getSelectedItem().toString())) { // Si la condicion se cumple guardamos los datos en la clase Trabajador.
                    //Validamos que el equipo no tiene 5 operarios
                    if (equipoL.operariosXequipo(equipoL.nombre_to_id(vistaO.comboBoxEquipo.getSelectedItem().toString())) < 5) {
                        //Validamos que se ha seleccionado almenos 1 puesto puesto.
                        if (ValidarTrabajador.validarCheck(vistaO.checkP1.isSelected()) || ValidarTrabajador.validarCheck(vistaO.checkP2.isSelected())
                                || ValidarTrabajador.validarCheck(vistaO.checkP3.isSelected()) || ValidarTrabajador.validarCheck(vistaO.checkP4.isSelected())
                                || ValidarTrabajador.validarCheck(vistaO.checkP5.isSelected())) {

                            operario.setNum_Trabajador(Integer.valueOf(vistaO.cajaNumOperario.getText()));
                            operario.setNombre(vistaO.cajaNombre.getText());
                            operario.setApellidos(vistaO.cajaApellidos.getText());
                            operario.setTelefono(Integer.valueOf(vistaO.cajaTelefono.getText()));
                            operario.setId_categoria(categoriaL.nombre_to_id(vistaO.comboBoxCategoria.getSelectedItem().toString()));
                            operario.setId_equipo(equipoL.nombre_to_id(vistaO.comboBoxEquipo.getSelectedItem().toString()));
                            operario.setP1(vistaO.checkP1.isSelected());
                            operario.setP2(vistaO.checkP2.isSelected());
                            operario.setP3(vistaO.checkP3.isSelected());
                            operario.setP4(vistaO.checkP4.isSelected());
                            operario.setP5(vistaO.checkP5.isSelected());
                            if (operarioL.insertar(operario)) {
                                JOptionPane.showMessageDialog(null, "Trabajador insertado correctamente");
                                limpiarcajas();
                            } else {
                                JOptionPane.showMessageDialog(null, "Error insertar trabajador");
                                limpiarcajas();
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "Algun campo esta incorrecto");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "El equipo de trabajo esta completo");
                        vistaO.comboBoxEquipo.setSelectedIndex(0);
                    }
                }
                if ("Coordinador".equals(vistaO.comboBoxCategoria.getSelectedItem().toString())) { // Si la condicion se cumple guardamos los datos en la clase Trabajador.

                    trabajador.setNum_Trabajador(Integer.valueOf(vistaO.cajaNumOperario.getText()));
                    trabajador.setNombre(vistaO.cajaNombre.getText());
                    trabajador.setApellidos(vistaO.cajaApellidos.getText());
                    trabajador.setTelefono(Integer.valueOf(vistaO.cajaTelefono.getText()));
                    trabajador.setId_categoria(categoriaL.nombre_to_id(vistaO.comboBoxCategoria.getSelectedItem().toString()));
                    trabajador.setId_equipo(equipoL.nombre_to_id(vistaO.comboBoxEquipo.getSelectedItem().toString()));
                    if (operarioL.insertar(trabajador)) {
                        JOptionPane.showMessageDialog(null, "Trabajador insertado correctamente");
                        limpiarcajas();
                    } else {
                        JOptionPane.showMessageDialog(null, "Error insertar trabajador");
                        limpiarcajas();
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "Algun campo esta incorrecto");
            }
        }
        //BUSCAR
        if (ae.getSource() == vistaO.botonBuscar) {
            if (ValidarTrabajador.validarNumOpe(vistaO.cajaBuscar.getText())) { // Validamos con validarNumOpe que solo introduce numeros en la cajaBuscar.

                operario.setNum_Trabajador(Integer.valueOf(vistaO.cajaBuscar.getText()));
                if (operarioL.buscar(operario)) {
                    vistaO.caja_ID.setText(String.valueOf(operario.getId_Trabajador()));
                    vistaO.cajaNumOperario.setText(String.valueOf(operario.getNum_Trabajador()));
                    vistaO.cajaNombre.setText(operario.getNombre());
                    vistaO.cajaApellidos.setText(operario.getApellidos());
                    vistaO.cajaTelefono.setText(String.valueOf(operario.getTelefono()));
                    vistaO.comboBoxCategoria.setSelectedItem(categoriaL.id_to_nombre(operario.getId_categoria()));
                    vistaO.comboBoxEquipo.setSelectedItem(equipoL.id_to_nombre(operario.getId_equipo()));
                    if ("Operario".equals(categoriaL.id_to_nombre(operario.getId_categoria()))) {
                        vistaO.checkP1.setSelected(operario.getP1());
                        vistaO.checkP2.setSelected(operario.getP2());
                        vistaO.checkP3.setSelected(operario.getP3());
                        vistaO.checkP4.setSelected(operario.getP4());
                        vistaO.checkP5.setSelected(operario.getP5());
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "No existe un trabajador con ese nº de operario");
                    limpiarcajas();
                }
            } else {
                JOptionPane.showMessageDialog(null, "Introduzca solo numeros");
                limpiarcajas();
            }
        }
        //ACTUALIZAR
        if (ae.getSource() == vistaO.botonActualizar) {
            if (ValidarTrabajador.validarNumOpe(vistaO.cajaNumOperario.getText()) && ValidarTrabajador.validarTelefono(vistaO.cajaTelefono.getText())
                    && ValidarTrabajador.validarNombre(vistaO.cajaNombre.getText()) && ValidarTrabajador.validarApellidos(vistaO.cajaApellidos.getText())
                    && (ValidarTrabajador.validarComboBoxOperario(vistaO.comboBoxCategoria.getSelectedItem().toString()) || ValidarTrabajador.validarComboBoxCoordinador(vistaO.comboBoxCategoria.getSelectedItem().toString()))) {

                if ("Operario".equals(vistaO.comboBoxCategoria.getSelectedItem().toString())) { // Si la condicion se cumple actualizamos los datos en la clase Trabajador.
                    //Validamos que el equipo no tiene 5 operarios
                    if (equipoL.operariosXequipo(equipoL.nombre_to_id(vistaO.comboBoxEquipo.getSelectedItem().toString())) < 5) {
                        //Validamos que se ha seleccionado almenos 1 puesto puesto.
                        if (ValidarTrabajador.validarCheck(vistaO.checkP1.isSelected()) || ValidarTrabajador.validarCheck(vistaO.checkP2.isSelected())
                                || ValidarTrabajador.validarCheck(vistaO.checkP3.isSelected()) || ValidarTrabajador.validarCheck(vistaO.checkP4.isSelected())
                                || ValidarTrabajador.validarCheck(vistaO.checkP5.isSelected())) {

                            operario.setNum_Trabajador(Integer.valueOf(vistaO.cajaNumOperario.getText()));
                            operario.setNombre(vistaO.cajaNombre.getText());
                            operario.setApellidos(vistaO.cajaApellidos.getText());
                            operario.setTelefono(Integer.valueOf(vistaO.cajaTelefono.getText()));
                            operario.setId_categoria(categoriaL.nombre_to_id(vistaO.comboBoxCategoria.getSelectedItem().toString()));
                            operario.setId_equipo(equipoL.nombre_to_id(vistaO.comboBoxEquipo.getSelectedItem().toString()));
                            operario.setP1(vistaO.checkP1.isSelected());
                            operario.setP2(vistaO.checkP2.isSelected());
                            operario.setP3(vistaO.checkP3.isSelected());
                            operario.setP4(vistaO.checkP4.isSelected());
                            operario.setP5(vistaO.checkP5.isSelected());
                            if (operarioL.modificar(operario)) {
                                JOptionPane.showMessageDialog(null, "Trabajador actualizado correctamente");
                                limpiarcajas();
                            } else {
                                JOptionPane.showMessageDialog(null, "Error actualizar trabajador");
                                limpiarcajas();
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "Algun campo esta incorrecto");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "El equipo de trabajo esta completo");
                        vistaO.comboBoxEquipo.setSelectedIndex(0);
                    }

                }
                if ("Coordinador".equals(vistaO.comboBoxCategoria.getSelectedItem().toString())) { // Si la condicion se cumple actualizamos los datos en la clase Trabajador.

                    trabajador.setId_Trabajador(Integer.valueOf(vistaO.caja_ID.getText()));
                    trabajador.setNum_Trabajador(Integer.valueOf(vistaO.cajaNumOperario.getText()));
                    trabajador.setNombre(vistaO.cajaNombre.getText());
                    trabajador.setApellidos(vistaO.cajaApellidos.getText());
                    trabajador.setTelefono(Integer.valueOf(vistaO.cajaTelefono.getText()));
                    trabajador.setId_categoria(categoriaL.nombre_to_id(vistaO.comboBoxCategoria.getSelectedItem().toString()));
                    trabajador.setId_equipo(equipoL.nombre_to_id(vistaO.comboBoxEquipo.getSelectedItem().toString()));
                    if (operarioL.modificar(trabajador)) {
                        JOptionPane.showMessageDialog(null, "Trabajador actualizado correctamente");
                        limpiarcajas();
                    } else {
                        JOptionPane.showMessageDialog(null, "Error actualizar trabajador");
                        limpiarcajas();
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "Algun campo esta incorrecto");
            }
        }
        //BORRAR
        if (ae.getSource() == vistaO.botonBorrar) {
            if ("".equals(vistaO.cajaBuscar.getText()) || "".equals(vistaO.caja_ID.getText())) {
                JOptionPane.showMessageDialog(null, "Introduzca el Numero de operario y seleccione BUSCAR ");
            } else {
                operario.setId_Trabajador(Integer.parseInt(vistaO.caja_ID.getText()));
                if (operarioL.borrar(operario)) {
                    JOptionPane.showMessageDialog(null, "Se elimino correctamente el operario");
                    limpiarcajas();
                } else {
                    JOptionPane.showMessageDialog(null, "No se pudo eliminar el operario");
                    limpiarcajas();
                }
            }
        }
        //LIMPIAR
        if (ae.getSource() == vistaO.botonLimpiar) {
            limpiarcajas();
        }
        //VISTAPRINCIPAL
        if (ae.getSource() == vistaO.botonIPrincipal) {
            limpiarcajas();
            vistaO.setVisible(false);
            vistaP.setVisible(true);
        }
        //Login
        if (ae.getSource() == vistaO.botonLogout) {
            vistaO.setVisible(false);
            vistaL.setVisible(true);
        }
        //CERRAR
        if (ae.getSource() == vistaO.botonCerrar) {
            System.exit(0);
        }
        //SELECCION CATEGORIA
        selecCategoria();
    }

    //METODO SELECCION CATEGORIA
    public void selecCategoria() {
        String funcion = (String) vistaO.comboBoxCategoria.getSelectedItem();
        if (funcion.equals("Operario")) {
            visibleCheck();
        }
        if (funcion.equals("Coordinador")) {
            invisibleCheck();
        }
        if (funcion.equals("Seleccione categoría")) {
            invisibleCheck();
        }
    }

    //METODO LIMPIAR
    public void limpiarcajas() {
        vistaO.cajaBuscar.setText(null);
        vistaO.cajaNumOperario.setText(null);
        vistaO.cajaNombre.setText(null);
        vistaO.cajaApellidos.setText(null);
        vistaO.cajaTelefono.setText(null);
        vistaO.checkP1.setSelected(false);
        vistaO.checkP2.setSelected(false);
        vistaO.checkP3.setSelected(false);
        vistaO.checkP4.setSelected(false);
        vistaO.checkP5.setSelected(false);
        vistaO.caja_ID.setText(null);
        vistaO.comboBoxCategoria.setSelectedIndex(0);
        vistaO.comboBoxEquipo.setSelectedIndex(0);
    }

    //METODO visibleCheck
    public void visibleCheck() {
        vistaO.LabelPuesto.setVisible(true);
        vistaO.checkP1.setVisible(true);
        vistaO.checkP2.setVisible(true);
        vistaO.checkP3.setVisible(true);
        vistaO.checkP4.setVisible(true);
        vistaO.checkP5.setVisible(true);
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

}
