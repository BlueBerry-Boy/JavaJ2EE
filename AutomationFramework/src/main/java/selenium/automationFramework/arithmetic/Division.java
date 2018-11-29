package selenium.automationFramework.arithmetic;


public class Division 
{

	public float Divide(float x, float y)
	{
		float z;
		
		{
			z=x/y;
			
		}
		return z;
			
	}
	

	public static void main(String [] args)
	{
		Division Dv = new Division();
		
	float t= Dv.Divide(4,5);
		
		System.out.println( "The answer is " + t);
		
		
	}
}	