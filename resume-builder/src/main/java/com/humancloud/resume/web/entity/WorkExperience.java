package com.humancloud.resume.web.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.Cascade;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType.*;

@Entity
@Data
public class WorkExperience {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String company;
    private String jobRole;
    private String periodFrom;
    private String periodTo;
    @ElementCollection
    private List<Project> projects = new ArrayList<Project>();

}
