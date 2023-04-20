import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.WorkerLevel;

import java.sql.SQLOutput;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args) {


        ArrayList<Worker> workers = new ArrayList<>();
        LocalDate date  =  LocalDate.of(2023,04,17);

        ArrayList<HourContract> hours =  new ArrayList<>();
        hours.add(new HourContract(20,30.5,date));
        workers.add(new Worker("Thales", WorkerLevel.JUNIOR,5000.0,hours,new Department("TI")));


        workers.get(0).addContract(new HourContract(5,60.5,date));
        System.out.println(workers.toString());
        System.out.println(hours.get(1).totalValue());
        workers.get(0).removeContract(hours.get(0));
        System.out.println(workers.toString());
    }
}
