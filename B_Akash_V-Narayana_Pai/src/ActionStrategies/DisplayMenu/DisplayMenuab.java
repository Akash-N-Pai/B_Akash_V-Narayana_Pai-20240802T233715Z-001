package ActionStrategies.DisplayMenu;
/*
This is a abstract class inherited by concret strategy classes
DisplayMenu1 and DisplayMenu2
 */
import DataStore.DataStore;

public abstract class DisplayMenuab {
    DataStore ds;

    public DisplayMenuab(DataStore ds) {
        this.ds = ds;
    }
    public abstract void DisplayMenu();
}
