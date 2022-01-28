package com.cisco.caseapp.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class Note {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "note_id")
    private Integer noteId;

    @Column(name = "case_id")
    private Integer caseId;

    @Column(name = "details")
    private String details;
}
