package oop2_3.labs.lab_1;

public class MyWindow {

	// Field
	private double width;
	private double height;
	private int numberOfGlass;
	private String color;
	private boolean isOpen;

	// Accesors
	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public int getNumberOfGlass() {
		return numberOfGlass;
	}

	public void setNumberOfGlass(int numberOfGlass) {
		this.numberOfGlass = numberOfGlass;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isOpen() {
		return isOpen;
	}

	public void setOpen(boolean isOpen) {
		this.isOpen = isOpen;
	}

	// Constructors

	public MyWindow() {
		this(2, 3, 1, "white", true);

	}

	public MyWindow(double width, double height) {
		this(width, height, 1, "white", true);
	}

	public MyWindow(double width, double height, int numberOfGlass) {
		this(width, height, numberOfGlass, "white", true);
	}

	public MyWindow(double width, double height, int numberOfGlass, String color, boolean isOpen) {
		this.width = width;
		this.height = height;
		this.numberOfGlass = numberOfGlass;
		this.color = color;
		this.isOpen = isOpen;
	}
	
	public void printFields () {
		 System.out.print(this);
	}

	@Override
	public String toString() {
		return "\n\tMyWindow \nwidth= " + width + "; \nheight= " + height + "; \nnumberOfGlass= " + numberOfGlass + "; \ncolor= "
				+ color + "; \nisOpen= " + isOpen ;
	}





}
