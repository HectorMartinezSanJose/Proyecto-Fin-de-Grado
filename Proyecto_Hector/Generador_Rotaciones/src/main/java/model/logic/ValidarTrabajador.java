package main.java.model.logic;

public class ValidarTrabajador {

    public static boolean validarNumOpe(String numT) {

        return numT.matches("^[0-9]*$");
    }

    public static boolean validarNombre(String Nombre) {

        return Nombre.matches("^[a-zA-Z]*$");
    }

    public static boolean validarApellidos(String Nombre) {

        return Nombre.matches("[a-zA-Z]*" + " " + "[a-zA-Z]*");
    }

    public static boolean validarTelefono(String Telef) {

        return Telef.matches("^[0-9]{9}$");
    }

    public static boolean validarPuesto(String Telef) {

        return Telef.matches("^[0-9]{9}$");
    }

    public static boolean validarComboBoxOperario(String funcion) {

        return funcion.contains("Operario");
    }

    public static boolean validarComboBoxCoordinador(String funcion) {

        return funcion.contains("Coordinador");
    }

    public static boolean validarCheck(boolean check) {

        return check;
    }

    public static boolean validarDNI(String dni) {

        return dni.matches("[0-9]{8}[a-z,A-Z]");
    }
}
