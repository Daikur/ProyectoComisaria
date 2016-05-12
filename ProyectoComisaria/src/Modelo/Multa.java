package Modelo;

import java.sql.Date;

public class Multa {
    private Integer id;
    private String descripcion;
    private Date fecha;
    private Double importe;
    private Integer idpolicia;
    private Integer nifinfractor;
    private Integer idtipo;

    public Multa(Integer id, String descripcion, Date fecha, Double importe, Integer idpolicia, Integer nifinfractor, Integer idtipo) {
        this.id = id;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.importe = importe;
        this.idpolicia = idpolicia;
        this.nifinfractor = nifinfractor;
        this.idtipo = idtipo;
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

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Double getImporte() {
        return importe;
    }

    public void setImporte(Double importe) {
        this.importe = importe;
    }

    public Integer getIdpolicia() {
        return idpolicia;
    }

    public void setIdpolicia(Integer idpolicia) {
        this.idpolicia = idpolicia;
    }

    public Integer getNifinfractor() {
        return nifinfractor;
    }

    public void setNifinfractor(Integer nifinfractor) {
        this.nifinfractor = nifinfractor;
    }

    public Integer getIdtipo() {
        return idtipo;
    }

    public void setIdtipo(Integer idtipo) {
        this.idtipo = idtipo;
    } 
}
