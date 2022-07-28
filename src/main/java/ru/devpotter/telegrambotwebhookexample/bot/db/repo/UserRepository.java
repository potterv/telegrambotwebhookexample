package ru.devpotter.telegrambotwebhookexample.bot.db.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.devpotter.telegrambotwebhookexample.bot.db.entity.User;

public interface UserRepository extends JpaRepository<User,Long> {
    User fidById(long id);
}
