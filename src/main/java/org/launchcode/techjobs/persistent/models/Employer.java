package org.launchcode.techjobs.persistent.models;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Employer extends AbstractEntity {
@OneToMany
@JoinColumn (name = "employer_id")
private final List<Job> jobs = new ArrayList<>();
    @NotBlank(message = "Location is required")
    @Size(max = 100, message = "Location must be shorter than 100 characters")
    private String location;

    public Employer(String location) {
        this.location = location;
    }
    public Employer(){}

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<Job> getJobs() {
        return jobs;
    }
}
