/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import java.util.Date;

/**
 *
 * @author Test
 */
public class Principal {
    
    public static void main(String[] args) {
        // Crear objetos de Mascota
        Mascota mascota1 = new Mascota("Firulais", 3, 12.5, 0.5, "Perro", "Juan Pérez");
        Mascota mascota2 = new Mascota("Mishi", 2, 5.0, 0.2, "Gato", "Ana Gómez");

        // Crear objetos de Expediente
        Expediente expediente1 = new Expediente(mascota1, "Vacunación", "Dr. López", 50.0);
        Expediente expediente2 = new Expediente(mascota2, "Control de peso", "Dra. Rodríguez", 35.0);

        // Crear objetos de Cita
        Cita cita1 = new Cita(new Date(), "10:00 AM", "Dr. García", mascota1, "Control de rutina");
        Cita cita2 = new Cita(new Date(), "15:30 PM", "Dra. Martínez", mascota2, "Vacunación");

        // Mostrar información utilizando el método toString()
        System.out.println("Información de la mascota 1:");
        System.out.println(mascota1);

        System.out.println("\nInformación del expediente 1:");
        System.out.println(expediente1);

        System.out.println("\nInformación de la cita 1:");
        System.out.println(cita1);
    }
    
}
