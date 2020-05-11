package backend;

// hopefully temporary ingredient object to make it easier to parse
public class EdamamIngredient {
    private String text;
    private double weight;

    public EdamamIngredient(String text, double weight) {
        this.text = text;
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public String getText() {
        return text;
    }
}
