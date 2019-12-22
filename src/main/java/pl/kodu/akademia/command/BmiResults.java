package pl.kodu.akademia.command;

public class BmiResults {

    private int weight;
    private int height;
    private double bmi;

    private String id;

    public BmiResults() {
    }

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BmiResults that = (BmiResults) o;

        if (weight != that.weight) return false;
        if (height != that.height) return false;
        if (Double.compare(that.bmi, bmi) != 0) return false;
        return id != null ? id.equals(that.id) : that.id == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = weight;
        result = 31 * result + height;
        temp = Double.doubleToLongBits(bmi);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (id != null ? id.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "BmiResults{" +
                "weight=" + weight +
                ", height=" + height +
                ", bmi=" + bmi +
                ", id='" + id + '\'' +
                '}';
    }
}

