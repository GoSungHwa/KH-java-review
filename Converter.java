package test03;

public class Converter {
	//속성
	
	
	
	//기능
	//1cm->0.393701 inch
	//1 inch->2.5400013716 cm
	double cmToInch(int cm) {
		double result=0;
		result=cm*0.393701;
		return result;
	}
	
	//양수를 주면 그 값을 cm->inch로 바꿔서 실수 형태로 반환
	//~~inch->cm
	double inchToCm(int inch) {
		double result2=0;
		result2=inch*2.5400013716;
		return result2;
	}

}
