package ru.devpotter.telegrambotwebhookexample.bot.cash;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;
import ru.devpotter.telegrambotwebhookexample.bot.model.BotState;

import java.util.HashMap;
import java.util.Map;

@Service
@Setter
@Getter
public class BotStateCash {
    private final Map<Long, BotState> botStateMap= new HashMap<>();

    public void saveBotStat(long userId, BotState botState){
        botStateMap.put(userId,botState);
    }
}
