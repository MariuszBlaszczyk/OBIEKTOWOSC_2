package zad6;

public class Pacjent {

    private String name;
    private String lastname;
    private Priority priority;


    public Pacjent(String name, String lastname, Priority priority) {
        this.name = name;
        this.lastname = lastname;
        this.priority = priority;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public Priority getPriority() {
        return priority;
    }

    @Override
    public String toString() {
        return "Pacjent{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", priority=" + priority +
                '}';
    }
}
