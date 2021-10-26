package HotelRervationSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class HotelReservation {
    static Scanner scanner = new Scanner(System.in);

    public  void hoteldetails(String Hotel) {
        int i;
        String  hotel,ratesforregular, rewardcustomer, o;
        ArrayList<String> list = new ArrayList<String>();
        for(i=0;i<3;i++)
        {
            System.out.println("enter hotel name");
            Hotel = scanner.nextLine();
            System.out.println("enter the rates for for customer");
            ratesforregular = scanner.next();
            System.out.println("enter the reward customer");
            rewardcustomer = scanner.next();

            list.add("hotel name:" + Hotel);
            list.add("rates:" + ratesforregular);
            list.add("rewardcustomer" + rewardcustomer);
        }

        System.out.println(list);

    }

    public static void main(String[] args) {
        //Displaying the Welcome Message
        System.out.println("Welcome to Hotel Reservation System");
        HotelReservation hotelreservation=new HotelReservation();
        hotelreservation.hoteldetails("lakewood");

    }


}
