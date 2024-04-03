package main.java.model.beans;

import java.sql.Date;

public class Rotacion {

    private int id_rotacion;
    private int num_rotacion;
    private Date fecha;
    private int id_equipo;
    private int id_coordinador;
    private int p1;
    private int p2;
    private int p3;
    private int p4;
    private int p5;

    public Rotacion() {
    }

    public Rotacion(int id_equipo, int id_coordinador) {
        this.id_equipo = id_equipo;
        this.id_coordinador = id_coordinador;
    }


    /*
    private int r1p1;
    private int r1p2;
    private int r1p3;
    private int r1p4;
    private int r1p5;
    
    private int r2p1;
    private int r2p2;
    private int r2p3;
    private int r2p4;
    private int r2p5;
    
    private int r3p1;
    private int r3p2;
    private int r3p3;
    private int r3p4;
    private int r3p5;
    
    private int r4p1;
    private int r4p2;
    private int r4p3;
    private int r4p4;
    private int r4p5;
    
    private int r5p1;
    private int r5p2;
    private int r5p3;
    private int r5p4;
    private int r5p5;
    
    public Rotacion() {}

    public int getId_rotacion() {
        return id_rotacion;
    }

    public void setId_rotacion(int id_rotacion) {
        this.id_rotacion = id_rotacion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getId_equipo() {
        return id_equipo;
    }

    public void setId_equipo(int id_equipo) {
        this.id_equipo = id_equipo;
    }

    public int getId_coordinador() {
        return id_coordinador;
    }

    public void setId_coordinador(int id_coordinador) {
        this.id_coordinador = id_coordinador;
    }

    public int getR1p1() {
        return r1p1;
    }

    public void setR1p1(int r1p1) {
        this.r1p1 = r1p1;
    }

    public int getR1p2() {
        return r1p2;
    }

    public void setR1p2(int r1p2) {
        this.r1p2 = r1p2;
    }

    public int getR1p3() {
        return r1p3;
    }

    public void setR1p3(int r1p3) {
        this.r1p3 = r1p3;
    }

    public int getR1p4() {
        return r1p4;
    }

    public void setR1p4(int r1p4) {
        this.r1p4 = r1p4;
    }

    public int getR1p5() {
        return r1p5;
    }

    public void setR1p5(int r1p5) {
        this.r1p5 = r1p5;
    }

    public int getR2p1() {
        return r2p1;
    }

    public void setR2p1(int r2p1) {
        this.r2p1 = r2p1;
    }

    public int getR2p2() {
        return r2p2;
    }

    public void setR2p2(int r2p2) {
        this.r2p2 = r2p2;
    }

    public int getR2p3() {
        return r2p3;
    }

    public void setR2p3(int r2p3) {
        this.r2p3 = r2p3;
    }

    public int getR2p4() {
        return r2p4;
    }

    public void setR2p4(int r2p4) {
        this.r2p4 = r2p4;
    }

    public int getR2p5() {
        return r2p5;
    }

    public void setR2p5(int r2p5) {
        this.r2p5 = r2p5;
    }

    public int getR3p1() {
        return r3p1;
    }

    public void setR3p1(int r3p1) {
        this.r3p1 = r3p1;
    }

    public int getR3p2() {
        return r3p2;
    }

    public void setR3p2(int r3p2) {
        this.r3p2 = r3p2;
    }

    public int getR3p3() {
        return r3p3;
    }

    public void setR3p3(int r3p3) {
        this.r3p3 = r3p3;
    }

    public int getR3p4() {
        return r3p4;
    }

    public void setR3p4(int r3p4) {
        this.r3p4 = r3p4;
    }

    public int getR3p5() {
        return r3p5;
    }

    public void setR3p5(int r3p5) {
        this.r3p5 = r3p5;
    }

    public int getR4p1() {
        return r4p1;
    }

    public void setR4p1(int r4p1) {
        this.r4p1 = r4p1;
    }

    public int getR4p2() {
        return r4p2;
    }

    public void setR4p2(int r4p2) {
        this.r4p2 = r4p2;
    }

    public int getR4p3() {
        return r4p3;
    }

    public void setR4p3(int r4p3) {
        this.r4p3 = r4p3;
    }

    public int getR4p4() {
        return r4p4;
    }

    public void setR4p4(int r4p4) {
        this.r4p4 = r4p4;
    }

    public int getR4p5() {
        return r4p5;
    }

    public void setR4p5(int r4p5) {
        this.r4p5 = r4p5;
    }

    public int getR5p1() {
        return r5p1;
    }

    public void setR5p1(int r5p1) {
        this.r5p1 = r5p1;
    }

    public int getR5p2() {
        return r5p2;
    }

    public void setR5p2(int r5p2) {
        this.r5p2 = r5p2;
    }

    public int getR5p3() {
        return r5p3;
    }

    public void setR5p3(int r5p3) {
        this.r5p3 = r5p3;
    }

    public int getR5p4() {
        return r5p4;
    }

    public void setR5p4(int r5p4) {
        this.r5p4 = r5p4;
    }

    public int getR5p5() {
        return r5p5;
    }

    public void setR5p5(int r5p5) {
        this.r5p5 = r5p5;
    }*/
    public int getId_rotacion() {
        return id_rotacion;
    }

    public void setId_rotacion(int id_rotacion) {
        this.id_rotacion = id_rotacion;
    }

    public int getNum_rotacion() {
        return num_rotacion;
    }

    public void setNum_rotacion(int num_rotacion) {
        this.num_rotacion = num_rotacion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getId_equipo() {
        return id_equipo;
    }

    public void setId_equipo(int id_equipo) {
        this.id_equipo = id_equipo;
    }

    public int getId_coordinador() {
        return id_coordinador;
    }

    public void setId_coordinador(int id_coordinador) {
        this.id_coordinador = id_coordinador;
    }

    public int getP1() {
        return p1;
    }

    public void setP1(int p1) {
        this.p1 = p1;
    }

    public int getP2() {
        return p2;
    }

    public void setP2(int p2) {
        this.p2 = p2;
    }

    public int getP3() {
        return p3;
    }

    public void setP3(int p3) {
        this.p3 = p3;
    }

    public int getP4() {
        return p4;
    }

    public void setP4(int p4) {
        this.p4 = p4;
    }

    public int getP5() {
        return p5;
    }

    public void setP5(int p5) {
        this.p5 = p5;
    }

}
