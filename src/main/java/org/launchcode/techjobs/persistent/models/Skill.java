package org.launchcode.techjobs.persistent.models;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.Size;

@Entity
public class Skill extends AbstractEntity {
    @Size(min = 3, max = 2000, message = "Description must be shorter than 2000 characters")
    private String description;
    public Skill (String description){

        this.description = description;
    }
    public Skill(){};

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
