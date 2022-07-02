package oopHomeworkFive;

import java.util.Date;

public class Visit {
    private Customer customer;
    private Date date;
    private double serviceExpense;
    private double productExpense;

    double totalExpense = serviceExpense + productExpense;
    public Visit(String name, Date date){
        this.customer = new Customer(name);
        this.date = date;
    }

    public String getName() {
        return customer.getName();
    }

    public double getServiceExpense() {
        return serviceExpense;
    }

    public void setServiceExpense(){
        this.serviceExpense = serviceExpense;
    }
    public double getProductExpense() {
        return productExpense;
    }

    public void setProductExpense() {
        this.productExpense = productExpense;
    }

    public double getTotalExpense() {
        return totalExpense;
    }

    @Override
    public String toString() {
        return "Visit{" +
                "customer=" + customer +
                ", date=" + date +
                ", serviceExpense=" + serviceExpense +
                ", productExpense=" + productExpense +
                ", totalExpense=" + totalExpense +
                '}';
    }
}
