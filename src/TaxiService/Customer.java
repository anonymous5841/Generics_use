package TaxiService;

public class Customer <T>{

    T latitude_y;

    T longitude_x;

    T Fair;


    public void Customer_Location(T latitude_y, T longitude_x) {
      this.latitude_y = latitude_y;
      this.longitude_x = longitude_x;
    }


}
