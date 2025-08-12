package styp.com.lab13;

import java.sql.Timestamp;


public class VentaDTO
{
private int codigoventa;
private String cliente;
private Timestamp fecha;

    public VentaDTO() {
    }

    public VentaDTO(int codigoventa, String cliente, Timestamp fecha) {
        this.codigoventa = codigoventa;
        this.cliente = cliente;
        this.fecha = fecha;
    }

    public int getCodigoventa() {
        return codigoventa;
    }

    public void setCodigoventa(int codigoventa) {
        this.codigoventa = codigoventa;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public Timestamp getFecha() {
        return fecha;
    }

    public void setFecha(Timestamp fecha) {
        this.fecha = fecha;
    }
}
