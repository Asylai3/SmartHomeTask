package factories.interfaces;

import devices.abstracts.SmartDevice;

public interface SmartHomeFactory {
    SmartDevice createLight();
    SmartDevice createThermostat();
}
