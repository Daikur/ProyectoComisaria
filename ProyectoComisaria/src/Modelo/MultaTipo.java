package Modelo;

public class MultaTipo {
    
    private Integer id;
    private String descripcion;
    private Double importe;
    private TipoMultas tipo;
    private Integer carnetpuntos;

    public MultaTipo(Integer id, String descripcion, Double importe, TipoMultas tipo, Integer carnetpuntos) {
        this.id = id;
        this.descripcion = descripcion;
        this.importe = importe;
        this.tipo = tipo;
        this.carnetpuntos = carnetpuntos;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Double getImporte() {
        return importe;
    }

    public void setImporte(Double importe) {
        this.importe = importe;
    }

    public TipoMultas getTipo() {
        return tipo;
    }

    public void setTipo(TipoMultas tipo) {
        this.tipo = tipo;
    }

    public Integer getCarnetpuntos() {
        return carnetpuntos;
    }

    public void setCarnetpuntos(Integer carnetpuntos) {
        this.carnetpuntos = carnetpuntos;
    }
    
}
