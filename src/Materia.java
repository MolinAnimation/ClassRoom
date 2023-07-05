public class Materia {
    String tipoMateria[] = { "Matematicas", "Filosofia", "Fisica" };
    String seleccion;

    public Materia(int index) {
        this.seleccion = this.tipoMateria[index];
    }
}
