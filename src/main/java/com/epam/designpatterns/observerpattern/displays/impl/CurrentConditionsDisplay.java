package com.epam.designpatterns.observerpattern.displays.impl;

import com.epam.designpatterns.observerpattern.displays.DisplayElement;
import com.epam.designpatterns.observerpattern.observers.Observer;
import com.epam.designpatterns.observerpattern.subjects.Subject;
import com.epam.designpatterns.observerpattern.subjects.impl.WeatherData;

public class CurrentConditionsDisplay implements Observer, DisplayElement {

    private float temperature;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
    }

    @Override
    public void update(Subject subject) {
        if(subject instanceof WeatherData){
            WeatherData weatherData = (WeatherData)subject;
            temperature = weatherData.getTemperature();
            humidity = weatherData.getHumidity();
            display();
        }
    }
}
