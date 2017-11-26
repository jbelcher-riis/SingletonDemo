
public class TSSingleton {
    private static volatile TSSingleton instance = null;

    private TSSingleton() {
    }

    public static TSSingleton getInstance() {
	TSSingleton result = instance;

	if (result == null) {
	    synchronized (TSSingleton.class) {
		result = instance;
		if (result == null) {
		    System.out.println("My first and only instance of TSSingleton");
		    result = new TSSingleton();
		    instance = result;
		}
	    }
	}

	return result;
    }
}
