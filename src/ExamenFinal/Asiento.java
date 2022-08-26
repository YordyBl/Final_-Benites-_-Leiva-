/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExamenFinal;

/**
 *
 * @author jordy
 */
public class Asiento {
    private int nroAsiento;
    private char fila;
    private String estado;

    public Asiento(int nroAsiento, char fila, String estado) {
        this.nroAsiento = nroAsiento;
        this.fila = fila;
        this.estado = estado;
    }

    public int getNroAsiento() {
        return nroAsiento;
    }

    public void setNroAsiento(int nroAsiento) {
        this.nroAsiento = nroAsiento;
    }

    public char getFila() {
        return fila;
    }

    public void setFila(char fila) {
        this.fila = fila;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Asiento{" + "nroAsiento=" + nroAsiento + ", fila=" + fila + ", estado=" + estado + '}';
    }
   
}
