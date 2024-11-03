package Week5;

public class Car extends Vehicle implements Repairable {

    public Car(String modelName) {
        super(modelName);
    }

    public Car(String modelName, int mileage, int health) {
        super(modelName, mileage, health);
    }


    @Override
    public int expectedLifespan() {
        return 150000;
    }

    @Override
    public String repair() {
        setHealth(100);
        return "Engine tuned and oil changed for " + getModelName();
    }

    @Override
    public String service() {
        return "Servicing Car: " + getModelName() + "\nChecking engine and changing oil." +
                "\nMileage: " + getMileage() + ", Health: " + getHealth();
    }

    public void drive(int miles) {
        setMileage(getMileage() + miles);
        setHealth(getHealth() - (int)(miles * 0.05));

        if (getHealth() < 30) {
            System.out.println("Health is low! Reducing expected lifespan.");
            int reducedLifespan = calculateRemainingLifespan() - 10000;
            System.out.println("New remaining lifespan: " + reducedLifespan + " miles.");
        }
    }
}
