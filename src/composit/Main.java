package composit;

import composit.devices.DeviceGroup;
import composit.devices.SingleDevice;

public class Main {
    public static void main(String[] args) {
        SingleDevice light1 = new SingleDevice("Лампа в гостиной");
        SingleDevice thermostat = new SingleDevice("Термостат");

        DeviceGroup livingRoom = new DeviceGroup("Гостиная");
        livingRoom.addDevice(light1);
        livingRoom.addDevice(thermostat);

        livingRoom.turnOn();
        System.out.println(livingRoom.getStatus());

        livingRoom.turnOff();
        System.out.println(livingRoom.getStatus());
    }
}
