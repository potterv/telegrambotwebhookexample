package ru.devpotter.telegrambotwebhookexample.bot.db.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.devpotter.telegrambotwebhookexample.bot.db.entity.EventCashEntity;
import ru.devpotter.telegrambotwebhookexample.bot.db.repo.EventCashRepository;

import java.util.List;

@Service
public class EventCashDAO {
    private EventCashRepository eventCashRepository;
    @Autowired
    public void setEventCashRepository(EventCashRepository eventCashRepository){
        this.eventCashRepository = eventCashRepository;
    }
    public List<EventCashEntity> findAllEventCash(){
        return this.eventCashRepository.findAll();
    }
    public void save(EventCashEntity eventCashEntity){
        eventCashRepository.save(eventCashEntity);
    }
    public void delete(long id){
        eventCashRepository.deleteById(id);
    }
}
