package com.project.travgether.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.travgether.mapper.MemberMapper;
import com.project.travgether.vo.Member;

@Service
public class MemberServiceImpl implements MemberService {
	
	@Autowired
	private MemberMapper memberMapper;

	@Override
	public void signUp(Member member) {
	
		memberMapper.signUp(member);
		
	}
	
	
}
