package example.testpack;

import com.brainacad.carpack.Car;
import example.applepack.*;

public class MAIN {

	public static void main(String[] args) {
		Apple apple = new Apple();
		Car car = new Car();
		
	
		apple.weigth = 30;
		car.weigth = 3000;
		
		System.out.println("Apple weigth: " + apple.weigth);
		System.out.println("Car weigth: " + car.weigth);
		
		

	}

}
