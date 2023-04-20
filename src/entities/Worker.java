package entities;

import java.util.ArrayList;

public class Worker {

    private String name;
    private  WorkerLevel level;
    private Double baseSalary;
    private ArrayList<HourContract> contract = new ArrayList<>();
    private Department department;


    public Worker() {
    }

    public Worker(String name, WorkerLevel level, Double baseSalary, ArrayList<HourContract> contract, Department department) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.contract = contract;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public void setLevel(WorkerLevel level) {
        this.level = level;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public ArrayList<HourContract> getContract() {
        return contract;
    }

    public void setContract(ArrayList<HourContract> contract) {
        this.contract = contract;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", level=" + level +
                ", baseSalary=" + baseSalary +
                ", contract=" + contract +
                ", department=" + department +
                '}';
    }

    public  void addContract(HourContract contract){
        this.contract.add(contract);
    }

    public void  removeContract(HourContract contract){
       int pos =  this.contract.indexOf(contract);
       if(pos != -1){
           this.contract.remove(pos);
       }
    }




}
