
public class Address {
	int houseNo;
	String vill;
	String dist;
	String state;
	public Address(int houseNo, String vill, String dist, String state) {
		super();
		this.houseNo = houseNo;
		this.vill = vill;
		this.dist = dist;
		this.state = state;
	}
	@Override
	public String toString() {
		return "Address [houseNo=" + houseNo + ", vill=" + vill + ", dist=" + dist + ", state=" + state + "]";
	}
	
	

}
