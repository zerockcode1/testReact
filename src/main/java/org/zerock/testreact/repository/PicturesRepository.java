package org.zerock.testreact.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.zerock.testreact.entity.Pictures;

public interface PicturesRepository extends JpaRepository<Pictures, Long> {
}
