import java.util.ArrayList;

public class Aula {
    private static int countId = 1;
    private int id;
    private int maxStudents;
    private Materia materia;
    private String materiaDestinada;
    private int totalStudents = 0;
    private boolean works = false;
    private Profesor profesor;
    public Estudiante student;
    ArrayList<Integer> estudiantes = new ArrayList<>();

    public void addStudent(Integer student) {
        estudiantes.add(student);
        totalStudents++;
    }

    public Aula(int maxStudents) {
        this.maxStudents = maxStudents;
        this.id = countId;
        countId++;
    }

    public int getId() {
        return this.id;
    }

    public int getMaxStudents() {
        return this.maxStudents;
    }

    public void setMaxStudents(int maxStudents) {
        this.maxStudents = maxStudents;
    }

    public boolean isWorks() {
        return this.works;
    }

    public void setUso(int index) {
        System.out.println("Ingrese la materia correspondiente al aula: \n0 Matematicas \n 1Filosofia \n2Fisica");
        this.materiaDestinada = materia.tipoMateria[index];
    }

    public boolean setWorks() {
        if ((profesor.materiaAsignada == this.materiaDestinada)
                && ((totalStudents <= maxStudents) && (totalStudents >= (maxStudents / 2)))
                && (profesor.isAvailable())) {
            this.works = true;
        }
        return this.works;
    }

    public boolean getWorks() {
        return works;
    }
}
