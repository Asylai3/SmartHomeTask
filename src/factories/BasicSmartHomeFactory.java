package factories;

import devices.Light;
import devices.Thermostat;
import devices.abstracts.SmartDevice;
import factories.interfaces.SmartHomeFactory;

// Фабрика базовых устройств
public class BasicSmartHomeFactory implements SmartHomeFactory {
    @Override
    public SmartDevice createLight() {
        return new Light();
    }

    @Override
    public SmartDevice createThermostat() {
        return new Thermostat();
    }
}
