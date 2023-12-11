package dojo;

import java.util.List;

public class Order {
    private String owner;
    private String target;
    private List<String> cocktails;

    public void declareOwner(String owner) {
        this.owner = owner;
    }

    public void declareTarget(String target) {
        this.target = target;
    }

    public List<String> getCocktails() {
        return cocktails;
    }
}
