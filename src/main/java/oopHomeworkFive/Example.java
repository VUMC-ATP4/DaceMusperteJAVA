package oopHomeworkFive;

public class Example {
    public static void main(String[] args) {
        Customer customer = new Customer("Dace");
        System.out.println(customer.toString());
        Visit visit = new Visit("Dace", 5);
        System.out.println(visit.toString());

    }
}
