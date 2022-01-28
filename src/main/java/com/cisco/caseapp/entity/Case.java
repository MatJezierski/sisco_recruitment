package com.cisco.caseapp.entity;

import com.cisco.caseapp.domain.Note;
import com.cisco.caseapp.domain.User;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Case {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "severity")
    private Integer severity;

    @Column(name = "status")
    private com.cisco.caseapp.domain.Case.Status status;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private User user;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "case_id")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private List<Note> notes;
}
