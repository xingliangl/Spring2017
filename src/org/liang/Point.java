package org.liang;

public class Point {
	int x;
	int y;
	
	public Point(){
		
	}
	public Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public String draw(){
		return "(" + this.x + ", "+ this.y + ")";
	}
}
