package com.example.assignment1.model;

import java.io.Serializable;
import java.util.Dictionary;
import java.util.HashMap;

public class Team implements Serializable {
    String name;
    String since;
    int logo;
    int players_pic;
    HashMap<String, String> players;

    public Team(){}
    public Team(String name, String since, int logo, int players_pic, HashMap<String, String> players) {
        this.name = name;
        this.since = since;
        this.logo = logo;
        this.players_pic = players_pic;
        this.players = players;
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

    public int getLogo() {
        return logo;
    }

    public void setLogo(int logo) {
        this.logo = logo;
    }

    public int getPlayers_pic() {
        return players_pic;
    }

    public void setPlayers_pic(int players_pic) {
        this.players_pic = players_pic;
    }

    public HashMap<String, String> getPlayers() {
        return players;
    }

    public void setPlayers(HashMap<String, String> players) {
        this.players = players;
    }
}
