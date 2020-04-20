package com.jse.member;

import lombok.Data;

@Data
public class Member {
	private String userid,passwd,name,ssn, addr;
}

	/*public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getList() {
		return list;
	}

	public void setList(String list) {
		this.list = list;
	}
	@Override
	public String toString() {
	
		return String.format(name +"/"+ userid+"/" + passwd+"/" + ssn+"/"+addr, null) ;
	}
	

}*/