import java.util.Random;

public class Profesor extends Persona implements Disponibilidad {
    Materia materia;
    String materiaAsignada;

    public Profesor(String name, int age, String gender, Materia materia) {

        this.name = name;
        this.age = age;
        this.gender = gender;
        this.materia = materia;
    }

    @Override
    public boolean isAvailable() {

        Random random = new Random();
        double valorAleatorio = random.nextDouble();
        if (valorAleatorio <= 0.2) {
            this.available = false;
        } else {
            this.available = true;
        }
        return this.available;
    }

    public void setMateriaAsignada(int index) {
        this.materiaAsignada = materia.tipoMateria[index];
    }

    @override
    public void setAula() {

    }
}
