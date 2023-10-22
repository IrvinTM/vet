/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GestorDatos {
    private static final String DATOS_JSON_FILE = "datos.json";
    private ObjectMapper objectMapper = new ObjectMapper();
    private List<Expediente> expedientes = new ArrayList<>();
    private List<Mascota> mascotas = new ArrayList<>();
    private List<Cita> citas = new ArrayList<>();

    public GestorDatos() {
        cargarDatosDesdeArchivo();
    }

    public void agregarExpediente(Expediente expediente) {
        expedientes.add(expediente);
        guardarDatosEnArchivo();
    }

    public void agregarMascota(Mascota mascota) {
        mascotas.add(mascota);
        guardarDatosEnArchivo();
    }

    public void agregarCita(Cita cita) {
        citas.add(cita);
        guardarDatosEnArchivo();
    }

    public List<Expediente> consultarExpedientes() {
        return new ArrayList<>(expedientes);
    }

    public List<Mascota> consultarMascotas() {
        return new ArrayList<>(mascotas);
    }

    public List<Cita> consultarCitas() {
        return new ArrayList<>(citas);
    }

    private void cargarDatosDesdeArchivo() {
        try {
            File archivo = new File(DATOS_JSON_FILE);
            if (archivo.exists()) {
                List<DatosGuardados> datosGuardados = objectMapper.readValue(
                        archivo,
                        new TypeReference<List<DatosGuardados>>() {
                        }
                );
                for (DatosGuardados datos : datosGuardados) {
                    if (datos.getTipo().equals("Expediente")) {
                        expedientes.add((Expediente) datos.getDato());
                    } else if (datos.getTipo().equals("Mascota")) {
                        mascotas.add((Mascota) datos.getDato());
                    } else if (datos.getTipo().equals("Cita")) {
                        citas.add((Cita) datos.getDato());
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void guardarDatosEnArchivo() {
        List<DatosGuardados> datosGuardados = new ArrayList<>();
        for (Expediente expediente : expedientes) {
            datosGuardados.add(new DatosGuardados("Expediente", expediente));
        }
        for (Mascota mascota : mascotas) {
            datosGuardados.add(new DatosGuardados("Mascota", mascota));
        }
        for (Cita cita : citas) {
            datosGuardados.add(new DatosGuardados("Cita", cita));
        }
        try {
            objectMapper.writeValue(new File(DATOS_JSON_FILE), datosGuardados);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
