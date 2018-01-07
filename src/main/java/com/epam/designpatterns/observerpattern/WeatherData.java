package com.epam.designpatterns.observerpattern;

public class WeatherData {

    private float temperature;
    private float humidity;
    private float pressure;

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        temperature = temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public void setHumidity(float humidity) {
        humidity = humidity;
    }

    public float getPressure() {
        return pressure;
    }

    public void setPressure(float pressure) {
        pressure = pressure;
    }

    public void measurmentsChanged(){
        float temp = getTemperature();
        float humidity = getHumidity();
        float pressure = getPressure();
    }
}
