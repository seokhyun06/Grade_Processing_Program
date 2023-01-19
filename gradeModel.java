package application;

public class gradeModel {
	public String Sum(String A, String B) {
		
		return Integer.toString(Integer.parseInt(A)+Integer.parseInt(B));
		
	}
	public String Avg(String A, String B) {
		double A1 = Integer.parseInt(A);
		double B1= Integer.parseInt(B);
		return Double.toString((A1+B1)/2);
	}
}
