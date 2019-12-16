package pl.kodu.akademia.command;

public class BmiResults {

    private int weight;
    private int height;
    private double bmi;
    private String id;

    public BmiResults(int weight, int height, double bmi, String id) {
        this.weight = weight;
        this.height = height;
        this.bmi = bmi;
        this.id = id;
    }

    public int getWeight() {
        return weight;
    }

    public int getHeight() {
        return height;
    }

    public double getBmi() {
        return bmi;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

