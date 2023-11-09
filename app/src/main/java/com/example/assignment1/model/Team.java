package com.example.assignment1.model;

public class Team {
    String name;
    String since;
    String logo;

    public Team(String name, String since, String logo) {
        this.name = name;
        this.since = since;
        this.logo = logo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSince() {
        return since;
    }

    public void setSince(String since) {
        this.since = since;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }
}
