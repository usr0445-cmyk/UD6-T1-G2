package net.salesianoslacuesta.Pedido;

public class pedido {
    
    private String codigo;
    private String cliente;
    private String producto;
    private boolean paraLlevar;

    public pedido(String codigo, String cliente, String producto, boolean paraLlevar) {
        this.codigo = codigo;
        this.cliente = cliente;
        this.producto = producto;
        this.paraLlevar = paraLlevar;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getCliente() {
        return cliente;
    }

    public String getProducto() {
        return producto;
    }
    

}
