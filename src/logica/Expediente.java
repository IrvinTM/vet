/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import java.util.UUID;
import java.util.Date;

public class Expediente {
    private UUID id;
    private Mascota mascota;
    private UUID idConsulta;
    private String diagnostico;
    private Date fecha;
    private String veterinario;
    private double precioConsulta;

    public Expediente(Mascota mascota, String diagnostico, String veterinario, double precioConsulta) {
        this.id = UUID.randomUUID(); // Generar un ID único
        this.mascota = mascota;
        this.idConsulta = UUID.randomUUID(); // Generar un ID único para la consulta
        this.diagnostico = diagnostico;
        this.fecha = new Date(); // Fecha actual
        this.veterinario = veterinario;
        this.precioConsulta = precioConsulta;
    }

    // Getters y setters para todos los atributos

    public UUID getId() {
        return id;
    }

    public Mascota getMascota() {
        return mascota;
    }

    public UUID getIdConsulta() {
        return idConsulta;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public Date getFecha() {
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
        return "Expediente [id=" + id + ", mascota=" + mascota + ", idConsulta=" + idConsulta + ", diagnostico="
                + diagnostico + ", fecha=" + fecha + ", veterinario=" + veterinario + ", precioConsulta="
                + precioConsulta + "]";
    }
}
