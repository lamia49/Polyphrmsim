public class Truck implements Vehicel{
    private String type;
    private int week;
    public static final double weeklyRate=500.0;

    public Truck(String type, int week) {
        this.type = type;
        this.week = week;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getWeek() {
        return week;
    }

    public void setWeek(int week) {
        this.week = week;
    }

    @Override
    public double calculateRentalCost() {
        return weeklyRate*week;
    }

    @Override
    public void displayDetails(){
        System.out.println("Truck Typr "+type);
        System.out.println("Weekly Retnal Cost: "+weeklyRate);
        System.out.println("Rental Cost: "+calculateRentalCost());

    }
}
