import java.util.Scanner;
public class Sample {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your String:");
		String s1=sc.nextLine();
		s1=s1.replaceAll("","").toLowerCase();
			String s="";
		for(char i='a';i<='z';i++)
		{ 
		    if(s1.indexOf(i)!=-1)
		    {
				s=s+i;
			}
		}
		if(s.length()==26){
			System.out.println("Pangram");
		}
		else{
			System.out.println(" Not Pangram");
		}
	}
}
