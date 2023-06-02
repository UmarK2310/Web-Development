package Hibernate.OnetoOne;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name="User_Details")
public class UserDetails {
@Id
@Column(name="User_Id")
@GeneratedValue(strategy=GenerationType.SEQUENCE)
private int userId;

@Column(name="User_Name")
private String userName;

@Column(name="User_Address")
private String userAddress;

@OneToOne
@JoinColumn(name="Sr_No")
private Phone phone;

public int getUserId() {
	return userId;
}
public void setUserId(int userId) {
	this.userId = userId;
}

public String getUserName() {
	return userName;
}

public void setUserName(String userName) {
	this.userName = userName;
}

public String getUserAddress() {
	return userAddress;
}

public void setUserAddress(String userAddress) {
	this.userAddress = userAddress;
}

public Phone getPhone() {
	return phone;
}

public void setPhone(Phone phone) {
	this.phone = phone;
}

}
