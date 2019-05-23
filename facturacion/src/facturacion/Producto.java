package facturacion;
public class Producto {
    private String codigo;
    private String descripcion;
    private float precio;
    private int stock;

    public Producto(String codigo, String descripcion, float precico, int stock) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precico;
        this.stock = stock;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precico) {
        this.precio = precico;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    
}
