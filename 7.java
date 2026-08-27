import Java.util.*;
public divisible{
	Public static void main(string[]args){
	 Scanner Sc= new Scanner(system.in);
	 System.out.print("enter a number:");
	 int num=Sc.nextInt();
	 if(num%3==0&&num%5==0){
	  system.out.println("The number is divisible by both 3 and 5");
	}else{
	 System.out.println("The number is not divisible by both 3 and 5:");
	}
	 Sc.close();
	}
}