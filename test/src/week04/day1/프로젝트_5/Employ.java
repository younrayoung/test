package week04.day1.프로젝트_5;

public class Employ implements Comparable<Employ>{
	String name;
	String tel;
	String number;
	String division;
	String position;
	
	public Employ() {
		
	}
	public Employ(String name, String tel, String number, String division, String position) {
		super();
		this.name = name;
		this.tel = tel;
		this.number = number;
		this.division = division;
		this.position = position;
	}

	@Override
	public String toString() {
		return   "    " +name + "    " + tel + "    " + number + "    " + division + "   "
				+ position ;
		
	}
	public String toStringp() {
		return   name + "," + tel + "," + number + "," + division + ","
				+ position ;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getDivision() {
		return division;
	}
	public void setDivision(String division) {
		this.division = division;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public int compareTo(Employ other) {
        // 이름을 기준으로 정렬
        return this.name.compareTo(other.name);
    }
	
	
	
}
