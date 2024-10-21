package org.example;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Update;

import java.util.List;

public class MyBot extends TelegramLongPollingBot {


    @Override
    public String getBotUsername() {
        return "";
    }

    @Override
    public void onUpdateReceived(Update update) {

    }

    @Override
    public String getBotToken() {
        return super.getBotToken();
    }
}
