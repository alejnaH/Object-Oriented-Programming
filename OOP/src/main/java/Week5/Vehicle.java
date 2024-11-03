package Week5;

public abstract class Vehicle {
    private String modelName;
    private int mileage;
    private int health;

    public Vehicle(String modelName) {
        this(modelName, 0, 100); // Default mileage 0 and health 100
    }

    public Vehicle(String modelName, int mileage, int health) {
        this.modelName = modelName;
        this.mileage = mileage;
        setHealth(health);
    }

    public String getModelName() {
        return modelName;
    }

    public int getMileage() {
        return mileage;
    }

    public int getHealth() {
        return health;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public void setHealth(int health) {
        if (health < 0) {
            this.health = 0;
        } else if (health > 100) {
            this.health = 100;
        } else {
            this.health = health;
        }
    }

    public abstract String service();
    public abstract int expectedLifespan();

    public boolean needsMaintenance() {
        return health < 70;
    }

    public int calculateRemainingLifespan() {
        int lifespan = expectedLifespan();
        if (health < 50) {
            lifespan = (int) (lifespan * ((double) health / 100));
        }
        return Math.max(lifespan - mileage, 0);
    }

    public void simulateYear() {
        int halfLifespan = expectedLifespan() / 2;
        if (mileage > halfLifespan) {
            setHealth(getHealth() - 5);
        }
        System.out.println("After simulating a year, the health of " + modelName + " is now: " + health);
    }

    public void performMaintenance(Vehicle vehicle) {
        if (vehicle instanceof Car) {
            Car car = (Car) vehicle;
            System.out.println(car.repair());
            car.drive(100);
        } else if (vehicle instanceof Truck) {
            Truck truck = (Truck) vehicle;
            System.out.println(truck.repair());
            truck.haul(5000);
        } else if (vehicle instanceof Motorcycle) {
            Motorcycle motorcycle = (Motorcycle) vehicle;
            motorcycle.race(50);
        }
    }
}
