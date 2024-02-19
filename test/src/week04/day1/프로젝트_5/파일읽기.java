package week04.day1.프로젝트_5;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;



public class 파일읽기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ArrayList<Employ> list = new ArrayList<>();
			BufferedReader reader = new BufferedReader(new FileReader("res/employee_info.txt"));
			String line  = reader.readLine();
			
			
			String[] datas = line.split(",");
			String name =  datas[0];
			String tel =  datas[1];
			String number =  datas[2];
			String division = datas[3];
			String position =  datas[4];			
			
			Employ s = new Employ(name,tel,number,division,position);		
			
			System.out.println( s);
			list.add(s);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		
		
		 
	}

}
