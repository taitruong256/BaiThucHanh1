package Bai3;

public class Cylinder {
	private double r;
	private double h;
	public Cylinder() {
		super();
	}
	public Cylinder(double r, double h) {
		super();
		this.r = r;
		this.h = h;
	}
	public double getR() {
		return r;
	}
	public void setR(double r) {
		this.r = r;
	}
	public double getH() {
		return h;
	}
	public void setH(double h) {
		this.h = h;
	}
	public double dtXungQuanh() {
		return 2*Math.PI*r*h;
	}
	public double dtToanPhan() {
		return 2*Math.PI*r*h+2*Math.PI*r*r;
	}
	public double theTich() {
		return Math.PI*r*r*h;
	}
}
