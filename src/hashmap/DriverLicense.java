package hashmap;

public class DriverLicense {
    private int id;
    private String name;

    public DriverLicense(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return name;
    }
}

