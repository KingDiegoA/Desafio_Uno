package desafioacl.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@JsonPropertyOrder({ "id", "fechaCreacion", "fechaFin" ,"fechas"})


public class ChallengeAclModelRequest {

    @JsonProperty("id")
    private Long id = null;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @JsonProperty("fechaCreacion")
    private LocalDate fechaCreacion = null;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @JsonProperty("fechaFin")
    private LocalDate fechaFin = null;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @JsonProperty("fechas")
    private List<LocalDate> fechas = null;

    public ChallengeAclModelRequest() {
        this.fechaCreacion =null;
        this.fechaFin=null;
        this.fechas=new ArrayList<LocalDate>();
    }

    public Long id() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public List<LocalDate> getFechas() {
        return fechas;
    }

    public void setFechas(List<LocalDate> fechas) {
        this.fechas = fechas;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("PeriodoGenerado [id=");
        builder.append(id);
        builder.append(", fechaCreacion=");
        builder.append(fechaCreacion);
        builder.append(", fechaFin=");
        builder.append(fechaFin);
        builder.append(", fechas=");
        builder.append(fechas);
        builder.append("]");
        return builder.toString();
    }
}
