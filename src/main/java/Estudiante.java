public class Estudiante {
    private String nombre;
    private int edad;
    private double nota;
    // debo crear el nodo
    public Estudiante nodo;


    public Estudiante(String nombre, int edad, double nota) {
        this.nombre = nombre;
        this.edad = edad;
        this.nota = nota;
    }


    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public String getNombre() {
        return nombre;
    }
}
