package logica;

import java.util.UUID;

public class Mascota {
    private UUID id;
    private String nombre;
    private int edad;
    private double peso;
    private double altura;
    private String tipoMascota;
    private String nombreDueno;

    public Mascota(String nombre, int edad, double peso, double altura, String tipoMascota, String nombreDueno) {
        this.id = UUID.randomUUID(); // Generar un ID único
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
        this.tipoMascota = tipoMascota;
        this.nombreDueno = nombreDueno;
    }

    // Getters y setters para todos los atributos

    public UUID getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getTipoMascota() {
        return tipoMascota;
    }

    public void setTipoMascota(String tipoMascota) {
        this.tipoMascota = tipoMascota;
    }

    public String getNombreDueno() {
        return nombreDueno;
    }

    public void setNombreDueno(String nombreDueno) {
        this.nombreDueno = nombreDueno;
    }

    @Override
public String toString() {
    return "Mascota [ID=" + id + ", Nombre=" + nombre + ", Edad=" + edad + " años, Peso=" + peso + " kg, Altura=" + altura + " m, Tipo=" + tipoMascota + ", Dueño=" + nombreDueno + "]";
}

}

