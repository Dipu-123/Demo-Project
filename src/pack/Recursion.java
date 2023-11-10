package pack;

public class Recursion {
	public int fact(int a) {
		if(a==0||a==1) {
			return 1;
			
		}else {
			return a*fact(a-1);
		}
	}

}
