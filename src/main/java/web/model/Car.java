package web.model;

public class Car {
    private String model;
    private String owner;
    private int cost;

    public Car() {

    }

    public Car(String model, String owner, int cost) {
        this.model = model;
        this.owner = owner;
        this.cost = cost;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", owner='" + owner + '\'' +
                ", cost='" + cost + '\'' +
                '}';
    }
}
