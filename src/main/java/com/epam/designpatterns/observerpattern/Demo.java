package com.epam.designpatterns.observerpattern;

import com.epam.designpatterns.observerpattern.displays.impl.CurrentConditionsDisplay;
import com.epam.designpatterns.observerpattern.subjects.impl.WeatherData;

public class Demo {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        weatherData.setMeasurements(80, 65, 30.4f);
    }
}
