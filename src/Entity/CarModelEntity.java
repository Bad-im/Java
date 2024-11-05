package Entity;

public class CarModelEntity {
    private int id;
    private String name;

    // Конструкторы, геттеры и сеттеры
    public CarModelEntity() {}

    public CarModelEntity(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
