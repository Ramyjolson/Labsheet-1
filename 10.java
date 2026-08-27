import java.util.*;
public largest{
	public static void main(string[]args){
	 Scanner Sc= new Scanner(System.in);
	 System.out.print("Enter first number: ");
	 int a=Sc.nextInt();
	 System.out.print("Enter second number: ");
	 int b=Sc.nextInt();
	 System.out.print("Enter third number: ");
	 int c=Sc.nextInt();
	 if(a>b){
	 if(a>c){
	 Ssytem.out.println(a + "is the largest");
	}else{
	 System.out.println(c + "is the largest");
	}else{
	 if(b>c){
	 System.out.println(b + "is the largest");
	}else{
	 System.out.println(c + "is the largest");
	 }
	}
	Sc.close();
   }
}
