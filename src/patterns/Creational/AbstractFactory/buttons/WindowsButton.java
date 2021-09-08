package patterns.Creational.AbstractFactory.buttons;

public class WindowsButton implements Button{
	@Override public void paint() {
		System.out.println("Paint Windows button");
	}
}
