package com.project.travgether.vo;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class Member  {
	

	private String memberEmail; //회원 이메일
	private String memberPw;    //회원 비번
	private String memberName;  //회원 이름
	private String memberBirthday; //회원 생년원일
	private String memberAddress;  //회원 주소
	private int memberePhoneNum;   //회원 전화번호
	private String memberSex;      //회원 성별
	private String loginType;      //로그인 타입(카카오,네이버,이메일) ->ENUM으로?
	private String authType;       //권한 타입(회원,관리자) ->ENUM으로?
	private String memberTemperature; //매너온도
	
//	/*
//	 * 사용자의 권한을 콜렉션 형태로 반환
//	 * (클래스 자료형은 GrantedAuthority를 구현해야함
//	 */
//	@Override
//	public Collection<? extends GrantedAuthority> getAuthorities() {
//		
//		return null;
//	}
//	
//	/*
//	 * 사용자 pw를 반환
//	 */
//	
//	@Override
//	public String getPassword() { 
//		
//		return this.memberPw;
//	}
//	
//	/*
//	 * 사용자 id를 반환(id는 유니크한 값)
//	 */
//	@Override
//	public String getUsername() { 
//		
//		return this.memberEmail;
//	}
//	
//	/*
//	 * 계정 만료 여부 반환(true = 만료되지 않음 의미)
//	 */
//	@Override
//	public boolean isAccountNonExpired() { 
//		
//		return false;
//	}
//	
//	/*
//	 * 계정 잠근 여무 반환(true = 잠금 되지 않음 의미)
//	 */
//	@Override
//	public boolean isAccountNonLocked() {
//		
//		return false;
//	}
//	
//	/*
//	 * 패스워드 만료 여부 반환(true = 만료되지 않음 의미)
//	 */
//	@Override
//	public boolean isCredentialsNonExpired() {
//		
//		return false;
//	}
//	
//	/*
//	 * 계정 사용 가능 여부 반환(true = 사용 가능 의미)
//	 */
//	@Override
//	public boolean isEnabled() {
//		
//		return false;
//	}
//	

}
