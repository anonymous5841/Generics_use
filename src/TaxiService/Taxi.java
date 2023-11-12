package TaxiService;

import java.util.Objects;

public class Taxi <T> {

    Status status;

   T license;

    int longitude_x;

    int latitude_y;


    public Taxi() {
    }

    public Taxi(Status status,T license, int longitude_x,int latitude_y) {
        this.status = status;
        this.license = license;
        this.longitude_x = longitude_x;
        this.latitude_y = latitude_y;

    }


//    @Override
//    public boolean equals(Object obj) {
//
//        if(obj == this.status){
//            return true;
//        }
//        else {
//            return false;
//        }
//    }


    @Override
    public String toString() {
        return "Taxi: " + "status=" + status + ", license=" + license + ", longitude_x=" + longitude_x + ", latitude_y=" + latitude_y ;
    }
}
