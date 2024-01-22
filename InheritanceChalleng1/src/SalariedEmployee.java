public class SalariedEmployee extends Employee{
    private double annualSalary;
    private boolean isRetired;

    public SalariedEmployee(double annualSalary, boolean isRetired,String name, String birthDate, String endDate, long employeeId, String hireDate) {
        super(name,birthDate,endDate,employeeId,hireDate);
        this.annualSalary = annualSalary;
        this.isRetired = isRetired;
    }
    public void retire() {
        String hiredYear = hireDate.substring(hireDate.length()-4);
        String end = endDate.substring(endDate.length()-4);
        int yearsInService = Integer.parseInt(end) - Integer.parseInt(hiredYear);
        double retirementFee = yearsInService * annualSalary;
        System.out.println(name + " is entitled to a retirement benefit of " + retirementFee);
    }
}
