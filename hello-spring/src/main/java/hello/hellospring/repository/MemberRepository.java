package hello.hellospring.repository;

import hello.hellospring.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    Member save(Member save); // 회원을 저장하고, 저장된 회원을 반환
    Optional<Member> findById(Long id); // null 값도 반환될 수 있기 때문에 optional 사용
    Optional<Member> findByName(String name);
    List<Member> findAll();
}
