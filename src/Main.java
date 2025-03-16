import adapters.LockAdapter;
import decorators.ScheduledOperationDecorator;
import devices.LegacyLockSystem;
import devices.abstracts.SmartDevice;
import facades.SmartHomeController;
import factories.AdvancedSmartHomeFactory;
import factories.BasicSmartHomeFactory;
import factories.interfaces.SmartHomeFactory;

public class Main {
    public static void main(String[] args) {
        SmartHomeController controller = new SmartHomeController();

        SmartHomeFactory factory = new AdvancedSmartHomeFactory(); // Можно заменить на BasicSmartHomeFactory

        SmartDevice light = factory.createLight();
        SmartDevice thermostat = factory.createThermostat();
        SmartDevice legacyLock = new LockAdapter(new LegacyLockSystem()); // Адаптер

        controller.addDevice(light);
        controller.addDevice(thermostat);
        controller.addDevice(legacyLock);

        controller.turnAllOn();
        controller.showStatus();

        controller.turnAllOff();
    }
}
