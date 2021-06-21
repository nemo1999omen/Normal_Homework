public class Employees {
    protected String fullName;
    protected String position;
    protected String email;
    protected int phoneNumber;
    protected int salary;
    protected int age;

    public Employees (String fullName, String position, String email, int phoneNumber, int salary, int age ){
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
        INFO();
    }
    public void INFO(){
        System.out.println("________________________");
        System.out.println("INFO: |Full Name: " + fullName + " |Position: " + position + " |Email: " + email + " |Phone number: " + phoneNumber + " |Salary: " + salary + " |Age: " + age);
        System.out.println("________________________");
    }
}
