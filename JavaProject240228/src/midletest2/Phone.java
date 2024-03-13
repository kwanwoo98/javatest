package midletest2;

public class Phone {
	private String name;
	private String tel;
	private String address;

	public Phone(String name, String tel, String address) {
		this.name = name;
		this.tel = tel;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public String getTel() {
		return tel;
	}

	public String getAddress() {
		return address;
	}

	public String toString() {
		return name + "의 번호와 주소는 " + tel + ", " + address + " 입니다.";
	}
}
