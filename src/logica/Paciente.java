package logica;

import java.util.UUID;

public class Paciente {
    private UUID id;
    private String nombre;
    private int edad;
    private double peso;
    private double altura;
    private String tipoMascota;
    private String nombreDueno;
    private String raza;

    public Paciente(String nombre, int edad, double peso, double altura,
     String tipoMascota, String nombreDueno, String raza) {
        this.id = UUID.randomUUID(); // Generar un ID único
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
        this.tipoMascota = tipoMascota;
        this.nombreDueno = nombreDueno;
        this.raza = raza;
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

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    @Override
    public String toString() {
        return "Mascota{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", peso=" + peso +
                ", altura=" + altura +
                ", tipoMascota='" + tipoMascota + '\'' +
                ", nombreDueno='" + nombreDueno + '\'' +
                ", raza='" + raza + '\'' +
                '}';
    }

}

