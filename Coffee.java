// Ma'laijah Garris


public class Coffee {

    // Instance variables
    private String name;           // The name of the coffee
    private double caffeineContent; // The caffeine content per cup in mg

    // Default constructor: sets default values
    public Coffee() {
        this.name = "none";
        this.caffeineContent = 50; // Default caffeine content in mg
    }

    // Parameterized constructor (optional but useful)
    public Coffee(String name, double caffeineContent) {
        setName(name);
        setCaffeineContent(caffeineContent);
    }

    // Accessor (getter) for name
    public String getName() {
        return name;
    }

    // Mutator (setter) for name
    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        } else {
            this.name = "none"; // Default if invalid name is given
        }
    }

    // Accessor (getter) for caffeine content
    public double getCaffeineContent() {
        return caffeineContent;
    }

    // Mutator (setter) for caffeine content
    // Only accepts values between 50 and 300 mg
    public void setCaffeineContent(double caffeineContent) {
        if (caffeineContent >= 50 && caffeineContent <= 300) {
            this.caffeineContent = caffeineContent;
        } else {
            this.caffeineContent = 50; // Default if invalid value
        }
    }

    // RiskyAmount method
    // Calculates the number of cups before it would be dangerous to consume more
    // Formula: cups = 180.0 / ((caffeineContent / 100.0) * 6.0)
    public double riskyAmount() {
        double cups = 180.0 / ((caffeineContent / 100.0) * 6.0);
        return cups;
    }

    // toString method for printing details easily (optional)
    public String toString() {
        return name + " (" + caffeineContent + " mg caffeine)";
    }
}

