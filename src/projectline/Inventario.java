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
public class Inventario {
    int  mesas, sillas, bocinas, cantidad, apartado;
    String nombre;

    public int getMesas() {
        return mesas;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getApartado() {
        return apartado;
    }

    public void setApartado(int apartado) {
        this.apartado = apartado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setMesas(int mesas) {
        this.mesas = mesas;
    }

    public int getSillas() {
        return sillas;
    }

    public void setSillas(int sillas) {
        this.sillas = sillas;
    }

    public int getBocinas() {
        return bocinas;
    }

    public void setBocinas(int bocinas) {
        this.bocinas = bocinas;
    }
}
