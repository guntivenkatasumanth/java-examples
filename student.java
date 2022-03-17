package doublylinkedlist;

public class student {
	public int rollnumber;
	public String section;
	public String branch;
	public student(int rollnumber, String section, String branch) {
		super();
		this.rollnumber = rollnumber;
		this.section = section;
		this.branch = branch;
	}
	@Override
	public String toString() {
		return "student [rollnumber=" + rollnumber + ", section=" + section + ", branch=" + branch + "]";
	}
	

}
