package com.yazan.portfolio.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String liveUrl;
    private String description;
    private String imageSource;

    public Project(){

    }

    public Project(String name, String liveUrl, String description, String imageSource) {
        this.name = name;
        this.liveUrl = liveUrl;
        this.description = description;
        this.imageSource = imageSource;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLiveUrl() {
        return liveUrl;
    }

    public void setLiveUrl(String liveUrl) {
        this.liveUrl = liveUrl;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageSource() {
        return imageSource;
    }

    public void setImageSource(String imageSource) {
        this.imageSource = imageSource;
    }


    /* ******************* toString method ********************** */
    @Override
    public String toString() {
        return "Project{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", liveUrl='" + liveUrl + '\'' +
                ", description='" + description + '\'' +
                ", imageSource='" + imageSource + '\'' +
                '}';
    }
}
