/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import java.util.UUID;
import java.util.Date;

public class Cita {
    private UUID id;
    private Date fecha;
    private String hora;
    private String veterinario;
    private Paciente mascota;
    private String motivo;

    public Cita(Date fecha, String hora, String veterinario, Paciente mascota, String motivo) {
        this.id = UUID.randomUUID(); // Generar un ID único
        this.fecha = fecha;
        this.hora = hora;
        this.veterinario = veterinario;
        this.mascota = mascota;
        this.motivo = motivo;
    }

    // Getters y setters para todos los atributos

    public UUID getId() {
        return id;
    }

    public Date getFecha() {
        return fecha;
    }

    public String getHora() {
        return hora;
    }

    public String getVeterinario() {
        return veterinario;
    }

    public Paciente getMascota() {
        return mascota;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    @Override
    public String toString() {
        return "Cita [id=" + id + ", fecha=" + fecha + ", hora=" + hora + ", veterinario=" + veterinario + ", mascota="
                + mascota + ", motivo=" + motivo + "]";
    }
}
