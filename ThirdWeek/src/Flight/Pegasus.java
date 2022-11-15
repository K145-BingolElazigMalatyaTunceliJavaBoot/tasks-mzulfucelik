package Flight;
public class Pegasus extends FlightK implements CateringService {


    @Override
    public int abroadCatering() {
        System.out.println("Yiyecek ve içecek servimiz bulunmaktadır.");


        int ticketPrice ; (boolean business = false;);{

            setBusiness(business);
            if (isBusiness()) {
                int price = (5 * getBusinessPrice());
                return price;
            } else {
                return super.getEconomicPrice();
            }

        }
    }

    @Override
    public void domesticCatering() {

    }

    @Override
    public int ticketPrice(boolean business) {
        return 0;
    }
}