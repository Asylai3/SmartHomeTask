package composit;

import composit.devices.Light;
import composit.devices.Room;
import composit.devices.Thermostat;

public class Main {
    public static void main(String[] args) {
        Light livingRoomLight = new Light("Living Room Light");
        Light kitchenLight = new Light("Kitchen Light");
        Thermostat thermostat = new Thermostat();

        Room livingRoom = new Room("Living Room");
        livingRoom.addDevice(livingRoomLight);
        livingRoom.addDevice(thermostat);

        Room kitchen = new Room("Kitchen");
        kitchen.addDevice(kitchenLight);

        livingRoom.turnOn();
        livingRoom.turnOff();

        kitchen.turnOn();
        kitchen.turnOff();
    }
}
