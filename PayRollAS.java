package HWforCh7;
public class PayRollAS {
    public static void main(String[]args){//calling sethours,setpayrate, and printgrosspay methods
        PayRollAS payroll = new PayRollAS();
        payroll.setHours(0,40);
        payroll.setPayRate(0,25);
        payroll.printGrossPay(5658845);
    }
    private int[]employeeId = {5658845,4520125,7895122,8777541,8451277,1302850,7580489};
    private int[]hours = new int[7];
    private double[]payRate = new double[7];
    private double[]wages = new double[7];
    ////////////////////////////////////////////////
    //Gets and sets Employee ID
    public int getEmployeeId(int index){
        return employeeId[index];
    }
    public void setEmployeeId(int index, int employeeId){
        this.employeeId[index] = employeeId;
    }
    ////////////////////////////////////////////////
    //Gets and sets # of hours 
    public int getHours(int index){
        return hours[index];
    }
    public void setHours(int index, int hours){
        this.hours[index]=hours;
    }
    /////////////////////////////////////////////////
    //Gets and sets hourly pay rate
    public double getPayRate(int index){
        return payRate[index];
    }
    public void setPayRate(int index, double payRate){
        this.payRate[index]=payRate;
    }
    ////////////////////////////////////////////////
    //Gets wages or salary 
    public double getWages(int index){
        return wages[index];
    }
    public void setWages(int index, double wages){
        this.wages[index] = wages;
    }
    /////////////////////////////////////////////////
    //Calculates the gross pay of that employee
    public double getGrossPay(int employeeId) {
        for (int index = 0; index<this.employeeId.length;index++) {
            if (this.employeeId[index] == employeeId) {
                return hours[index] * payRate[index];
            }
        }
        return -1; // returns -1 if employee ID is not found
    }
    ///////////////////////////////////////////////
    //Prints gross pay of that employee in PayRollDemoAS.java
    public void printGrossPay(int employeeId){
        double grossPay = getGrossPay(employeeId);
        if(grossPay!=-1){
            System.out.println("Gross pay for employee Id " + employeeId + " is: $" + grossPay);
        }
        else{
            System.out.println("Employe Id not found");
        }
    }
}
/*
 * Write a Payroll class that uses the following arrays as fields:
 * employeeId. An array of seven integers to hold employee identification numbers:
 * 5658845, 4520125, 7895122, 8777541, 8451277, 1302850, 7580489
 * hours. An array of seven integers to hold the number of hours worked by each employee
 * payRate. An array of seven doubles to hold each employee’s hourly pay rate
 * wages. An array of seven doubles to hold each employee’s gross wages
 * The class should relate the data in each array through the subscripts.
 * For example, the num-ber in element 0 of the hours array should be the number of hours 
 * worked by the employee whose identification number is stored in element 0 of the employeeId array.
 * That same employee’s pay rate should be stored in element 0 of the payRate array. 
 * In addition to the appropriate accessor and mutator methods, 
 * the class should have a method that accepts an employee’s identification number as an argument 
 * and returns the gross pay for that employee.
 */