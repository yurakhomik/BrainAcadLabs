package labs2_1_;

import labs2_1_.Main_lab2_1;
import java.lang.reflect.Array;

public class Computer {

	private String manufacturer;
	private int serialNumber;
	private float price;
	private int quantityCPU;
	private int frequencyCPU;

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public int getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(int serialNumber) {
		this.serialNumber = serialNumber;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public int getQuantityCPU() {
		return quantityCPU;
	}

	public void setQuantityCPU(int quantityCPU) {
		this.quantityCPU = quantityCPU;
	}

	public int getFrequencyCPU() {
		return frequencyCPU;
	}

	public void setFrequencyCPU(int frequencyCPU) {
		this.frequencyCPU = frequencyCPU;
	}

	void view() {
		
		System.out.print(this);
			
		
	}

	@Override
	public String toString() {
		return "\nmanufacturer= " + manufacturer + ", serialNumber= " + serialNumber + ", price= " + price
				+ ", quantityCPU= " + quantityCPU + ", frequencyCPU= " + frequencyCPU;
	}
	
	




}
