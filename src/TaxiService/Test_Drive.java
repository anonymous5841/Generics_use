package TaxiService;

import java.util.ArrayList;

public class Test_Drive {

    public static void main(String[] args) {

     Customer<Integer> customer = new Customer();
     Taxi<Integer> taxi = new Taxi<>();
        Management m = new Management();

     customer.Customer_Location(34, 65);

        System.out.println(m.Nearest_taxi(customer));

        m.Add_Taxi(new Taxi<>(Status.AVAILABLE, 4512, 1, 1));

        m.Array_sorting();



    }
}
