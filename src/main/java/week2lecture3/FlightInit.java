package week2lecture3;

import week2lecture3.vehicle.Flight;

public class FlightInit {

    public static void main(String[] args) {

        Flight flight1 = new Flight("Kyiv", 210, "Boing", 12, "Monday");

        Flight flight2 = new Flight("Paris", 211, "Airbus", 15, "Tuesday");

        Flight flight3 = new Flight("NY", 212, "Boing", 12, "Monday");

        Flight flight4 = new Flight("Amsterdam", 215, "Airbus", 18, "Wednesday");

        Flight flight5 = new Flight("LA", 220, "Boing", 12, "Saturday");



        Flight allFlights = (kyiv, paris, ny, amsterdam, la);
        printFlightForCity("Paris",allFlights);
        printFlightsForDay("Monday", allFlights, 12);



        }
        private static void printFlightForCity (String tripTo, Flight[] flights)  {

            for (int i = 0; i < flights.length; i++) {
                if(flights[i].getTripTo().equals(tripTo)){
                    System.out.println(" Flight to " + tripTo + " : "
                            + flights[i].getFlightNumber()
                    );
                }
            }
        }

    private static void printFlightsForDay (String day, Flight[] flights, int date)  {

        for (int i = 0; i < flights.length; i++) {
            String days = flights[i].getDays();
            for (int j = 0; j < day.length; j++) {
                if (days[j].equals(day) && flights[i].date>date) {
                    System.out.println(" Flight on " + day + " : " + date + " July 2023 " + " Flight number : "
                            + flights[i].getFlightNumber()) ;


                }
            }

        }
    }
    }




