package com.example.demo;
import org.springframework.stereotype.Component;
@Component
public class Tyre {
private String brand;

public String getBrand() {
	return brand;
}

public void setBrand(String brand) {
	this.brand = brand;
}
public Tyre(String brand) {
	super();
	this.brand = brand;
}
public Tyre() {
	
}

public void display() {
	System.out.println("am from tyre");
}
@Override
public String toString() {
	return "am from tyre";
	

}

}
