package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightFinder {

    public boolean findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> airportMap = new HashMap<>();
        airportMap.put("PVG", true);
        airportMap.put("LAX", true);
        airportMap.put("ORD", false);
        airportMap.put("WAW", true);

        if (!airportMap.containsKey(flight.getArrivalAirport())) {
            throw new RouteNotFoundException("Arrival airport not found: " + flight.getArrivalAirport());
        }

        return airportMap.get(flight.getArrivalAirport());
    }
}
