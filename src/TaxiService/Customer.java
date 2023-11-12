package TaxiService;

public class Customer <T>{

    int latitude_y;

    int longitude_x;

    T Fair;


    public void Customer_Location(int latitude_y, int longitude_x) {
      this.latitude_y = latitude_y;
      this.longitude_x = longitude_x;
    }


}
