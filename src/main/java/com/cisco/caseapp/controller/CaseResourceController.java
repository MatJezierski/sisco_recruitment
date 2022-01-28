package com.cisco.caseapp.controller;

import com.cisco.caseapp.domain.Case;
import com.cisco.caseapp.domain.Note;
import com.cisco.caseapp.service.CaseService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
@RequiredArgsConstructor
public class CaseResourceController {

    @Autowired
    private final CaseService service;

    @GetMapping("/cases/status/{status}")
    List<com.cisco.caseapp.entity.Case> getCasesWithStatus(@PathVariable Case.Status status) {
        // TODO: Query for cases with a specified status.
        log.debug("Finding cases with status: {}", status);
        List<com.cisco.caseapp.entity.Case> casesWithGivenStatus = service.findByGivenStatus(status);

        return List.of();
    }
    @GetMapping("/cases/user/{userId}")
    List<Case> getOpenCases(@PathVariable Integer userId) {
        // TODO: Query for cases with a userId;
        return List.of();
    }
    @GetMapping("/cases/user/{userId}/status/{status}")
    List<Case> getOpenCases(@PathVariable Integer userId, @PathVariable Case.Status status) {
        // TODO: Query for cases with a userId and status
        return List.of();
    }
    @GetMapping("/case/{caseId}")
    Case getCase(@PathVariable Integer caseId) {
        // TODO: Get a case by ID
        return null;
    }
    @PostMapping(value = "/case/create", consumes = "application/json")
    Case createCase(@RequestBody Case toCreate) {
        // TODO: Create a case and any associated records (user, notes)
        return toCreate;
    }
    @PostMapping(value = "/case/{caseId}/addNote", consumes = "text/plain")
    Note addNote(@PathVariable Integer caseId, @RequestBody String detail) {
        // TODO: Create a note for the specified case
        return null;
    }
}
