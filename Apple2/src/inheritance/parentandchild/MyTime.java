package inheritance.parentandchild;

public class MyTime extends MyDate{
	int hrs,mins,secs;
	MyDate d;
	public int getHrs() {
		return hrs;
	}
	public void setHrs(int hrs) {
		this.hrs = hrs;
	}
	public int getMins() {
		return mins;
	}
	public void setMins(int mins) {
		this.mins = mins;
	}
	public int getSecs() {
		return secs;
	}
	public void setSecs(int secs) {
		this.secs = secs;
	}
	public MyDate getD() {
		return d;
	}
	public void setD(MyDate d) {
		this.d = d;
	}
	
	

}
