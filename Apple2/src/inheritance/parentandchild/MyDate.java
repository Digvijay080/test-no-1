package inheritance.parentandchild;

public class MyDate {
	int dd,mm,yy;
	static String month="June";
	public int getDd() {
		return dd;
	}
	public void setDd(int dd) {
		this.dd = dd;
	}
	public int getMm() {
		return mm;
	}
	public void setMm(int mm) {
		this.mm = mm;
	}
	public int getYy() {
		return yy;
	}
	public void setYy(int yy) {
		this.yy = yy;
	}
	public static String getMonth() {
		return month;
	}
	public static void setMonth(String month) {
		MyDate.month = month;
	}
	

}
