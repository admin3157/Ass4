package p15;

public class Student extends Person {

    protected int rollNo;

    
    @Override
    public void showDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Roll No: " + rollNo);
    }
}