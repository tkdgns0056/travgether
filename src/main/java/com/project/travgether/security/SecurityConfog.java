package com.project.travgether.security;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import lombok.AllArgsConstructor;


/*
 * @EnableWebSecurity : Srping Security를 활성화 한다는 의미의 어노테이션
 * WebSecurityConfigurerAdapter는 Spring Security의 설정파일로서의 역할을 하기 위해 상속해야 하는 클래스 
 */
@EnableWebSecurity 
@AllArgsConstructor
@Configuration
public class SecurityConfog extends WebSecurityConfigurerAdapter{
	
	//비밀번호 암호화를 위한 서비스 호출
	//private MemberService memberService;
	
	@Bean
	public BCryptPasswordEncoder bCryptPasswordEncoder() {
		//암호화
		return new BCryptPasswordEncoder();
	}
	
	/* 정적 자원(css,js img)에 대해서는 Security  설정을 적용하지 않음. 무조건 접근
	 * WebSecurity는 FilterChaninProxy 생성 필터임.
	 */
	@Override
	public void configure(WebSecurity web) throws Exception {
		//해당 경로의 파일들은 spring security가 무시하도록한다.
		web.ignoring().antMatchers("/css/**", "/js/**", "/img/**");
	}
	
	/*
	 * http 관련 인증 설정 가능
	 */
	@Override
	protected void configure(HttpSecurity http) throws Exception {
	 http
	 	.authorizeRequests()
	 		.antMatchers("/login", "/signup", "/user").permitAll()//누구나 접근 허용
	 		.antMatchers("/").hasRole("USER")  //USER, ADMIN만 접근 가능
	 		.antMatchers("/admin").hasRole("ADMIN") //ADMIN만 접근 가능
	 		.anyRequest().authenticated() //나머지 요청들은 권한의 종류에 상관 없이 권한이 있어야 접근 가능
	 	.and()
	 		.formLogin() //로그인에 관한 설정 의미
	 			.loginPage("/login") //로그인 페이지 링크
	 			.defaultSuccessUrl("/") //로그인 성공 후 리다이렉트 주소
	 	.and()
	 		.logout() //로그아웃에 관한 설정 의미
	 			.logoutSuccessUrl("login") //로그아웃 성공 시 리다이렉트 주소
	 			.invalidateHttpSession(true) //세션 날리기(로그아웃 시)
	 	;
	}
	
	/*
	 * 로그인할 때 필요한 정보를 가져오는 메소드
	 */
//	@Override
//	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//		auth.userDetailsService(memberService) //유저 정보를 가져오는 서비스를 memberService으로 지정
//		// 해당 서비스(memberService)에서는 UserDetailsService를 implements해서 
//        // loadUserByUsername() 구현해야함 (서비스 참고)
//		.bCryptPasswordEncoder(new BCryptPasswordEncoder());
//	}
}
