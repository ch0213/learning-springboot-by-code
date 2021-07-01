package hello.LearningSpringbootbyCode;

import hello.LearningSpringbootbyCode.repository.MemberRepository;
import hello.LearningSpringbootbyCode.repository.MemoryMemberRepository;
import hello.LearningSpringbootbyCode.service.MemberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }
}
