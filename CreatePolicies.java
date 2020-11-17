/**
 * 
 */
package carInsurancePolicy;

/**
 * @author Patrick Copeland
 * @version 10/23/2020
 */
public class CreatePolicies 
{
	
	public static void main(String[] args) 
	{
		CarInsurancePolicy first = new CarInsurancePolicy(123);
		CarInsurancePolicy second = new CarInsurancePolicy(456, 4);
		CarInsurancePolicy third = new CarInsurancePolicy(789, 12, "Newcastle");
	
		first.display();
		second.display();
		third.display();
	}

}