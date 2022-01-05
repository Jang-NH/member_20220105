package com.icia.member.repository;

import com.icia.member.entity.MemberEntity;
import org.springframework.data.jpa.repository.JpaRepository;

// JpaRepository<해당 Entity 클래스이름, PK 타입>
// JpaRepository 상속받아 쓸때는 @Repository 안씀.
public interface MemberRepository extends JpaRepository<MemberEntity, Long> {

}
