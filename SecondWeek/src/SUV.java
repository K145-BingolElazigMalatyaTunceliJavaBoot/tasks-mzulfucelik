public class SUV extends Car
 {

    private double dailyRental;
    private double accountFormonthlyRental;
    private double accountFordailyRental;

    public SUV(){
        super();
        super.setdailyRental(true);
        super.setmonthlyRental(true);
    }


    public SUV(double luggageCapacity, int age,double dailyRental){
        super ();
        super.setdailyRental(true);
        super.setmonthlyRental(true);
        this.dailyRental=dailyRental;
    }

    public double accountFormonthlyRental() {
        return this.dailyRental +(super.getluggageCapacity()/100+super.age()*30);
    }

    public double accountForDaily() {
        return this.dailyRental +(super.getluggageCapacity()/100+super.age());
    }

    public double getdailyRental() {
        return dailyRental;
    }

    public void setdailyRental(double dailyRental) {
        this.dailyRental = dailyRental;
    }

 }