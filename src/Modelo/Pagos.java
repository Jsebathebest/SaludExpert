package Modelo;

import java.util.Date;

/**
 *
 * @author Sebastian
 */
public class Pagos {

    //Crear atributos
    int idPago;
    int idCita;
    String tipoPago;
    String numeroTarjeta;
    double monto;
    Date fechaPago;

    //Crear constructor
    public Pagos() {
    }

    //Llenar constructor
    public Pagos(int idPago,
            int idCita,
            String tipoPago,
            String numeroTarjeta,
            double monto,
            Date fechaPago) {
        this.idPago = idPago;
        this.idCita = idCita;
        this.tipoPago = tipoPago;
        this.numeroTarjeta = numeroTarjeta;
        this.monto = monto;
        this.fechaPago = fechaPago;
    }
    
    //Agregar Getters y Setters

    public int getIdPago() {
        return idPago;
    }

    public void setIdPago(int idPago) {
        this.idPago = idPago;
    }

    public int getIdCita() {
        return idCita;
    }

    public void setIdCita(int idCita) {
        this.idCita = idCita;
    }

    public String getTipoPago() {
        return tipoPago;
    }

    public void setTipoPago(String tipoPago) {
        this.tipoPago = tipoPago;
    }

    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public Date getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(Date fechaPago) {
        this.fechaPago = fechaPago;
    }
    
}
