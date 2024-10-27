package Week4.People;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Person> people = new ArrayList<Person>();

        people.add( new Teacher("Abby Sydney", "Korsontie Street 1 03100 Vantaa", 1200, 47, "Finland") );
        people.add( new Student("James", "Ida Albergintie Street 1 00400 Helsinki" ,19, "Finland", 25, 1904789));
        printDepartment(people);

        System.out.println("---------------------------------------------");

        //a

        Person pekka = new Person("Pekka Mikkola",  "Korsontie Street 1 03100 Vantaa", 24, "America");
        System.out.println();
        Person esko = new Person("Esko Ukkonen ", "Mannerheimintie Street 15 00100 Helsinki", 34, "Finland");
        System.out.println(pekka);
        System.out.println(esko);

        System.out.println("---------------------------------------------");

        //b

        //Student olli = new Student("Olli", "Ida Albergintie Street 1 00400 Helsinki");
        //System.out.println(olli);
        //System.out.println("credits: " + olli.credits());
        //olli.study();
        //System.out.println("credits:  "+ olli.credits());

        //System.out.println("---------------------------------------------");

        //c

        Teacher sally = new Teacher("Sally Roger", "Roties 37 03100 Censki", 1200, 26, "Russia");
        Teacher eski = new Teacher("Eski Shaulzer", "Mannerheimintie 15 Street 00100 Demabo", 5400, 39, "Romania");
        System.out.println( sally  );
        System.out.println( eski );

        System.out.println("---------------------------------------------");



        Student olli = new Student("Olli", "Ida Albergintie 1 Street 00400 Helsinki", 21, "Finland", 20, 3123819);
        for (int i = 0; i < 25; i++) {
            olli.study();
        }
        olli.addGrade(85);
        olli.addGrade(92);
        System.out.println(olli);
        System.out.println("  Credits: " + olli.getCredits());

    }

    //d

    public static void printDepartment(List<Person> people) {
        for(Person p : people) {
            System.out.println(p);
        }
    }

}
