package com.kodilla.testing.weather.stub;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        return temperatures.getTemperatures();
    }

    public double calculateAverageTemperature() {
        Map<String, Double> temperaturesMap = temperatures.getTemperatures();
        double sum = 0;
        for (double temperature : temperaturesMap.values()) {
            sum += temperature;
        }
        return sum / temperaturesMap.size();
    }

    public double calculateMedianTemperature() {
        List<Double> temperaturesList = new ArrayList<>(temperatures.getTemperatures().values());
        Collections.sort(temperaturesList);
        int size = temperaturesList.size();
        int centreOfSize = size / 2;
        if (size % 2 == 0) {
            return (temperaturesList.get(centreOfSize - 1) + temperaturesList.get(centreOfSize)) / 2;
        } else {
            return temperaturesList.get(centreOfSize);
        }
    }
}