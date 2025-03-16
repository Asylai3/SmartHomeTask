package factories;

import decorators.LoggingDecorator;
import decorators.ScheduledOperationDecorator;
import devices.Light;
import devices.Thermostat;
import devices.abstracts.SmartDevice;
import factories.interfaces.SmartHomeFactory;

// Фабрика продвинутых устройств
public class AdvancedSmartHomeFactory implements SmartHomeFactory {
    @Override
    public SmartDevice createLight() {
        return new LoggingDecorator(new Light());
    }

    @Override
    public SmartDevice createThermostat() {
        return new ScheduledOperationDecorator(new Thermostat());
    }
}