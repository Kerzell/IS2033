/**
 * @(#)filename: LaptopInterface.java
 * @authors: Kerzell Ramos
 * @version: 1.00 Nov. 13th, 2019 - 10:28AM
 * 
 * @PROGRAM_PURPOSE:
 * 
 * ************************** *
 * DO NOT USE STATIC METHODS  *
 * EVERYTHING LOCAL TO METHOD * 
 * ************************** *  
 *
 */

//imports
import java.util.Scanner;

public class LaptopInventory {
	
	public LaptopInventory() 
	{
		
	}//END empty constructor LaptopInventory()  _KR
	
	public void processLaptops()
	{
		//method level variables 
		char response = 'N';
		int laptopCnt = 0;
		Scanner input = new Scanner(System.in);
		Laptop laptops = new Laptop();
		
		System.out.printf("%nAre there laptops to be added to inventory?"
						+ "  Enter /'Y/' or /'N/' %n");
		response = input.nextLine().charAt(0);
	
		if(Character.toUpperCase(response) == 'Y') {
			System.out.printf("%nHow many different laptops to add to inventory?");
			laptopCnt = input.nextInt(); //used to determine how many unique laptops are 
										 //to be added to the inventory list
			laptops.setLaptop(laptopCnt);
			laptops.setLaptopCost();
			laptops.setLaptopQty();
		}//END if 
		else
		{
			System.out.printf("%nThank you! Exiting program.");
			System.exit(0);
		}//END else 
		
	}//END processLaptop() : void _KR
	
	public void displayLaptops()
	{
		
	}//END displayLaptops() : void _KR

}//END class LaptopInterface.java

