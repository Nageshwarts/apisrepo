package com.example.demo.controller.distance;

public class distance1 {
private int sum;
private float distance;

public int getsum(){
	return sum;
}
public void setsum(int n) {
	sum=n;
}
public float getdistance(){
	return distance;
}
public void setdistance(float distance) {
	this.distance=distance;
}
	public int check( int distance) {
	if(distance>=0&&distance<10) {
		sum+=5000;
		return sum;
	}
	else if(distance>=10&&distance<20) {
		sum+=10000;
		return sum;
	}
	else if(distance>=20&&distance<50) {
		sum+=50000;
		return sum;
	}
	else {
		sum+=100000;
		return sum;
	}
	}
	
}


