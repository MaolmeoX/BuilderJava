package Entity;

public class TypeRoue {

    private String name;

    @Override
    public String toString() {
        return "TypeRoue{" +
                "name='" + name + '\'' +
                '}';
    }

    public TypeRoue(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
