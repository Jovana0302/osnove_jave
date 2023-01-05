package d29_12_2022;

public class SmartAirConditioning {
    public String brand;
    public int consumptionCool;
    public int consumptionHeat;
    public int temperature;
    public String mode;

    public void print(){
        System.out.println(this.brand + " - " + this.mode + " - " + this.temperature);
    }

    public int monthlyConsumption(){
        int monthlyConsumption;
        if (mode.equals("heat")){
            monthlyConsumption = 30 * 15 * consumptionHeat;
        } else if (mode.equals("cool")){
            monthlyConsumption = 30 * 15 * consumptionCool;
        } else {
            monthlyConsumption = 0;
        }
        return monthlyConsumption;
    }

    public int monthlyBill(){
        int monthlyBill;
        if (monthlyConsumption() <= 350) {
            monthlyBill = monthlyConsumption() * 6;
        } else {
            monthlyBill = monthlyConsumption() * 9;
        }
        return monthlyBill;
    }

}
