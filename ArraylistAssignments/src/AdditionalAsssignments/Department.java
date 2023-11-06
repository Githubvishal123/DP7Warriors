package AdditionalAsssignments;

public class Department {

	private int dpid;
	private String type;

	public Department(int dpid, String type) {
		super();
		this.dpid = dpid;
		this.type = type;
	}

	public int getDpid() {
		return dpid;
	}

	public void setDpid(int dpid) {
		this.dpid = dpid;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Department [dpid=" + dpid + ", type=" + type + "]";
	}

}
