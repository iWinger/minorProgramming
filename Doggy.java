package test;
public class Doggy {
private String name, breed;
private int age;
private double weight;
private boolean dogAggressive;
//constructors
public Doggy(String name, int age, String breed, double wt, boolean dogA) {
	this.name = name;
	this.age = age;
	this.breed = breed;
	this.weight = wt;
	this.dogAggressive = dogA;
}
public Doggy(String name, int age) {
	this.name = name;
	this.age = age;
}

public Doggy(String name) {
	this.name = name;
}
//getters

public String getName() {
	return name;
}
//setters
 public void setName(String name) {
	this.name = name;
}

public String getBreed() {
	return breed;
}
public void setBreed(String breed) {
	this.breed = breed;
}
public int getAge() {
	return age;
}
public void setAge(int age){
	this.age = age;
}
public double getWeight() {
	return weight;
}

public void setWeight(double weight) {
	this.weight = weight;
}
public boolean getdogAggressive() {
	return dogAggressive;
}
public void setDogAggressive(boolean isDogAggressive) {
	this.dogAggressive = isDogAggressive;
}

public String toString() {
	return "Information about the dog: " + " name: " + name + "//" + " breed: " + breed + "//" + " age: " + age + "//" + " weight: " + weight + "//" + "dogAggressive: " + dogAggressive;
}
}
//Dogs are cool
