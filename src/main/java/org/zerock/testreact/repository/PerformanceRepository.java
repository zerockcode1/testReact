package org.zerock.testreact.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.zerock.testreact.entity.Performance;

public interface PerformanceRepository extends JpaRepository<Performance, Long> {


}
