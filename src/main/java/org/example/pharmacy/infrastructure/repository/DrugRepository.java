package org.example.pharmacy.infrastructure.repository;

import org.example.pharmacy.infrastructure.entity.DrugEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DrugRepository extends JpaRepository<DrugEntity, Long> {
}
