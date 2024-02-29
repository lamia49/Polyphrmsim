public class Car implements Vehicel{
    private String model;
    private int days;
    public static final double delayRate=50.0;

    public Car(String model, int days) {
        this.model = model;
        this.days = days;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    @Override
    public double calculateRentalCost() {
        return days*delayRate;
    }

    @Override
    public void displayDetails() {
        System.out.println("Car Model "+model);
        System.out.println("Daily Retnal Cost: "+delayRate);
        System.out.println("Rental Cost: "+calculateRentalCost());

    }


}
