package com.car;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarMemberRepository extends JpaRepository<CarMember, Long> {
}
