package com.khyuna0.ch11.part01;

public class Member { // DTO 클래스

	public String id; // 회원 id

	public Member() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Member(String id) {
		super();
		this.id = id;
	}

	// 객체를 인수로 받아서 그 객체가 Member 클래스로 만든 객체인지 확인하여
	// member 객체로 다운캐스팅 해서 그 안의 id 필드를 꺼내서 
	// 본인 객체가 가지고 있는 id 값과 비교하여 같으면 T 아니면 F 출력하는 메소드 오버라이딩
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Member) {
			Member member = (Member) obj;
			if (id.equals(member.id)){
				return true;
			} 
		}
		return false;
	}

	@Override
	public String toString() {
		return id;
	}
	
	
	
	
}
