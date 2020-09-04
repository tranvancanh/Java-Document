package Hotel;

public class Customer {
	private String firstAndLastName;
	private String birthDay;
	private String idNumber;
	
	public Customer() {
		this.firstAndLastName = null;
		this.birthDay = null;
		this.idNumber = null;
		
	}

	public String getFirstAndLastName() {
		return firstAndLastName;
	}

	public void setFirstAndLastName(String firstAndLastName) {
		this.firstAndLastName = firstAndLastName;
	}

	public String getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(String birthDay) {
		this.birthDay = birthDay;
	}

	public String getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}
	

	
}
