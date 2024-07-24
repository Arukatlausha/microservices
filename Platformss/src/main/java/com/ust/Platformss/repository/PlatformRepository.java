package com.ust.Platformss.repository;

import com.ust.Platformss.model.PlatformDetails;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PlatformRepository extends JpaRepository<PlatformDetails,Integer> {

    Optional<PlatformDetails> findByPlatformid (int platformid);
}
