package My_magento_lab;

import java.util.Random;


public class Parameters {
	
	static Random random = new Random();
	static String URLink = "https://magento.softwaretestingboard.com/";
	static String[] ArrayOfFName = { "Ahmad", "Ali", "Mohammad", "Omar" };
	static String[] ArrayOfLName = { "Nonn", "Moon", "Suny", "Khaled" };
	static int randomNumber = random.nextInt((ArrayOfFName.length-1) - 0 + 1);
	static String FName = ArrayOfFName[randomNumber];
	static String LName = ArrayOfLName[randomNumber];
	static int numberOfEmail = randomNumber;
	static String Email = FName + LName + numberOfEmail + "@Gmail.com";
	static String Password = "Abc123456789";
}
