package ru.devpotter.telegrambotwebhookexample.bot.db.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.SpringVersion;
import org.springframework.stereotype.Service;
import ru.devpotter.telegrambotwebhookexample.bot.db.entity.Event;
import ru.devpotter.telegrambotwebhookexample.bot.db.entity.User;
import ru.devpotter.telegrambotwebhookexample.bot.db.repo.EventRepository;
import ru.devpotter.telegrambotwebhookexample.bot.db.repo.UserRepository;

import java.util.List;

@Service
public class EventDAO {
    private final UserRepository userRepository;
    private final EventRepository eventRepository;

    @Autowired
    public EventDAO(UserRepository userRepository,EventRepository eventRepository) {
        this.userRepository = userRepository;
        this.eventRepository =eventRepository;
    }
    public List<Event> findByUserId(long userId){
        User user = userRepository.fidById(userId);
        return user.getEventList();
    }
    public List<Event> findAllEvent(){
        return eventRepository.findAll();
    }
    public Event findByEventId(long eventId){
        return eventRepository.findByEventId(eventId);
    }
    public void remove(Event event){
        eventRepository.delete(event);
    }
    public void save(Event event){
        eventRepository.save(event);
    }
}
