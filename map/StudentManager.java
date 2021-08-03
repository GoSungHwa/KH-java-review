package test.map;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class StudentManager {
	private List<PropertiesStudent> list = new ArrayList<PropertiesStudent>(); 
	private Properties prop = new Properties(); 
	 
	public StudentManager() {} 
	public void propertyInsert(PropertiesStudent st) { 
	prop.setProperty(st.getNo(),st.toString());
	
	System.out.println(st.getName()+" 학생의 데이터 삽입 성공!"); 
	} 
	public void propertyStore() { 
	try { // 설정 파일 저장 시…. 
		
	prop.store(new FileWriter(new File("prop.properties")), "Ex_Student.properties"); 
	System.out.println("학생 데이터 저장 성공!"); 
	} catch (Exception e) { 
	e.printStackTrace(); 
	} 
	} 
	public void propertyPrint() { 
	try { // 설정 파일 불러올 시…. 
	prop.load(new FileReader(new File("prop.properties"))); 
	for(int i = 1; i <= prop.size(); i++) { 
	String index = String.valueOf(i); // String 형변환을 통한 key 값 도출 
	list.add(parseStudent(prop.getProperty(index))); 
	} 
	} catch (Exception e) { 
	e.printStackTrace(); 
	} 
	for(PropertiesStudent s : list) { 
	System.out.println(s); 
	} 
	System.out.println("학생 데이터 출력이 완료되었습니다."); 
	} 
	
	public PropertiesStudent parseStudent(String str) { // 넘겨 받은 데이터를 학생 객체로 변환 
	String tmp[] = str.split(", "); //, 로 잘라내준다 (1,홍길동,점수)
	
	return new PropertiesStudent(tmp[0], tmp[1], Integer.parseInt(tmp[2])); //Integer.parseInt() - 문자열을 숫자로 변환
	}
}
