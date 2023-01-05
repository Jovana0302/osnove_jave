package d29_12_2022;

public class Zadatak3 {
    public static void main(String[] args) {
        SmartAirConditioning samsung = new SmartAirConditioning();
        samsung.brand = "Samsung";
        samsung.consumptionCool = 1;
        samsung.consumptionHeat = 2;
        samsung.temperature = 30;
        samsung.mode = "heat";

        samsung.print();

        System.out.println("Monthly electricity consumption: " + samsung.monthlyConsumption() + " kW/h");

        System.out.println("Monthly bill: " + samsung.monthlyBill() + " RSD");
    }
}
