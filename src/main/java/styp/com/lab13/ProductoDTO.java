package styp.com.lab13;

public class ProductoDTO {
    private int codigoproducto;
    private String nombre;
    private double precio;

    public ProductoDTO() {
    }


    public ProductoDTO(int codigoproducto, String nombre, double precio) {
        this.codigoproducto = codigoproducto;
        this.nombre = nombre;
        this.precio = precio;
    }

    public int getCodigoproducto() {
        return codigoproducto;
    }

    public void setCodigoproducto(int codigoproducto) {
        this.codigoproducto = codigoproducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
