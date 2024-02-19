package week04.day1.프로젝트_5;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class 파일에저장하기 {
    public static void main(String[] args) {
        // 파일 경로 및 파일명 지정
     
        String filePath = "res/example2.txt";

        try {
            // FileWriter와 BufferedWriter를 함께 사용
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath, true));

            // 파일에 쓸 내용 작성
         
            		//1명의 값 넣어주기
            
			Employ s = new Employ("윤라영","010-7777-2221","1111","영업부","대리");			
            // BufferedWriter를 통해 파일에 내용 쓰기
            bufferedWriter.append(s.toStringp());

            // 개행 문자 추가 (선택사항)
            bufferedWriter.newLine();

            // BufferedWriter를 닫으면 내용이 파일에 쓰여집니다.
            bufferedWriter.close();

            System.out.println("파일에 내용이 성공적으로 쓰여졌습니다.");
        } catch (IOException e) {
            // 예외 처리
            e.printStackTrace();
        }
    }
}