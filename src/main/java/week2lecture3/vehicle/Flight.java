package week2lecture3.vehicle;

public class Flight {
    public String tripTo; // пункт назначения
    public int flightNumber; // номер рейса
    public String airCraft; // тип самолета
    public int date; // время вылета
    public String days; // дни недели


        public String getTripTo () {
            return tripTo;
        }

        public void setTripTo (String tripTo){
            this.tripTo = tripTo;
        }

        public int getFlightNumber () {
            return flightNumber;
        }

        public void setFlightNumber ( int flightNumber){
            this.flightNumber = flightNumber;
        }

        public String getAirCraft () {
            return airCraft;
        }

        public void setAirCraft (String airCraft){
            this.airCraft = airCraft;
        }

        public int getDate () {
            return date;
        }

        public void setDate ( int date){
            this.date = date;
        }

        public String getDays () {
            return days;
        }

        public void setDays (String days){
            this.days = days;
        }

    public Flight(String tripTo, int flightNumber, String airCraft,int date, String days){

    }
}