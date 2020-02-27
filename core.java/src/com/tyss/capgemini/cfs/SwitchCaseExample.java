package com.tyss.capgemini.cfs;

public class SwitchCaseExample {
	public static void main(String[] args) {
		String day = "tuesday";

		switch (day) {
		case "monday": 
			System.out.println("weekday");

			break;
		case "tuesday":
			System.out.println("weekday");

			break;

		case "wednesday":
			System.out.println("weekday");

			break;

		case "thursday":
			System.out.println("weekday");

			break;

		case "friday":
			System.out.println("weekday");

			break;

		case "saturday":
			System.out.println("weekend");

			break;

		case "sunday":
			System.out.println("weekend");

			break;

		default:
			System.out.println("invalid day");
			break;
		}
	}
}
