package patterns.Creational.AbstractFactory.application;

import patterns.Creational.AbstractFactory.buttons.Button;
import patterns.Creational.AbstractFactory.checkboxes.Checkbox;
import patterns.Creational.AbstractFactory.factories.UIFactory;

public class App {
	private Button button;
	private Checkbox checkbox;

	public App(UIFactory factory){
		this.button = factory.createButton();
		this.checkbox = factory.createCheckbox();
	}

	public void paint(){
		button.paint();
		checkbox.paint();
	}
}
