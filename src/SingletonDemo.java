
public class SingletonDemo {

    public static void main(String[] args) {
	final TSSingleton instance1 = TSSingleton.getInstance();
	final TSSingleton instance2 = TSSingleton.getInstance();

	System.out.println(instance1);
	System.out.println(instance2);

    }

}
