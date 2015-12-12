package net.sensof.model.abstractfactory;

public class PersonFactoryTest {

	public static void main(String[] args) {
		PersonFactory mc_factory = new MCFactory();
		mc_factory.getGirl().drawWoman();
		PersonFactory hn_factory = new HNFactory();
		hn_factory.getBoy().drawMan();
	}

}
