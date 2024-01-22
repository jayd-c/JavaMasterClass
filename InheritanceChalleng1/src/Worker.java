public class Worker {
    protected String name;
    protected String birthDate; //date format mm.dd.yyyy
    protected String endDate;

    public Worker(String name, String birthDate, String endDate) {
        this.name = name;
        this.birthDate = birthDate;
        this.endDate = endDate;
    }

    public int getAge () {
        int birthYear = Integer.parseInt(birthDate.substring(birthDate.length()-4));
        return 2024 - birthYear;
    }

    public double collectPay () {
        return 0.0;
    }

    public void terminate (String endDate) {
        System.out.println(name + " retired on " + endDate);
    }

}
