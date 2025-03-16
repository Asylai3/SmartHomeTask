package composit.devices;

import composit.devices.abstracts.SmartDevice;

import java.util.ArrayList;
import java.util.List;

// Композитный узел (группа устройств)
public class DeviceGroup extends SmartDevice {
    private String name;
    private List<SmartDevice> devices;

    public DeviceGroup(String name) {
        this.name = name;
        this.devices = new ArrayList<>();
    }

    public void addDevice(SmartDevice device) {
        devices.add(device);
    }

    public void removeDevice(SmartDevice device) {
        devices.remove(device);
    }

    @Override
    public void turnOn() {
        System.out.println("Включаем все устройства в " + name);
        for (SmartDevice device : devices) {
            device.turnOn();
        }
    }

    @Override
    public void turnOff() {
        System.out.println("Выключаем все устройства в " + name);
        for (SmartDevice device : devices) {
            device.turnOff();
        }
    }

    @Override
    public String getStatus() {
        StringBuilder status = new StringBuilder(name + " содержит:\n");
        for (SmartDevice device : devices) {
            status.append("  ").append(device.getStatus()).append("\n");
        }
        return status.toString().trim();
    }
}