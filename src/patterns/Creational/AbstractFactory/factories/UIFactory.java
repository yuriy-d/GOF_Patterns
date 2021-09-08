package patterns.Creational.AbstractFactory.factories;

import patterns.Creational.AbstractFactory.buttons.Button;
import patterns.Creational.AbstractFactory.checkboxes.Checkbox;

public interface UIFactory {
	Button createButton();
	Checkbox createCheckbox();
}
