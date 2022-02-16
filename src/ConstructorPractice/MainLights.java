package ConstructorPractice;

import java.util.Scanner;

public class MainLights {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    Lights obj=new Lights();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter traffic light");
		String trafficLights=sc.next();
		Lights obj1=new Lights(trafficLights);
		obj1.isTrafficLightValid();
		
		}

}
