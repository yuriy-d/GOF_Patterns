package patterns.Creational.AbstractFactory.factories;

import patterns.Creational.AbstractFactory.buttons.Button;
import patterns.Creational.AbstractFactory.buttons.WindowsButton;
import patterns.Creational.AbstractFactory.checkboxes.Checkbox;
import patterns.Creational.AbstractFactory.checkboxes.WindowsCheckbox;

public class WindowsUIFactory implements UIFactory{
	@Override public Button createButton() {
		return new WindowsButton();
	}

	@Override public Checkbox createCheckbox() {
		return new WindowsCheckbox();
	}
}
