package devices;

import devices.abstracts.SmartDevice;

public class Light extends SmartDevice {
    private boolean isOn;

    @Override
    public void turnOn() {
        isOn = true;
        System.out.println("Лампа включена.");
    }

    @Override
    public void turnOff() {
        isOn = false;
        System.out.println("Лампа выключена.");
    }

    @Override
    public String getStatus() {
        return "Лампа: " + (isOn ? "Включена" : "Выключена");
    }
}
