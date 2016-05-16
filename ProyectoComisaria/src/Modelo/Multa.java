package Modelo;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public class Multa {

    private String descripcion;
    private Date fecha;
    private Double importe;
    private List<String> idPolicia;
    private String nifinfractor;
    private Integer idtipo;

    public Multa(String descripcion, Double importe, List<String> idPolicia, String nifinfractor, Integer idtipo) {
        this.descripcion = descripcion;
        this.importe = importe;
        this.idPolicia = idPolicia;
        this.nifinfractor = nifinfractor;
        this.idtipo = idtipo;
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

    public String getNifinfractor() {
        return nifinfractor;
    }

    public void setNifinfractor(String nifinfractor) {
        this.nifinfractor = nifinfractor;
    }

    public Integer getIdtipo() {
        return idtipo;
    }

    public void setIdtipo(Integer idtipo) {
        this.idtipo = idtipo;
    }

    public List<String> getIdPolicia() {
        return idPolicia;
    }

    public void setIdPolicia(List<String> idPolicia) {
        this.idPolicia = idPolicia;
    }
}
