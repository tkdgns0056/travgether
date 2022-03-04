package com.project.travgether.member;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import com.project.travgether.mapper.MemberMapper;
import com.project.travgether.vo.Member;


class MemberTest {
	
	@Autowired
	private MemberMapper memberMapper;  //MemberMapper.java 인터페이스 의존성 주입
	
	@Test
	void singUpTest() {
		
		Member member = new Member();
		
		member.setMemberEmail("test1@test.com");
		member.setMemberPw("test1");
		member.setMemberName("테스트");
		
		memberMapper.signUp(member);

	}
}
