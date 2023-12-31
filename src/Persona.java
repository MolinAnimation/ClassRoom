public abstract class Persona {

    protected String name;
    protected int age;
    protected String gender;
    protected boolean available;
    protected Aula aula;
    protected int id;
    protected int aulaId;

    public abstract void setAula();

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return this.gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Aula getAula() {
        return this.aula;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
