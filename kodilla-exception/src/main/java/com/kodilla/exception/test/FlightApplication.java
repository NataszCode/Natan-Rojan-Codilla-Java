package com.kodilla.exception.test;

public class FlightApplication {

    public static void main(String[] args) {
        FlightFinder flightFinder = new FlightFinder();
        Flight flight = new Flight("WAW", "ORD");
        Flight flightToLAX = new Flight("WAW", "LAX");
        Flight flightToFRA = new Flight("WAW", "FRA");

        testFlight(flightFinder, flightToFRA);
        testFlight(flightFinder, flight);
        testFlight(flightFinder, flightToLAX);
    }

    private static void testFlight(FlightFinder flightFinder, Flight flight) {
        try {
            boolean canFly = flightFinder.findFlight(flight);
            System.out.println("Can fly to " + flight.getArrivalAirport() + ": " + canFly);
        } catch (RouteNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Flight search completed.");
        }
    }
}