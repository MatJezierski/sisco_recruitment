package com.cisco.caseapp.service;

import com.cisco.caseapp.entity.Case;
import com.cisco.caseapp.repo.CaseRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CaseService {

    private final CaseRepository repository;

    public CaseService(CaseRepository repository) {
        this.repository = repository;
    }
    public List<Case> findByGivenStatus(com.cisco.caseapp.domain.Case.Status status) {
        return repository.findAll();
    }

    public List<Case> findByGivenUserId(Integer userId) {
        return repository.findAll();
    }

    public List<Case> findOpenForGivenUserId(Integer userId) {
        return repository.findAll();
    }

    public Optional<Case> findById(Long id) {
        return Optional.empty();
    }
}
