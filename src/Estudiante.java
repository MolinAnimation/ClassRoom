import java.util.Random;

public class Estudiante extends Persona implements Disponibilidad {
    private double score;

    public Estudiante(String name, int age, String gender) {

        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public double getScore() {
        return this.score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public boolean isAvailable() {
        Random random = new Random();
        double valorAleatorio = random.nextDouble();
        if (valorAleatorio <= 0.5) {
            this.available = true;
        } else {
            this.available = false;
        }
        return this.available;
    }

    @override
    public void setAula() {
        aula.addStudent(this.getId());
    }
}
