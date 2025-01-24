import java.io.*;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(reader.readLine()); // 첫 번째 줄에서 정수 입력

        for (int i = 0; i < num; i++) {
            StringTokenizer st = new StringTokenizer(reader.readLine()); // 각 줄을 토큰으로 분리
            int num1 = Integer.parseInt(st.nextToken());
            int num2 = Integer.parseInt(st.nextToken());

            writer.write((num1 + num2) + "\n"); // 두 숫자의 합을 출력
        }

        writer.flush(); // 버퍼에 있는 내용을 출력
        writer.close(); // 스트림 닫기
    }
}
