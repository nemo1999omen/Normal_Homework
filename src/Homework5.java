import java.util.Scanner;
public class Homework5 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        Employees[] massive = new Employees[5];
        for(int i=0; i<5; i++){
            System.out.println("Данные сотрудника №" + (i+1));
            massive[i] = new Employees(sc.next(), sc.next(), sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt());
        }
        System.out.println("________________________");
        System.out.println("Работники старше 40");
        System.out.println("________________________");
        for(int j=0; j<5; j++){
            if(massive[j].age > 40){
                System.out.println("Сотрудник №" + (j+1) + "|Full Name: " + massive[j].fullName + " |Position: " + massive[j].position + " |Email: " + massive[j].email + " |Phone number: " + massive[j].phoneNumber + " |Salary: " + massive[j].salary + " |Age: " + massive[j].age);
            }
        }
    }
}
