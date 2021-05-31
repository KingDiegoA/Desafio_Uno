package desafioacl.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


@JsonPropertyOrder({ "id", "fechaCreacion", "fechaFin" ,"fechas","fechasFaltantes"})

public class ChallengeAclModelResponse {

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

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @JsonProperty("fechasFaltantes")
    private List<LocalDate> fechasFaltantes = null;

    public ChallengeAclModelResponse() {
        this.fechaCreacion =null;
        this.fechaFin=null;
        this.fechas=new ArrayList<LocalDate>();
        this.fechasFaltantes=new ArrayList<LocalDate>();
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

    public List<LocalDate> getFechasFaltantes() {
        return fechasFaltantes;
    }

    public void setFechasFaltantes(List<LocalDate> fechasFaltantes) {
        this.fechasFaltantes = fechasFaltantes;
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
        builder.append(fechasFaltantes);
        builder.append("]");
        return builder.toString();
    }
}




