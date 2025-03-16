package composit.devices;

import composit.devices.abstracts.SmartDevice;

import java.util.ArrayList;
import java.util.List;

public class Room extends SmartDevice {
    private String name;
    private List<SmartDevice> devices = new ArrayList<>();

    public Room(String name) {
        this.name = name;
    }

    // Метод для добавления устройства в комнату
    public void addDevice(SmartDevice device) {
        devices.add(device);
    }

    // Метод для удаления устройства из комнаты
    public void removeDevice(SmartDevice device) {
        devices.remove(device);
    }

    // Включить все устройства в комнате
    @Override
    public void turnOn() {
        System.out.println("Turning on all devices in " + name + " room:");
        for (SmartDevice device : devices) {
            device.turnOn();
        }
    }

    // Выключить все устройства в комнате
    @Override
    public void turnOff() {
        System.out.println("Turning off all devices in " + name + " room:");
        for (SmartDevice device : devices) {
            device.turnOff();
        }
    }
}
