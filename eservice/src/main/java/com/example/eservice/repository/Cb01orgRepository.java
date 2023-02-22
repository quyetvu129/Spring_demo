package com.example.eservice.repository;

import com.example.eservice.entity.Cb01OrgEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface Cb01orgRepository extends JpaRepository<Cb01OrgEntity, Long> {

    @Query(value = "SELECT c FROM Cb01OrgEntity c WHERE c.idType = ?1 AND c.orgId = ?2 AND c.orgScreenNm = ?3")
    List<Cb01OrgEntity> getByConditions(Long idType, Long orgId, String irgScreenNm);
}

