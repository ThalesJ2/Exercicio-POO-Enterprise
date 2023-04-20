package entities;

import java.time.LocalDate;
import java.util.Date;

public class HourContract {

    private Integer hours;
    private Double valuePerHours;
    private LocalDate date;

    public HourContract() {
    }

    public HourContract(Integer hours, Double valuePerHours, LocalDate date) {
        setHours(hours);
        setValuePerHours(valuePerHours);
        this.date = date;
    }

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        if(hours > 0)
            this.hours = hours;
    }

    public Double getValuePerHours() {
        return valuePerHours;
    }

    public void setValuePerHours(Double valuePerHours) {
        if(valuePerHours > 0)
            this.valuePerHours = valuePerHours;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Double totalValue(){

        return hours * valuePerHours;
    }

    @Override
    public String toString() {
        return "HourContract{" +
                "hours=" + hours +
                ", valuePerHours=" + valuePerHours +
                ", date=" + date +
                '}';
    }
}
