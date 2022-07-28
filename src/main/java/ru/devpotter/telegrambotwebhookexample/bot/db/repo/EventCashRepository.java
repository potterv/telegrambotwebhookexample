package ru.devpotter.telegrambotwebhookexample.bot.db.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.devpotter.telegrambotwebhookexample.bot.db.entity.EventCashEntity;

public interface EventCashRepository extends JpaRepository<EventCashEntity,Long> {
    EventCashEntity findById(long id);
}
