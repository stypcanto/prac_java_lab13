package styp.com.lab13;

public class DetalleVentaDTO {
    private int codigoventa;
    private int codigoproducto;
    private double cantidad;
    private double descuento;

    public DetalleVentaDTO(int codigoventa, int codigoproducto, double cantidad, double descuento) {
        this.codigoventa = codigoventa;
        this.codigoproducto = codigoproducto;
        this.cantidad = cantidad;
        this.descuento = descuento;
    }

    public DetalleVentaDTO() {
    }



    public int getCodigoventa() {
        return codigoventa;
    }

    public void setCodigoventa(int codigoventa) {
        this.codigoventa = codigoventa;
    }

    public int getCodigoproducto() {
        return codigoproducto;
    }

    public void setCodigoproducto(int codigoproducto) {
        this.codigoproducto = codigoproducto;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }
}
