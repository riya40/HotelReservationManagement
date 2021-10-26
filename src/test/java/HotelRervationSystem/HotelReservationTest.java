package HotelRervationSystem;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.Assert.*;

public class HotelReservationTest extends HotelReservation {
    HotelReservation  hotelreservation=new HotelReservation();
    @Test
    public void hoteldetailschecking()  {
        boolean hotel1=hotelreservation.hoteldetails();
        Assertions.assertEquals("lakewood",hotel1);
        boolean hotel2=hotelreservation.hoteldetails();
        Assertions.assertEquals("bridgewood",hotel2);
        boolean hotel3=hotelreservation.hoteldetails();
        Assertions.assertEquals("Ridgewood",hotel3);

    }

}