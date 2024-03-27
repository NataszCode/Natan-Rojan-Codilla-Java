package com.kodilla.testing.weather.stub;
import com.kodilla.testing.weather.stub.Temperatures;
import com.kodilla.testing.weather.stub.WeatherForecast;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class WeatherForecastTestSuite {

    @Mock
    private Temperatures temperaturesMock;
    private WeatherForecast weatherForecast;

    @BeforeEach
    void setUp() {
        Map<String, Double> temperaturesMap = new HashMap<>();
        temperaturesMap.put("Rzeszow", 25.5);
        temperaturesMap.put("Krakow", 26.2);
        temperaturesMap.put("Wroclaw", 24.8);
        temperaturesMap.put("Warszawa", 25.2);
        temperaturesMap.put("Gdansk", 26.1);
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
        weatherForecast = new WeatherForecast(temperaturesMock);
    }

    @Test
    void testCalculateForecastWithMock() {
        //When
        int quantityOfSensors = weatherForecast.calculateForecast().size();

        //Then
        Assertions.assertEquals(5, quantityOfSensors);
    }

    @Test
    void testAverageTemperature() {
        //When
        double averageTemperature = weatherForecast.calculateAverageTemperature();

        //Then
        Assertions.assertEquals(25.56, averageTemperature, 0.01);
    }

    @Test
    void testMedianTemperatureOdd() {
        //When
        double medianTemperature = weatherForecast.calculateMedianTemperature();

        //Then
        Assertions.assertEquals(25.5, medianTemperature, 0.01);
    }

    @Test
    void testMedianTemperatureEven() {
        //Given
        Map<String, Double> temperaturesMap = new HashMap<>();
        temperaturesMap.put("City1", 10.0);
        temperaturesMap.put("City2", 20.0);
        temperaturesMap.put("City3", 30.0);
        temperaturesMap.put("City4", 40.0);
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
        weatherForecast = new WeatherForecast(temperaturesMock);

        //When
        double medianTemperature = weatherForecast.calculateMedianTemperature();

        //Then
        Assertions.assertEquals(25.0, medianTemperature, 0.01);
    }


}

// Twoim zadaniem będzie rozbudowa klasy WeatherForecast o 2 dodatkowe metody oraz klasy WeatherForecastTestSuite o 2 dodatkowe testy:
//
//Napisz metodę (i test do niej), która na podstawie danych z interfejsu obliczy średnią temperaturę,
//Napisz metodę (i test do niej), która na podstawie danych z interfejsu obliczy medianę temperatur.
//Zwróć uwagę, że kod odpowiadający za preparowanie danych do mocka może się powtarzać w każdym teście. Postaraj się tego uniknąć – możesz skorzystać z wcześniej poznanych adnotacji @BeforeEach lub @BeforeAll.