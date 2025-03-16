package composit.devices;

import composit.devices.abstracts.SmartDevice;

public class Light extends SmartDevice {
    private String name;

    public Light(String name) {
        this.name = name;
    }

    @Override
    public void turnOn() {
        System.out.println(name + " is ON");
    }

    @Override
    public void turnOff() {
        System.out.println(name + " is OFF");
    }
}