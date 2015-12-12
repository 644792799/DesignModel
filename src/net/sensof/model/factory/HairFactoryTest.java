package net.sensof.model.factory;

public class HairFactoryTest {

	public static void main(String[] args) {
		HairFactory factory = new HairFactory();
		HairInterface left = factory.getHairByClassName(LeftHair.class.getName());
		left.draw();
		HairInterface right = factory.getHairByClassName(RightHair.class.getName());
		right.draw();
		HairInterface in = factory.getHairByClassName(InHair.class.getName());
		in.draw();
	}

}
