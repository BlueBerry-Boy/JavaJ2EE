package Selenium.AutomationFramework.Collections;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class CollectionsList {

	public static void main(String[] args) {

		List object = new ArrayList();

		object.add("DesertEagle");
		object.add("9mm");
		object.add("AR-15");
		object.add("50-cal Sniper");

		System.out.println("The Object Size is: " + object.size());
		System.out.println(object);

	}

	
}
