package week04.day1.프로젝트_5;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class 파일읽기2 {

	public static void main(String[] args) {
		
		try {
			ArrayList<Employ> list = new ArrayList<>();
			BufferedReader reader = new BufferedReader(new FileReader("res/employee_info.txt"));
			
			//성적읽어오기
			String line;
	        while(true) {
	        	line = reader.readLine()   ; // 한 라인  홍길동,010-7788-1512,1111,기획부,부장	        	
	        	if( line == null) break;
	            // 콤마로 구분된 문자열을 분리하여 이름과 점수를 얻음
				String[] datas = line.split(",");
				
				String name =  datas[0];
				String tel =  datas[1];
				String number =  datas[2];
				String division = datas[3];
				String position =  datas[4];			
				
				Employ s = new Employ(name,tel,number,division,position);		
				
				System.out.println( s);
				list.add(s);
	        }
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		 
		
		
		 
	}

}
