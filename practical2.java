import java.util.Scanner;
class Main
{
  public static void main(String[] args){
    double asalary, mrate, drate, hrate, atax, mtax, npay;
    Scanner input = new Scanner(System.in);
	System.out.println("Enter Annual Salary: ");
     asalary = input.nextDouble();

    atax = 0;
    if (asalary <= 250000){
        atax = 0;
    }else if (asalary >= 250000 && asalary < 400000){
        atax = 30000 * 0.2;
    }else if (asalary >= 400000 && asalary < 800000){
        atax = 30000 + (0.25 * (asalary - 400000));
    }else if (asalary >= 800000 && asalary < 20000000){
        atax = 130000 + (0.3 * (asalary - 800000));
    }else if (asalary >= 250000 && asalary < 400000){
        atax = 490000 + (0.32 * (asalary - 2000000));
    }else if (asalary >= 250000 && asalary < 400000){
        atax = 2410000 + (0.35 * (asalary - 8000000));}
    
    String[] Salary = {"Your Annual Salary: " + String.format("%.2f", asalary), "Your Monthly Rate: " + String.format("%.2f", mrate = asalary/12), "Your Daily Rate: " + String.format("%.2f", drate = mrate/22), "Your Hourly Rate: "+ String.format("%.2f", hrate = drate/8), "Your Annual Tax Deduction: " + String.format("%.2f", atax), "Your Monthly Tax Deduction: " + String.format("%.2f", mtax = atax/12), "Net Pay: " + String.format("%.2f", npay = mrate-mtax)};
    for (String x : Salary) 
  System.out.println(x);}
}