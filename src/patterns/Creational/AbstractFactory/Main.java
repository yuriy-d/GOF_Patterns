package patterns.Creational.AbstractFactory;

import patterns.Creational.AbstractFactory.application.App;
import patterns.Creational.AbstractFactory.factories.MacUIFactory;
import patterns.Creational.AbstractFactory.factories.UIFactory;
import patterns.Creational.AbstractFactory.factories.WindowsUIFactory;

public class Main {
	private static App configure(){
		UIFactory factory;
		String os = System.getProperty("os.name").toLowerCase();
		if (os.contains("mac")){
			factory = new MacUIFactory();
		}else{
			factory = new WindowsUIFactory();
		}
		return new App(factory);
	}

	public static void main(String[] args) {
		App app = configure();
		app.paint();
	}
}
