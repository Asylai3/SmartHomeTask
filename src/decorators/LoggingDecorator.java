package decorators;

import devices.abstracts.SmartDevice;
import decorators.abstracts.DeviceDecorator;

// Декоратор для логирования
public class LoggingDecorator extends DeviceDecorator {
    public LoggingDecorator(SmartDevice device) {
        super(device);
    }

    @Override
    public void turnOn() {
        System.out.println("Лог: Включение " + device.getStatus());
        super.turnOn();
    }

    @Override
    public void turnOff() {
        System.out.println("Лог: Выключение " + device.getStatus());
        super.turnOff();
    }
}
