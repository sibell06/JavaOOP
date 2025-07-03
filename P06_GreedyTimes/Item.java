package P06_GreedyTimes;

public class Item {
    private String name;
    private long quantity;
    private String type;

    public Item(String name, long quantity, String type) {
        this.name = name;
        this.quantity = quantity;
        this.type = type;
    }

    public Item(String name, long quantity) {
        this.name = name;
        this.quantity = quantity;
        this.type = determineType(name);
    }

    private String determineType(String name){
        if (name.length() == 3){
            return "Cash";
        } else if (name.length() >= 4 && name.toLowerCase().endsWith("gem")) {
            return "Gem";
            
        } else if (name.equalsIgnoreCase("gold")) {
            return "Gold";
        }
        return "";
    }

    public String getName() {
        return name;
    }

    public long getQuantity() {
        return quantity;
    }

    public String getType() {
        return type;
    }
    public boolean isValid(){
        return !type.isEmpty();
    }
}
