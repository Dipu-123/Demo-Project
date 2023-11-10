package pack;

public final class Immutable {
	 private final int cid;
	 private final String cname;
	public Immutable(int cid, String cname) {
		this.cid = cid;
		this.cname = cname;
	}
	 public int getInt() {
		 return cid;
	 }
	 public String getString() {
		 return cname;
	 }
}



