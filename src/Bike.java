public class Bike implements Vehicel{

    private String barnd;
    private int hours;
    private  static final double hourRte=10.0;

    public Bike(String barnd, int hours) {
        this.barnd = barnd;
        this.hours = hours;
    }

    public String getBarnd() {
        return barnd;
    }

    public void setBarnd(String barnd) {
        this.barnd = barnd;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    @Override
    public double calculateRentalCost() {
        return hourRte*hours;
    }

    @Override
    public void displayDetails() {
        System.out.println("Bike Brand "+barnd);
        System.out.println("Hourly Retnal Cost: "+hourRte);
        System.out.println("Rental Cost: "+calculateRentalCost());

    }
}
