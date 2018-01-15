package pl.lodz.ui.math.junit.test;


public class People {

	private String firstName;
	private String lastName;
	private int age;
	private int number;
	
	public People(){
    	
    }
	
	String getFirstName()
	{ 
		return firstName; 
	}
	
	void setFirstName(String firstName)
	{ 
		this.firstName = firstName; 
	}
	
	String getLastName()
	{ 
		return lastName; 
	}
	
	void setLastName(String lastName)
	{ 
		this.lastName = lastName; 
	}
	
	int getAge()
	{ 
		return age; 
	}
	
	void setAge(int age)
	{ 
		this.age = age; 
	}
	
	int getNumber()
	{ 
		return number; 
	}
	
	void setNumber(int number)
	{ 
		this.number = number; 
	}
	
	
	public String concatenate(String firstName, String lastName)
	{
		return firstName + " " + lastName;
	}
	
	public boolean ifTrueOrFalse(int number)
	{
	        if (number >= 0)
	        {
	            return true;
	        }
	        else
	        {
	            return false;
	        }
	}

	public int multiply(int age, int number)
	{
		if(age > number)
		{
			return 0;
		}
		else
		{
			return 1;
		}

	}
	
	public People ifNull(int number)
	{
		int value = 36;
		if(value == number)
		{
			return null;
		}
		else
			return this;		
	}
}
