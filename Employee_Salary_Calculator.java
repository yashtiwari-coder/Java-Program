import java.util.Scanner;
class Employee_Salary_Calculator {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Basic Salary: ");
        double baseSalary = sc.nextDouble();
        if(baseSalary>=30000){
            baseSalary += baseSalary*0.2 + baseSalary*0.15;
        }else{
            baseSalary += baseSalary*0.1 + baseSalary*0.08;
        }

        baseSalary -= baseSalary*0.12;
        System.out.println("Net Salary; "+baseSalary);
        sc.close();
    }
}