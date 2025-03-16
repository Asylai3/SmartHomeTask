package composit.devices;

import composit.devices.abstracts.SmartDevice;

public class Thermostat extends SmartDevice {
    @Override
    public void turnOn() {
        System.out.println("Thermostat is ON");
    }

    @Override
    public void turnOff() {
        System.out.println("Thermostat is OFF");
    }
}
