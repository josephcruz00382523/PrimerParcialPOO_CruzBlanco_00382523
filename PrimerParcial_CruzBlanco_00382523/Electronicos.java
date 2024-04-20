public abstract class  Electronicos {

    protected String nombre;
    protected  String modelo;

    protected String descripcion;
    protected double precio;

    protected long ID=1;




    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public long getID(){
        return  ID;
    }
    public void setID(long ID){
        this.ID = ID;
    }



}
