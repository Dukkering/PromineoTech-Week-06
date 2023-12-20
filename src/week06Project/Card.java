package week06Project;

public class Card {
// Initializing values	
private int value;
private String name;

// Initializing Constructor}
public Card(int value, String name){
	this.value = value;
	this.name = name;
	}

// Initializing Setters and Getters
public String getName() {
	return name;
	}
public void setName(String name) {
	this.name=name;
	}
public int getValue() {
	return value;
	}
public void setValue(int value) {
	this.value=value;
	}

// Method 'describe' to describe the value of the given card
public void describe() {
	System.out.println(value + " " + name);
	}
}
