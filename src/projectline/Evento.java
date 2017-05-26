/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectline;

/**
 *
 * @author Manuel
 */
public class Evento {
    int evento_id, area_id, ambientacion_id, entretenimiento_id, personas, banderaS, banderaI, banderaL, banderaP;
    double costo_area, costo_ambi, costo_entreten;
    String evento, dia, mes, anio;

    public int getEvento_id() {
        return evento_id;
    }

    public void setEvento_id(int evento_id) {
        this.evento_id = evento_id;
    }
    double costo_total = costo_area+costo_ambi+costo_entreten;

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }
    String fecha = "'"+anio+"-"+mes+"-"+dia+"'";

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    public int getArea_id() {
        return area_id;
    }

    public void setArea_id(int area_id) {
        this.area_id = area_id;
    }

    public int getAmbientacion_id() {
        return ambientacion_id;
    }

    public void setAmbientacion_id(int ambientacion_id) {
        this.ambientacion_id = ambientacion_id;
    }

    public int getEntretenimiento_id() {
        return entretenimiento_id;
    }

    public void setEntretenimiento_id(int entretenimiento_id) {
        this.entretenimiento_id = entretenimiento_id;
    }

    public int getPersonas() {
        return personas;
    }

    public void setPersonas(int personas) {
        this.personas = personas;
    }

    public int getBanderaS() {
        return banderaS;
    }

    public void setBanderaS(int banderaS) {
        this.banderaS = banderaS;
    }

    public int getBanderaI() {
        return banderaI;
    }

    public void setBanderaI(int banderaI) {
        this.banderaI = banderaI;
    }

    public int getBanderaL() {
        return banderaL;
    }

    public void setBanderaL(int banderaL) {
        this.banderaL = banderaL;
    }

    public int getBanderaP() {
        return banderaP;
    }

    public void setBanderaP(int banderaP) {
        this.banderaP = banderaP;
    }

    public double getCosto_area() {
        return costo_area;
    }

    public void setCosto_area(double costo_area) {
        this.costo_area = costo_area;
    }

    public double getCosto_ambi() {
        return costo_ambi;
    }

    public void setCosto_ambi(double costo_ambi) {
        this.costo_ambi = costo_ambi;
    }

    public double getCosto_entreten() {
        return costo_entreten;
    }

    public void setCosto_entreten(double costo_entreten) {
        this.costo_entreten = costo_entreten;
    }

    public double getCosto_total() {
        return costo_total;
    }

    public void setCosto_total(double costo_total) {
        this.costo_total = costo_total;
    }

    public String getEvento() {
        return evento;
    }

    public void setEvento(String evento) {
        this.evento = evento;
    }
    
    
}
