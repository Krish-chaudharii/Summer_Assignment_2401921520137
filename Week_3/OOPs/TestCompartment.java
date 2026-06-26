package Week_3.OOPs;
import java.util.Random;

abstract class Compartment {
    public abstract String notice();
}

class FirstClass extends Compartment {
    public String notice() {
        return "First Class Compartment";
    }
}

class Ladies extends Compartment {
    public String notice() {
        return "Ladies Compartment";
    }
}

class General extends Compartment {
    public String notice() {
        return "General Compartment";
    }
}

class Luggage extends Compartment {
    public String notice() {
        return "Luggage Compartment";
    }
}

public class TestCompartment {
    public static void main(String[] args) {
        Compartment[] coach = new Compartment[10];
        Random rand = new Random();

        for (int i = 0; i < coach.length; i++) {

            int choice = rand.nextInt(4) + 1;
            if(choice == 1) {
                coach[i] = new FirstClass();
            } else if (choice == 2) {
                coach[i] = new Ladies();
            } else if (choice == 3) {
                coach[i] = new General();
            } else {
                coach[i] = new Luggage();
            }
        }

        System.out.println("Compartment Notices:");
        for (int i = 0; i < coach.length; i++) {
            System.out.println(coach[i].notice());
        }
    }
}
