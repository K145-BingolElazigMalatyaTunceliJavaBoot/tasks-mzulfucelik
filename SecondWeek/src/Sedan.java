public class Sedan extends Car
 {
    private double dailyRental;
    private double accountFormonthlyRental;
    private double accountFordailyRental;

    public Sedan(){
        super();
        super.setdailyRental(true);
        super.setMonthlyRental(true);
    }

    public Sedan(double luggageCapacity, int age) {
        super();
    }


    public void Sedan(double luggageCapacity, int age, double dailyRental){

        super.setdailyRental(true);
        super.setmonthlyRental(true);
        this.dailyRental=dailyRental;

    }

    public double invoiceFormonthlyRental() {
        return this.dailyRental +(super.getluggageCapacity()/100+super.age()*30);
    }

    public double invoiceFordailyRental() {
        return this.dailyRental +(super.getluggageCapacityy()/100+super.age());
    }

    public double getdailyRental() {
        return dailyRental;
    }

    public void setdailyRental(double dailyRental) {
        this.dailyRental = dailyRental;
    }
 }