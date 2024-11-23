import java.util.Scanner;

public class Armstrong{
	
	public static void main(String[] args) {
		// Write your code here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(checkArmstrong(n));

	}
	static boolean checkArmstrong(int n){
	//Write your code here
	int temp =n;
	 int cnt = (int) (Math.log10(n) + 1);
	 int sum = 0;
	 while(n!=0){
		 int digit = n%10;
		 sum+=Math.pow(digit,cnt);
		 n/=10;
	 }
	return sum==temp;
}

}
