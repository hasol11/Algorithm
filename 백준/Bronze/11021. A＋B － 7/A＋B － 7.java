import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int num=scanner.nextInt();
		
		for(int i=1;i<=num;i++) {
			
			int num1=scanner.nextInt();
			int num2=scanner.nextInt();
			System.out.print("Case #"+i+": ");
			System.out.println(num1+num2);
		}
	}
}