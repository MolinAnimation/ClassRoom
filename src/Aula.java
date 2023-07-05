import java.util.ArrayList;
import java.util.StringJoiner;

public class Aula {
    private static int countId = 1;
    private int id;
    private int maxStudents;
    private Materia materia;
    private String materiaDestinada;
    private int totalStudents = 0;
    private boolean works = false;
    private Profesor profesor;
    protected int profesorId;
    public Estudiante student;
    ArrayList<Estudiante> estudiantes = new ArrayList<>();

    public void addStudent(Estudiante student) {
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

    public void setTeacher(Profesor profesor) {
        this.profesor = profesor;
    }

    public String getApprovedStudents() {
        ArrayList<Integer> approvedStudents = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        if (works) {

            for (Estudiante std : estudiantes) {
                if (std.getScore() >= 6) {
                    approvedStudents.add(std.getId());
                }
            }
            for (Integer aS : approvedStudents) {
                sb.append(aS);
            }
        }
        return sb.toString();
    }
}
