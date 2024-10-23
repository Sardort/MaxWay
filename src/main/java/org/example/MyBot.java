package org.example;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.util.List;

public class MyBot extends TelegramLongPollingBot {

// qachon yozasiz aka bularni
    @Override
    public String getBotUsername() {
        return "MaxwayCloneBot";
    }


    private MyBotService myBotService= new MyBotService();

    @Override
    public void onUpdateReceived(Update update) {

        if (update.hasMessage() && update.getMessage().hasText()){
            String text = update.getMessage().getText();
            Long chatId = update.getMessage().getChatId();
            String firstName = update.getMessage().getChat().getFirstName();
            String lastName = update.getMessage().getChat().getLastName();

            info(chatId,text,firstName,lastName);

            if (text.equals("/start")){
                try {
                    execute(myBotService.language(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (text.equals("O'zbek tili")){
                try {
                    execute(myBotService.mainMenuUzbek(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }


            /*if (text.equals("/start")){
                SendMessage sendMessage = new SendMessage();
                sendMessage.setChatId(chatId);
                sendMessage.setText("Salom");

                try {
                    execute(sendMessage);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }*/
        }

    }

    @Override
    public String getBotToken() {
        return "7573595803:AAHfkYMaT-K7haa613rHdG5t2nVbX_gRLrE";
    }

    public void info (Long chatId, String text, String firstname, String lastname){
        System.out.println(" ChatId " + chatId + "\n" + " Text " + text + "\n" +
                " Firsname " + firstname + "\n" + " Lastname " + lastname);
    }
}
