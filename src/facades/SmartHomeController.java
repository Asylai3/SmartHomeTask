package facades;

import devices.abstracts.SmartDevice;

import java.util.ArrayList;
import java.util.List;

// Фасад для управления умным домом
public class SmartHomeController {
    private List<SmartDevice> devices = new ArrayList<>();

    public void addDevice(SmartDevice device) {
        devices.add(device);
    }

    public void turnAllOn() {
        System.out.println("Включение всех устройств...");
        for (SmartDevice device : devices) {
            device.turnOn();
        }
    }

    public void turnAllOff() {
        System.out.println("Выключение всех устройств...");
        for (SmartDevice device : devices) {
            device.turnOff();
        }
    }

    public void showStatus() {
        System.out.println("Статус устройств:");
        for (SmartDevice device : devices) {
            System.out.println(device.getStatus());
        }
    }
}