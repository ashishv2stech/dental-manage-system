package proj;

public class Patient {
	
	int app_num;
	String name_of_patient, patient_address,app_date,p_address="";
	public int getApp_num() {
		return app_num;
	}
	public String getP_address() {
		return p_address;
	}
	public void setP_address(String p_address) {
		this.p_address = p_address;
	}
	public void setApp_num(int app_num) {
		this.app_num = app_num;
	}
	public String getName_of_patient() {
		return name_of_patient;
	}
	public void setName_of_patient(String name_of_patient) {
		this.name_of_patient = name_of_patient;
	}
	public String getPatient_address() {
		return patient_address;
	}
	public void setPatient_address(String patient_address) {
		this.patient_address = patient_address;
	}
	public String getApp_date() {
		return app_date;
	}
	public void setApp_date(String app_date) {
		this.app_date = app_date;
	}

}
