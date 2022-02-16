package ConstructorPractice;

public class Lights {

	String trafficLights = "";

	public Lights() {
	}

	public Lights(String trafficLights) {

		this.trafficLights = trafficLights;
	}

	//public String getTrafficLights() {
		//return trafficLights;
	//}
	//public void setTrafficLights(String trafficLights) {
		//this.trafficLights=trafficLights;
	//}

	public void isTrafficLightValid() {

		if (trafficLights.equals("Red")) {
			System.out.println("Light is red-please Stop");
		} else if (trafficLights.equals("yellow")) {
			System.out.println("Light is yellow-please prepare to stop");
		} else if (trafficLights.equals("green")) {
			System.out.println("Light is green-please go ahead");
		} else {
			System.out.println("Invalid");
		}
	}
}

