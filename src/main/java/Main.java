import services.PersonService;

public class Main {

    public static void main(String[] args) {


        PersonService ps = new PersonService();
        System.out.println( ps.findByID(25).getFirst_name());
    }
}