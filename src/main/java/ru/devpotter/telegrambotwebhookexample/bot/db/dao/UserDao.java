package ru.devpotter.telegrambotwebhookexample.bot.db.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.devpotter.telegrambotwebhookexample.bot.db.entity.User;
import ru.devpotter.telegrambotwebhookexample.bot.db.repo.UserRepository;

import java.util.List;

@Service
public class UserDao {
    private final UserRepository userRepository;
    @Autowired
    public UserDao(UserRepository userRepository){
        this.userRepository = userRepository;
    }
    public User findByUserId(long id){
        return userRepository.fidById(id);
    }
    public List<User> findAllUsers(){
        return userRepository.findAll();
    }
    public void removeUser(User user){
        userRepository.delete(user);
    }
    public void save(User user){
        userRepository.save(user);
    }
    public boolean isExist(long id){
        User user = findByUserId(id);
        return user !=null;
    }

}
