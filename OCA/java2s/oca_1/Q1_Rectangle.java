package java2s.oca_1;

import java.util.*;

public class Q1_Rectangle {

	public Q1_Rectangle(String n){
		name = n;
	}

	public static void main(String[] args){
		Rectangle one = new Q1_Rectangle();
		Rectangle two = new Q1_Rectangle();

		one = two;
		two = null;
		one = null;
	}

	private String name;
}