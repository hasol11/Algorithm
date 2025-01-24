import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            int num = scanner.nextInt();
            
            for (int i = 1; i <= num; i++) {
                int num1 = scanner.nextInt();
                int num2 = scanner.nextInt();
                
                int num3 = num1 + num2;
                System.out.println("Case #" + i + ": " + num1 + " + " + num2 + " = " + num3);
            }
        } catch (Exception e) {
            System.out.println("잘못된 입력입니다. 숫자만 입력해 주세요.");
        } finally {
            scanner.close(); // 자원을 다 사용한 후에 scanner를 닫습니다.
        }
    }
}
