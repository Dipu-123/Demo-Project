package pack;

public class Main_Singleton {

	public static void main(String[] args) {
    Singleton s1=Singleton.getInstance();
    Singleton s2=Singleton.getInstance();
    System.out.println(s1.hashCode()+"\t"+s2.hashCode());

	}

}
