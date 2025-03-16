package devices;

import devices.abstracts.SmartDevice;

public class Thermostat extends SmartDevice {
    private int temperature = 22;

    @Override
    public void turnOn() {
        System.out.println("Термостат включен.");
    }

    @Override
    public void turnOff() {
        System.out.println("Термостат выключен.");
    }

    public void setTemperature(int temp) {
        temperature = temp;
        System.out.println("Температура установлена на " + temp + "°C");
    }

    @Override
    public String getStatus() {
        return "Термостат: " + temperature + "°C";
    }
}
