package pack;

public class practice {
  int a;
  int b;
  public int sum(int a,int b) {
	  int sum=a+b;
	  System.out.println(sum);
	  this.sum(a, b);
	  return sum;
  }
}
