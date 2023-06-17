package assignment6;

class melange {
	static int counter;
	String regid;
	String name;
	long contactnum;
	String branch;

	static {
		counter = 100;
	}

	melange(String name, long contactnum, String branch) {
		this.name = name;
		this.contactnum = contactnum;
		this.branch = branch;
		this.regid = "A-" + counter;
		counter++;

	}

	String getname() {
		return name;
	}

	void setname(String name) {
		this.name = name;
	}

	String getregid() {
		return regid;
		}

	void setregid() {
		this.regid = regid;
	}

	static int getcounter() {
		return counter;
	}

	void setcounter() {
		this.counter = counter;
	}

	String getbranch() {
		return branch;
	}

	void setbranch() {
		this.branch = branch;
	}

	long getcontactnum() {
		return contactnum;
	}

	void setname() {
		this.contactnum = contactnum;
	}

	public static void main(String[] args) {
		String name;
		long contactnum;
		String branch;

		melange s1 = new melange("Amay ", 987654321, "ENTC");
		melange s2 = new melange("Ojas", 1234567890, "IT");
		System.out.println("Hi " + s1.getname() + "," + "branch -" + s1.getbranch() + ". Your registration id is: "
				+ s1.getregid()+","+s1.getcontactnum());
		System.out.println("Hi " + s2.getname() + "," + "branch -" + s2.getbranch() + ". Your registration id is: "
				+ s2.getregid());

	}

}
