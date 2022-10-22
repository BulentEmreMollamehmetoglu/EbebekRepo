package org.example;

public class Employee {
    private String name;
    private double salary;
    private int workHours;
    private int hireYear;
    private int year = 2021;
    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getWorkHours() {
        return workHours;
    }

    public void setWorkHours(int workHours) {
        this.workHours = workHours;
    }

    public int getHireYear() {
        return hireYear;
    }

    public void setHireYear(int hireYear) {
        this.hireYear = hireYear;
    }

    public double tax(){ // 1000
        int taxAppliedOnSalary = 0;
        if(this.salary < 1000){
            //ToDO do not applied tax
        }
        taxAppliedOnSalary = (int) (this.salary* 3) / 100;
        return taxAppliedOnSalary;
    }

    public int bonus(){
        int bonusSalary = 0;
        if(this.workHours > 40){
            bonusSalary = (workHours - 40) * 30;
        }
        return bonusSalary;
    }
    public double raiseSalary(){
        double newRaise = 0;
        if((this.year - this.hireYear) < 10){
            newRaise = ((this.salary *5) / 100);
        }
        else if((this.year - this.hireYear) > 9 && (this.year - this.hireYear) < 20){
            newRaise = ((this.salary * 10) / 100);
        }
        else if((this.year - this.hireYear) > 19){
            newRaise = ((this.salary * 15) / 100) ;
        }
        return newRaise;
    }
    @Override
    public String toString(){
        String toPrint = "Adı : " +this.name + "\n"+ "Maaşı : " +this.salary + "\n" + "Çalışma Saati : " +this.workHours + "\n" + "Başlangıç Yılı : " + this.hireYear + "\n" + "Vergi : " + this.tax() + "\n" + "Bonus : " + this.bonus() + "\n" + "Maaş Artışı : " + this.raiseSalary() + "\n" + "Vergi ve Bonuslar ile birlikte maaş : " + (this.salary + this.bonus() - this.tax()) + "\n" + "Toplam Maaş : " +  (this.salary+ this.raiseSalary()+ this.bonus() -this.tax());
        System.out.println(toPrint);
        return toPrint;
    }
}
