package oop;

public class Circle {
	public double radius = 1;
	Circle(){
		
	}
	Circle (double newRadius){
		radius = newRadius;
	}
	public double getArea() {
		return radius*radius*Math.PI;
	}
	public double getPerimeter() {
		return 2*radius*Math.PI;
	}
	public void setRadius(double newRadius) {
		radius = newRadius;
	}
}
