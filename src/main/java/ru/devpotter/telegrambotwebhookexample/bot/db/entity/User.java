package ru.devpotter.telegrambotwebhookexample.bot.db.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "users")
@Getter
@Setter
public class User {
    @Id
    @Column(name = "id")
    private long id;
    @Column(name = "name")
    private String name;
    @Column(name = "time_zone",columnDefinition = "default 0")
    //Set the broadcast time of events for your timezone
    private String timeZone;
    @OneToMany(mappedBy = "user")
    private List<Event> eventList;
    // on/of send event
    @Column(name = "on_of")
    private boolean on;
    public User(){

    }
}
