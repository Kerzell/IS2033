/**
 * @(#)filename: Laptop.java
 * @authors: Kerzell Ramos
 * @version 1.00 Nov. 13th, 2019 - 10:39AM
 * 
 * @PROGRAM_PURPOSE:
 * 
 * ******************************** * 
 * DO NOT USE STATIC METHODS/FIELDS * 
 * ******************************** * 
 *
 */

//imports
import java.util.ArrayList;
import java.util.Scanner;

public class Laptop {
	
	//class variables 
	Scanner input = new Scanner(System.in);
	boolean print = false; //initialized to false until processed
	 					   //by processLaptop() method in LaptopInventory class. _KR
	String laptopName = null;
	double laptopPrice = 0.0;
	int laptopQty = 0;
	ArrayList<Laptop> laptops = new ArrayList<Laptop>(); //ArrayList holding laptop info
														 //w/ various datatypes indicated by <Laptop> identifier _KR
	
	public Laptop()
	{
		
	}//END empty constructor Laptop() _KR
	
	public Laptop(String laptopName, double laptopPrice, int laptopQty)
	{
		this.laptopName  = laptopName;
		this.laptopPrice = laptopPrice;
		this.laptopQty = laptopQty;
	}//END OVERLAODED constructor Laptop(String, double, int) _KR
	
	public void setLaptop(int i)
	{
		System.out.printf("%nEnter laptop no. %d: ", i);
		laptopName = input.nextLine();
	}//END setaptop(int) : void _KR
	
	public void setLaptopCost()	
	{
		System.out.printf("%nEnter the cost for the %s: ", laptopName);
		laptopPrice = input.nextDouble();
	}//END setLaptopCost : void _KR
	
	public void setLaptopQty()
	{
		System.out.printf("%nAdding how many %ss to inventory?: ", laptopName);
		laptopQty = input.nextInt();
	}//END setLaptopQty : void _KR
	
	public String getLaptop(String laptopName) 
	{	
		return laptopName;
	}//End getLaptop(String) : String _KR
	
	public double getLaptopCost(double laptopPrice)
	{
		return laptopPrice;
	}//END getLaptopCost(double) : double _KR
	
	public int getLaptopQty(int laptopQty)
	{
		return laptopQty;
	}//END getLaptopQty(int) : int _KR
	
}//END class Laptop.java
