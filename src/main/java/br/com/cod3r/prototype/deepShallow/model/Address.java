package br.com.cod3r.prototype.deepShallow.model;

public class Address implements Cloneable {
	public String street;
	public Integer number;
	public City city;
	
	public Address(String street, Integer number, City city) {
		super();
		this.street = street;
		this.number = number;
		this.city = city;
	}

	@Override
	public String toString() {
		return "Address [street=" + street + ", number=" + number +
				", city = " + city.toString() + "]";
	}

	@Override
	public Object clone() throws CloneNotSupportedException {

		Address address = (Address) super.clone();
		address.city = (City) city.clone();
		return address;

	}
}
