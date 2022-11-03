package CollectionPractice2;

public class HeavyBox {

    private String name;
    private Double weight;

    public HeavyBox() {
    }

    public HeavyBox(String name, Double weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "HeavyBox: " + name + " " + weight;
    }
}
