package oopHomeworkFive;

public class Customer {

    private String name;
    private boolean member = false;
    private String memberType;


    public String getName() {
        return name;
    }

    public Customer (String name){
        this.name = name;
    }

    public boolean isMember() {
        return member;
    }

    public void setMember(boolean member) {
        this.member = member;
    }

    public void setMemberType(String memberType) {
        this.memberType = memberType;
    }




}
