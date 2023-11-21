
package logica;

import java.util.UUID;

public class Expediente {
    private UUID id;
    private Paciente mascota;
    private Cita cita; // Nuevo atributo para el ID de la cita
    private String diagnostico;
    private String fecha;
    private String veterinario;
    private double precioConsulta;

    public Expediente(Paciente mascota, Cita cita, String diagnostico, String veterinario, double precioConsulta) {
        this.id = UUID.randomUUID(); // Generar un ID único
        this.mascota = mascota;
        this.cita = cita;
        this.diagnostico = diagnostico;
        this.fecha = new String(); // Fecha actual
        this.veterinario = veterinario;
        this.precioConsulta = precioConsulta;
    }

    // Getters y setters para todos los atributos

    public UUID getId() {
        return id;
    }

    public Paciente getMascota() {
        return mascota;
    }

    public String getDiagnostico() {
        return diagnostico;
    }
    public Cita getCita() {
        return cita;
    }

    public void setCita(Cita cita) {
        this.cita = cita;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getFecha() {
        return fecha;
    }

    public String getVeterinario() {
        return veterinario;
    }

    public void setVeterinario(String veterinario) {
        this.veterinario = veterinario;
    }

    public double getPrecioConsulta() {
        return precioConsulta;
    }

    public void setPrecioConsulta(double precioConsulta) {
        this.precioConsulta = precioConsulta;
    }

    @Override
    public String toString() {
        return "Expediente [cita=" + cita + ", diagnostico=" + diagnostico + ", fecha=" + fecha + ", id=" + id
                + ", mascota=" + mascota + ", precioConsulta=" + precioConsulta + ", veterinario=" + veterinario + "]";
    }
}
