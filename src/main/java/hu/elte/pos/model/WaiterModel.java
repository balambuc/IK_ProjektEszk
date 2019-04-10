package hu.elte.pos.model;

public class WaiterModel {

    private String name;
    private int age;
    private String id;

    public WaiterModel(String name, int age, String id) {
        this.age = age;
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String getId() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Name:" + name + ", age:" + age + ", id:" + id;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof WaiterModel) {
            return this.id.equals(((WaiterModel) o).getId());
        } else {
            return false;
        }
    }
}
