package com.jse.carinfo;

public class CarServiceImpl implements CarService {
	private Car[] cars;
	private int count;

	public CarServiceImpl() {
		cars = new Car[5];
	}

	@Override
	public void setCar(Car[] car) {
		this.cars = car;

	}

	@Override
	public Car[] getCars() {

		return cars;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	@Override
	public void add(Car car) {

		cars[count] = car;
		count++;

	}

	@Override
	public Car login(Car car) {
		Car ok = null;
		for (int i = 0; i < cars.length; i++) {
			if (car.getCarName().equals(cars[i].getCarName()) && 
					car.getCarNumber().equals(cars[i].getCarNumber())) {
				ok = new Car();
				ok = cars[i];
				break;
			}
		}
		return ok;
	}
}
