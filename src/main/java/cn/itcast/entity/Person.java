package cn.itcast.entity;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Person implements Serializable {
	private static final long serialVersionUID = -5561795043358487403L;

	private String username;
	@DateTimeFormat(iso=ISO.DATE)   // 如果是 key-value 对数据提交，使用这个
	@JsonFormat(pattern="yyyy-MM-dd") // 如果是 json 数据提交，使用这个
	private Date birthDate;
	private String gender;
	private String[] intersts;
	private String province;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String[] getIntersts() {
		return intersts;
	}

	public void setIntersts(String[] intersts) {
		this.intersts = intersts;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	@Override
	public String toString() {
		return "Person [username=" + username + ", birthDate=" + birthDate + ", gender=" + gender + ", intersts="
				+ Arrays.toString(intersts) + ", province=" + province + "]";
	}

	
	
}
