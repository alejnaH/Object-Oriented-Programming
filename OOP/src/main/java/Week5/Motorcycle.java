package Week5;

public class Motorcycle extends Vehicle {

        public Motorcycle(String modelName) {
            super(modelName);
        }

        public Motorcycle(String modelName, int mileage, int health) {
            super(modelName, mileage, health);
        }

        @Override
        public int expectedLifespan() {
            return 50000;
        }

        @Override
        public String service() {
            return "Servicing Motorcycle: " + getModelName() + "\nLubricating chain and tuning the engine." +
                    "\nMileage: " + getMileage() + ", Health: " + getHealth();
        }

        public void race(int raceMiles) {
            setMileage(getMileage() + raceMiles);
            setHealth(getHealth() - (int)(raceMiles * 0.1));

            if (getHealth() < 40) {
                System.out.println("Health is low after racing! Reducing expected lifespan.");
                int reducedLifespan = calculateRemainingLifespan() - 5000;
                System.out.println("New remaining lifespan: " + reducedLifespan + " miles.");
            }
        }
    }


