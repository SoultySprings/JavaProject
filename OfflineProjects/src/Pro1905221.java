import java.util.*;
class Pro1905221
{

public boolean TwosPower(int number)                  
    {
        if (number == 0)                            
            return false;
        while (number!= 1)                          
        {
            if (number % 2 != 0)                 
                return false;
            number = number / 2;                  
                                                    
        }
        return true;
    }
public static void main(String[] args)
{
    try (Scanner sc = new Scanner(System.in)) {
		System.out.print("Enter a number : ");   
		int n = sc.nextInt();
		Pro1905221 m=new Pro1905221();                          
		if(m.TwosPower(n))                           
		System.out.println(n+" is power of 2.");      
		else
		System.out.println(n+" is not a power of 2.");
	}
}
}
