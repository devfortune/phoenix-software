package com.mfortune.softwarephoenix.repository;

import com.mfortune.softwarephoenix.domain.News;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NewsRepository extends JpaRepository<News, Long> {
}
