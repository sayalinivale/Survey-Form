
public class Member {
	
	private String name,adharNumber,email,phoneNumber,gender,vaccinated,firstDose,secondDose,vaccineNmae;

		
	
	public Member() {
		super();
	}

	public Member(String name, String adharNumber, String email, String phoneNumber, String gender, String vaccinated,
			String firstDose, String secondDose, String vaccineNmae) {
		super();
		this.name = name;
		this.adharNumber = adharNumber;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.gender = gender;
		this.vaccinated = vaccinated;
		this.firstDose = firstDose;
		this.secondDose = secondDose;
		this.vaccineNmae = vaccineNmae;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdharNumber() {
		return adharNumber;
	}

	public void setAdharNumber(String adharNumber) {
		this.adharNumber = adharNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getVaccinated() {
		return vaccinated;
	}

	public void setVaccinated(String vaccinated) {
		this.vaccinated = vaccinated;
	}

	public String getFirstDose() {
		return firstDose;
	}

	public void setFirstDose(String firstDose) {
		this.firstDose = firstDose;
	}

	public String getSecondDose() {
		return secondDose;
	}

	public void setSecondDose(String secondDose) {
		this.secondDose = secondDose;
	}

	public String getVaccineNmae() {
		return vaccineNmae;
	}

	public void setVaccineNmae(String vaccineNmae) {
		this.vaccineNmae = vaccineNmae;
	}

}
