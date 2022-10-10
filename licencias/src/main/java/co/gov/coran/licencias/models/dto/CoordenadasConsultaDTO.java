package co.gov.coran.licencias.models.dto;

import java.math.BigDecimal;
import java.util.Date;

public class CoordenadasConsultaDTO {
    private Integer linea;
    private BigDecimal capta_sec;
    private BigDecimal vert_sec;
    private BigDecimal sistema_coordenadas;
    private String nombre_sistema_coordenadas;
    private BigDecimal x;
    private BigDecimal Y;
    private String municipio;
    private String nivel_subsiguiente;
    private BigDecimal cota;
    private String descripcion;
    private String Observaciones;
    private Date Fecha_creacion;
    private String creado_por;


    public Integer getLinea() {
        return linea;
    }

    public void setLinea(Integer linea) {
        this.linea = linea;
    }

    public BigDecimal getCapta_sec() {
        return capta_sec;
    }

    public void setCapta_sec(BigDecimal capta_sec) {
        this.capta_sec = capta_sec;
    }

    public BigDecimal getVert_sec() {
        return vert_sec;
    }

    public void setVert_sec(BigDecimal vert_sec) {
        this.vert_sec = vert_sec;
    }

    public BigDecimal getSistema_coordenadas() {
        return sistema_coordenadas;
    }

    public void setSistema_coordenadas(BigDecimal sistema_coordenadas) {
        this.sistema_coordenadas = sistema_coordenadas;
    }

    public String getNombre_sistema_coordenadas() {
        return nombre_sistema_coordenadas;
    }

    public void setNombre_sistema_coordenadas(String nombre_sistema_coordenadas) {
        this.nombre_sistema_coordenadas = nombre_sistema_coordenadas;
    }

    public BigDecimal getX() {
        return x;
    }

    public void setX(BigDecimal x) {
        this.x = x;
    }

    public BigDecimal getY() {
        return Y;
    }

    public void setY(BigDecimal y) {
        Y = y;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getNivel_subsiguiente() {
        return nivel_subsiguiente;
    }

    public void setNivel_subsiguiente(String nivel_subsiguiente) {
        this.nivel_subsiguiente = nivel_subsiguiente;
    }

    public BigDecimal getCota() {
        return cota;
    }

    public void setCota(BigDecimal cota) {
        this.cota = cota;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getObservaciones() {
        return Observaciones;
    }

    public void setObservaciones(String observaciones) {
        Observaciones = observaciones;
    }

    public Date getFecha_creacion() {
        return Fecha_creacion;
    }

    public void setFecha_creacion(Date fecha_creacion) {
        Fecha_creacion = fecha_creacion;
    }

    public String getCreado_por() {
        return creado_por;
    }

    public void setCreado_por(String creado_por) {
        this.creado_por = creado_por;
    }
}
