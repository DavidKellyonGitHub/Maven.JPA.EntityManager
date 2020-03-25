import entities.Person;
import services.PersonService;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        PersonService ps = new PersonService();
        Person dk = new Person("Dave", "Kelly", "dk@dk.dk", "Male", new Date(), "US");
        ps.persistPerson(dk);
        System.out.println(ps.findByID(dk.getId()));
    }


}