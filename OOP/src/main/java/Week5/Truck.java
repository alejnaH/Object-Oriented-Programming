package Week5;

public class Truck extends Vehicle implements Repairable {

    public Truck(String modelName) {
        super(modelName);
    }

    public Truck(String modelName, int mileage, int health) {
        super(modelName, mileage, health);
    }

    @Override
    public int expectedLifespan() {
        return 300000;
    }

    @Override
    public String repair() {
        setHealth(100);
        return "Engine overhauled and tires replaced for " + getModelName();
    }

    @Override
    public String service() {
        return "Servicing Truck: " + getModelName() + "\nInspecting engine, brakes, and suspension." +
                "\nMileage: " + getMileage() + ", Health: " + getHealth();
    }

    public void haul(int loadWeight) {
        if (loadWeight > 5000) {
            setHealth(getHealth() - (int)(loadWeight * 0.01));
        } else {
            setHealth(getHealth() - (int)(loadWeight * 0.005));
        }

        if (getHealth() < 30) {
            System.out.println("Health is low! Reducing expected lifespan.");
            int reducedLifespan = calculateRemainingLifespan() - 20000;
            System.out.println("New remaining lifespan: " + reducedLifespan + " miles.");
        }
    }
}