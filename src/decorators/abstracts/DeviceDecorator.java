package decorators.abstracts;

import devices.abstracts.SmartDevice;

// Декоратор для устройств
public abstract class DeviceDecorator extends SmartDevice {
    protected SmartDevice device;

    public DeviceDecorator(SmartDevice device) {
        this.device = device;
    }

    @Override
    public void turnOn() {
        device.turnOn();
    }

    @Override
    public void turnOff() {
        device.turnOff();
    }

    @Override
    public String getStatus() {
        return device.getStatus();
    }
}
