public class HatchBack extends Car
 {
    private static final double luggageCapacity =1;
    private static final int age =1;

    private double dailyRental;

    private double invoiceForgetdailyRental;

    public HatchBack(){
        super();
        super.setdailyRental(true);

    }


    public HatchBack(double luggageCapacity, int age, double dailyRental){
        super();
        super.setdailyRental(true);

        this.dailyRental= dailyRental;
    }



    public double invoiceFordailyRental() {
        return this.dailyRental +(super.getluggageCapacity()/100+super.age());
    }

    public double getdailyRental() {
        return dailyRental;
    }

    public void setdailyRental(double dailyRental) {
        this.dailyRental = dailyRental;
    }


 }
