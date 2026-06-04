package net.salesianoslacuesta.Pedido;

public class pedido {
    
    private String codigo;
    private String cliente;
    private String producto;
    private int paraLlevar;

    public pedido(String codigo, String cliente, String producto, int paraLlevar) {
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

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    //
    public int getParaLlevar() {
        return paraLlevar;
    }

    public void setParaLlevar(int paraLlevar) {
        this.paraLlevar = paraLlevar;
    }
    //

    @Override
    public String toString() {
        return "Pedido{" + "codigo='" + codigo + '\'' + ", cliente='" + cliente + '\'' + ", producto='" + producto + '\'' + ", paraLlevar=" + paraLlevar + '}';
    }

    @Override
    public boolean equals(Object obj) {
    pedido otro = (pedido) obj;
    return this.codigo.equals(otro.codigo);
}


}
