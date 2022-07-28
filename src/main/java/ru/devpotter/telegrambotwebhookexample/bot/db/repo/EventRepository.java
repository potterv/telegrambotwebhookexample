package ru.devpotter.telegrambotwebhookexample.bot.db.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.devpotter.telegrambotwebhookexample.bot.db.entity.Event;

public interface EventRepository extends JpaRepository<Event,Long> {
    Event findByEventId(long id);
}
