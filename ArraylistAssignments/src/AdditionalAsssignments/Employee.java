//6.	Let employee class have a department object. Iterate through aarraylist of employees.

package AdditionalAsssignments;

public class Employee {

	private int id;
	private String name;
	private Department dp;

	public Employee(int id, String name, Department dp) {
		super();
		this.id = id;
		this.name = name;
		this.dp = dp;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Department getDp() {
		return dp;
	}

	public void setDp(Department dp) {
		this.dp = dp;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dp=" + dp + "]";
	}

}
