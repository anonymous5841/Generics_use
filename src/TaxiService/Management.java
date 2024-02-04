package TaxiService;

import java.util.ArrayList;

public class Management <T>{

    ArrayList<Taxi> list = new ArrayList<>(4);
    Customer c;
    double location;
    int x , y;
    Taxi taxi;
    Status s = Status.AVAILABLE;

    Management() {

        list.add( new Taxi(Status.AVAILABLE, 4512, 34, 23));
        list.add( new Taxi(Status.AVAILABLE, 4565, 87, 65));
        list.add( new Taxi(Status.AVAILABLE, 4523, 32, 65));
        list.add( new Taxi(Status.NOT_AVAILABLE, 4587, 88, 31));

    }

    public void Add_Taxi(Taxi taxi) {
        list.add(taxi);
    }

    public double Distance_Calculator(int i){

        x = (int)list.get(i).longitude_x - (int)c.longitude_x;
        y = (int)list.get(i).latitude_y - (int)c.latitude_y;
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }


    public String Nearest_taxi(Customer c){
        this.c = c;
        double location1;
        int x1=0;

        location = Distance_Calculator(0);

        for (int i = 1; i < list.size(); i++) {

            location1 = Distance_Calculator(i);

            if (location > location1 && list.get(i).status.getValue() == 1) {
                location = location1;
                x1 = i;
            }
        }

        return  "Taxi that is near to your location is: \n" + list.get(x1) +", Distance= " + (int)Distance_Calculator(x1) + " mile" + ", Fair= " + "Rs." + Fair_calculation() + "\n";
    }

    public Object Fair_calculation(){

        c.Fair =(int) (23 * location);
        return c.Fair;
    }

    public void Array_sorting(){

        Taxi taxi1;

        for (int i = 0; i < list.size(); i++) {

            for (int j = 0; j < list.size()-1 ; j++) {

                if(Distance_Calculator(j) > Distance_Calculator(j+1)){
                    taxi1 = list.get(j);
                    list.set(j, list.get(j+1));
                    list.set(j+1, taxi1);

            }

            }
        }

        System.out.println("Sorted List from nearest to farthest:");
        for (Taxi t: list) {

            System.out.println(t);
        }

    }

}
