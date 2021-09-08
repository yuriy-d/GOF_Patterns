package patterns.Creational.AbstractFactory.checkboxes;

public class WindowsCheckbox implements Checkbox{
	@Override public void paint() {
		System.out.println("Paint Windows checkbox");
	}
}
