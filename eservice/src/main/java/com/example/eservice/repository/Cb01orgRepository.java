package com.example.eservice.repository;

import com.example.eservice.entity.Cb01OrgEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface Cb01orgRepository extends JpaRepository<Cb01OrgEntity, Long> {

    @Query(value = "SELECT c FROM Cb01OrgEntity c WHERE c.idType = ?1 AND c.orgId = ?2 AND c.orgScreenNm = ?3")
    List<Cb01OrgEntity> getByConditions(Long idType, Long orgId, String irgScreenNm);

    Optional<Cb01OrgEntity> findByOrgId(Long orgId);

    @Query(value = "SELECT c FROM Cb01OrgEntity c WHERE c.orgId <> ?1")
    List<Cb01OrgEntity> getParentAvail(Long orgId);

    @Query(value = "SELECT c FROM Cb01OrgEntity c WHERE c.orgId = ?1")
    Cb01OrgEntity getParent(Long parentOrgKey);

    @Query(value = "SELECT c FROM Cb01OrgEntity c WHERE c.orgId <>?1 and c.parentOrgKey is null")
    List<Cb01OrgEntity> getSubsidiaryAvail(Long orgId);

    @Query(value = "SELECT c FROM Cb01OrgEntity c WHERE c.parentOrgKey = ?1")
    List<Cb01OrgEntity> getSubsidiary(Long orgId);
}

