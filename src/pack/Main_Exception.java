package pack;

public class Main_Exception {

	public static void main(String[] args) {
   try {
	   throw new Myexception("This is new");
   }catch(Myexception me) {
	   System.out.println(me.getMessage());
   }
	}

}
