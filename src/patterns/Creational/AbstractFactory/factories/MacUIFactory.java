package patterns.Creational.AbstractFactory.factories;

import patterns.Creational.AbstractFactory.buttons.Button;
import patterns.Creational.AbstractFactory.buttons.MacButton;
import patterns.Creational.AbstractFactory.checkboxes.Checkbox;
import patterns.Creational.AbstractFactory.checkboxes.MacCheckbox;

public class MacUIFactory implements UIFactory{
	@Override public Button createButton() {
		return new MacButton();
	}

	@Override public Checkbox createCheckbox() {
		return new MacCheckbox();
	}
}
