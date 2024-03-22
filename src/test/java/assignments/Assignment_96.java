package assignments;
// WAP to use getter and setter with int, char, boolean, string, float, double 
public class Assignment_96 {	
	private int num = 1023;		// getter and setter with int
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	private char letter = 'A';		//getter and setter with char
	public char getLetter() {
		return letter;
	}
	public void setLetter(char letter) {
		this.letter = letter;
	}
	private boolean result = true; 		//getter and setter with boolean
	public boolean isResult() {
		return result;
	}
	public void setResult(boolean result) {
		this.result = result;
	}
	private float fnum = 1236.024f;		// getter and setter with float	
	public float getFnum() {
		return fnum;
	}
	public void setFnum(float fnum) {
		this.fnum = fnum;
	}
	private double dnum = 98567.2365;		//getter and setter with double	
	public double getDnum() {
		return dnum;
	}
	public void setDnum(double dnum) {
		this.dnum = dnum;
	}
	public static void main(String[] args) {
		Assignment_96 A96 = new Assignment_96();
		A96.setNum(689);
		System.out.println(A96.getNum());
		A96.setLetter('R');
		System.out.println(A96.getLetter());
		A96.setResult(false);
		System.out.println(A96.isResult());
		A96.setFnum(654.89f);
		System.out.println(A96.getFnum());
		A96.setDnum(75864.36684556);
		System.out.println(A96.getDnum());
	}
}
