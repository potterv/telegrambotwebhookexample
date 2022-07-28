package ru.devpotter.telegrambotwebhookexample.bot.cash;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;
import ru.devpotter.telegrambotwebhookexample.bot.db.entity.Event;

import java.util.HashMap;
import java.util.Map;

@Service
@Setter
@Getter
public class EventCash {
    private final Map<Long, Event> eventMap = new HashMap<>();

    public void saveEventCash(long userId, Event event) {

        this.eventMap.put(userId, event);
    }
}
