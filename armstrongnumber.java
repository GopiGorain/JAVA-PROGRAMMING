import java.util.*;
public class armstrongnumber 
{
    public static void armStrongg(int num)
    {
        int temp;
        int n=0;
        int sum=0;
        temp=num;
        while(num>0)
        {
            int r =num%10;
            n=r*r*r;
            sum=sum+n;
            num/=10;
        }
        if(temp==sum)
            System.out.println("armstrong");
        else
            System.out.println("non arnstrong");
        

    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt(); 
        
        armStrongg(num);
    }
    

   
    
}
