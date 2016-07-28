package topic3_2.labs;

import java.io.Serializable;

public class Employee implements Serializable  {

	private static final long serialVersionUID = 1L;
	
	private String name;
	private String address;
	private transient int SSN;
	private int number;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public int getSSN() {
		return SSN;
	}
	public void setSSN(int sSN) {
		SSN = sSN;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	
	public Employee (String name, String address, int SSN, int number) {
		this.name = name;
		this.address = address;
		this.SSN = SSN;
		this.number = number;
		
	}
	@Override
	public String toString() {
		return "\tEmployee \nname=" + name + ";\naddress=" + address + ";\nSSN=" 
	                                    + SSN + ";\nnumber=" + number + "\n";
	}
	

}
