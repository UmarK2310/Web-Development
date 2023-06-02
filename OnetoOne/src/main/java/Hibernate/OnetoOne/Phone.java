package Hibernate.OnetoOne;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Phone_Details")
public class Phone {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	@Column(name="Sr_No")
	private int srNo;
	
	@Column(name="Phone_No")
	private int phoneNo;
	
	@Column(name="Service_Provider")
	private String SP;

	public int getSrNo() {
		return srNo;
	}

	public void setSrNo(int srNo) {
		this.srNo = srNo;
	}

	public int getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(int phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getSP() {
		return SP;
	}

	public void setSP(String sP) {
		SP = sP;
	}
}
