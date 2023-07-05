public class main {
    public static void main(String[] args) {
        Materia materia1 = new Materia(0);
        Materia materia2 = new Materia(1);
        Materia materia3 = new Materia(2);

        // Crear tres objetos Profesor utilizando el constructor
        Profesor profesor1 = new Profesor("Juan", 35, "Masculino", materia1);
        Profesor profesor2 = new Profesor("María", 42, "Femenino", materia2);
        Profesor profesor3 = new Profesor("Pedro", 28, "Masculino", materia3);

        Estudiante estudiante1 = new Estudiante("Carlos", 20, "Masculino");
        Estudiante estudiante2 = new Estudiante("Ana", 19, "Femenino");
        Estudiante estudiante3 = new Estudiante("Juan", 21, "Masculino");
        Estudiante estudiante4 = new Estudiante("María", 22, "Femenino");
        Estudiante estudiante5 = new Estudiante("Pedro", 20, "Masculino");
    }
}
