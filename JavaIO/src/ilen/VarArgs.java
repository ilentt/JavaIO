package ilen;

public class VarArgs {
	 
	public VarArgs() {
		// constructor
	}
	
	//Average of n numbers
	public double getArgs(double... a) {
		int n = a.length;
		double sum = 0;
		for(double x : a)
			sum+=x;
		return sum/n;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VarArgs v = new VarArgs();
		System.out.println("Avarage : " + v.getArgs(15.2,55.5,8.45,51.4));
	}

}
