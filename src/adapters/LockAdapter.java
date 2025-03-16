package adapters;

import devices.LegacyLockSystem;
import devices.abstracts.SmartDevice;

public class LockAdapter extends SmartDevice {
    private LegacyLockSystem legacyLock;

    public LockAdapter(LegacyLockSystem legacyLock) {
        this.legacyLock = legacyLock;
    }

    @Override
    public void turnOn() {
        legacyLock.activateLock();
    }

    @Override
    public void turnOff() {
        legacyLock.deactivateLock();
    }

    @Override
    public String getStatus() {
        return "Замок: Управляется через адаптер.";
    }
}
