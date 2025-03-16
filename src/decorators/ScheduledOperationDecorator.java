package decorators;

import devices.abstracts.SmartDevice;
import decorators.abstracts.DeviceDecorator;

// Декоратор для расписания
public class ScheduledOperationDecorator extends DeviceDecorator {
    public ScheduledOperationDecorator(SmartDevice device) {
        super(device);
    }

    public void scheduleTurnOn() {
        System.out.println("Запланировано включение: " + device.getStatus());
    }

    public void scheduleTurnOff() {
        System.out.println("Запланировано выключение: " + device.getStatus());
    }
}
