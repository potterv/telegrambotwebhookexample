package ru.devpotter.telegrambotwebhookexample.bot.db.entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import ru.devpotter.telegrambotwebhookexample.bot.model.EventFreq;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
@Table(name = "user_events")
@Setter
@Getter
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "event_id",columnDefinition = "serial")
    private int eventid;
    @Column(name = "time")
    @NotNull(message = "Need date")
    private Date date;
    @Column(name = "description")
    @Size(min = 4, max = 200, message = "Description must be between 0 and 200 chars!")
    private String description;

    @Column(name = "event_freq", columnDefinition = "Time")
    @Enumerated(EnumType.STRING)
    private EventFreq freq;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id")
    @OnDelete(action = OnDeleteAction.CASCADE)
    private User user;

    public Event(){

    }

    public Event(int iventId,@NotNull(message = "Need date!") Date date,
                 @Size(min = 4, max = 200,message = "Description must be between 0 and 200 chars!") String description,
                 EventFreq freq,
                 User user){



    }

}