package composit.devices;

import composit.devices.abstracts.SmartDevice;

// Листовой узел (отдельное устройство)
public class SingleDevice extends SmartDevice {
    private String name;
    private boolean isOn;

    public SingleDevice(String name) {
        this.name = name;
        this.isOn = false;
    }

    @Override
    public void turnOn() {
        isOn = true;
        System.out.println(name + " включен.");
    }

    @Override
    public void turnOff() {
        isOn = false;
        System.out.println(name + " выключен.");
    }

    @Override
    public String getStatus() {
        return name + ": " + (isOn ? "Включен" : "Выключен");
    }
}