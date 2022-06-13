public class Main {
    public static void main(String[] args) {
        /* car class */
        Car porsche = new Car();
        Car holden = new Car();
        porsche.setModel("911");
        System.out.println("Model is " + porsche.getModel());

        System.out.println("_________________");

        /* A simple Calculator */
        SimpleCalculator calculator = new SimpleCalculator();
        calculator.setFirstNumber(25);
        calculator.setSecondNumber(0);
        System.out.println("add = " + calculator.getAdditionResult());
        System.out.println("subtract = " + calculator.getSubtractionResult());
        System.out.println("multiply = " + calculator.getMultiplicationResult());
        System.out.println("division = " + calculator.getDivisionResult());

        System.out.println("_________________");

        /* Person */
        Person person = new Person();
        person.setFirstName("");   // firstName is set to empty string
        person.setLastName("");    // lastName is set to empty string
        person.setAge(10);
        System.out.println("fullName = " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setFirstName("John");    // firstName is set to John
        person.setAge(18);
        System.out.println("fullName = " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setLastName("Smith");    // lastName is set to Smith
        System.out.println("fullName = " + person.getFullName());

        System.out.println("_________________");

        /* Bank Account */
        BankAccount okeyAccess = new BankAccount();
        okeyAccess.setBalance(30000);
        okeyAccess.setEmail("xcellnximo57@gmail.com");
        okeyAccess.setPhoneNumber("0806588379");
        okeyAccess.setAccount("0025582649");
        okeyAccess.deposit(5000);
        okeyAccess.withdrawal(500);
        System.out.println();
        System.out.println(okeyAccess);




    }
}













