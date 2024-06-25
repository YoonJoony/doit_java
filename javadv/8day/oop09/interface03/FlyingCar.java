package oop09.interface03;

public class FlyingCar implements Drivable, Flyable{

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("fly");
	}

	@Override
	public void drive() {
		// TODO Auto-generated method stub
		System.out.println("drive");
	}
}
