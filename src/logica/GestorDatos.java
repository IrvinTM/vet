package logica;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GestorDatos {
    private Map<String, Expediente> expedientes;
    private List<Cita> citas;

    public GestorDatos() {
        expedientes = new HashMap<>();
        citas = new ArrayList<>();
    }

    public void agregarCita(Cita cita) {
        citas.add(cita);
    }

    public void removerCita(Cita cita) {
        citas.remove(cita);
    }

    public List<Cita> getCitas() {
        return citas;
    }

    public void agregarExpediente(Expediente expediente) {
        expedientes.put(expediente.getNumero(), expediente);
    }

    public void removerExpediente(Expediente expediente) {
        expedientes.remove(expediente.getNumero());
    }

    public Expediente getExpediente(String numero) {
        return expedientes.get(numero);
    }

    private class Expediente {
        private String numero;
        private String nombre;
        private String especie;
        private String raza;
        private String sexo;
        private String color;
        private String fechaNacimiento;
        private String propietario;
        private String telefonoPropietario;
        private String direccionPropietario;
        private String observaciones;

        public Expediente(String numero, String nombre, String especie, String raza, String sexo, String color,
                String fechaNacimiento, String propietario, String telefonoPropietario, String direccionPropietario,
                String observaciones) {
            this.numero = numero;
            this.nombre = nombre;
            this.especie = especie;
            this.raza = raza;
            this.sexo = sexo;
            this.color = color;
            this.fechaNacimiento = fechaNacimiento;
            this.propietario = propietario;
            this.telefonoPropietario = telefonoPropietario;
            this.direccionPropietario = direccionPropietario;
            this.observaciones = observaciones;
        }

        public String getNumero() {
            return numero;
        }

        public String getNombre() {
            return nombre;
        }

        public String getEspecie() {
            return especie;
        }

        public String getRaza() {
            return raza;
        }

        public String getSexo() {
            return sexo;
        }

        public String getColor() {
            return color;
        }

        public String getFechaNacimiento() {
            return fechaNacimiento;
        }

        public String getPropietario() {
            return propietario;
        }

        public String getTelefonoPropietario() {
            return telefonoPropietario;
        }

        public String getDireccionPropietario() {
            return direccionPropietario;
        }

        public String getObservaciones() {
            return observaciones;
        }
    }
}
