package com.example.eservice.repository;

import com.example.eservice.entity.PackageEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PackageRepository extends JpaRepository<PackageEntity, Long> {
}
