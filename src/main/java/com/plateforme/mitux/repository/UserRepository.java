package com.plateforme.mitux.repository;
import org.springframework.data.repository.CrudRepository;

import com.plateforme.mitux.model.CandidateDao;

public interface UserRepository extends CrudRepository<CandidateDao, Integer> {
    CandidateDao findByEmail(String email);
}