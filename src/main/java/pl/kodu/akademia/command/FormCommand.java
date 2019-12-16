package pl.kodu.akademia.command;

public class FormCommand {
    private int weight;
    private int height;
    private int id;

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public FormCommand() {

    }

    @Override
    public String toString() {
        return "FormCommand{" +
                "weight='" + weight + '\'' +
                ", height='" + height + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
