package com.project.travgether.mapper;

import org.apache.ibatis.annotations.Mapper;
import com.project.travgether.vo.Member;

@Mapper
public interface MemberMapper {
	
	//회원가입
	public void signUp(Member member);
}
