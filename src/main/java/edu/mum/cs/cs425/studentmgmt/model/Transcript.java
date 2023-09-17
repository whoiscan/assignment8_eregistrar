package edu.mum.cs.cs425.studentmgmt.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Transcript {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long transcriptId;
    private String title;

    public Transcript(String title) {
        this.title = title;
    }
}
