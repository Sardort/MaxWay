package org.example;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.methods.updatingmessages.EditMessageReplyMarkup;
import org.telegram.telegrambots.meta.api.methods.updatingmessages.EditMessageText;
import org.telegram.telegrambots.meta.api.objects.CallbackQuery;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.util.List;

public class MyBot extends TelegramLongPollingBot {

    // qachon yozasiz aka bularni
    @Override
    public String getBotUsername() {
        return "onlinedarslarplatformasiBot";
    }


    private MyBotService myBotService = new MyBotService();

    @Override
    public void onUpdateReceived(Update update) {

        if (update.hasMessage() && update.getMessage().hasText()) {
            String text = update.getMessage().getText();
            Long chatId = update.getMessage().getChatId();
            String firstName = update.getMessage().getChat().getFirstName();
            String lastName = update.getMessage().getChat().getLastName();

            info(chatId, text, firstName, lastName);

            if (text.equals("/start")) {
                try {
                    execute(myBotService.sendContactShare(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }


            if (text.equals("O'zbek tili")) {
                try {
                    execute(myBotService.mainMenuUzbek(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (text.equals("\uD83D\uDC4DBarcha filiallar")) {
                try {
                    execute(myBotService.filials(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (text.equals("Max Way Beruniy")) {
                try {
                    execute(myBotService.infoBeruniy(chatId));
                    execute(myBotService.locationBeruniy(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Max Way Aviasozlar")) {
                try {
                    execute(myBotService.infoAviasozlar(chatId));
                    execute(myBotService.locationAviasozlar(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Max Way Risoviy")) {
                try {
                    execute(myBotService.infoRisoviy(chatId));
                    execute(myBotService.locationRisoviy(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Max Way Parus")) {
                try {
                    execute(myBotService.infoParus(chatId));
                    execute(myBotService.locationParus(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Max Way Parkent")) {
                try {
                    execute(myBotService.infoParkent(chatId));
                    execute(myBotService.locationParkent(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Max Way Universam")) {
                try {
                    execute(myBotService.infoUniversam(chatId));
                    execute(myBotService.locationUniversam(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Max Way Royson")) {
                try {
                    execute(myBotService.infoRoyson(chatId));
                    execute(myBotService.locationRoyson(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Max Way Muqimiy")) {
                try {
                    execute(myBotService.infoMuqimiy(chatId));
                    execute(myBotService.locationMuqimiy(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (text.equals("\uD83D\uDECDBuyurtma berish")) {
                try {
                    execute(myBotService.orderMenu(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (text.equals("Olib ketish")) {
                try {
                    execute(myBotService.filialsForOrders(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (text.equals("\uD83D\uDCCDMax Way Beruniy")) {
                try {
                    execute(myBotService.menuFilial(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Biz haqimizda")) {
                try {
                    execute(myBotService.aboutUs(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (text.equals("Lavash")) {
                try {
                    execute(myBotService.sendPhotoLavash(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("/test")){
                try {
                    execute(myBotService.sendPhotoLavashozi(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }


            /*if (text.equals("Lavash")){
                try {
                    execute(myBotService.sendPhotoLavash(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }*/

            /*if (text.equals("Lavash")){
                EditMessageText editMessageText = new EditMessageText();
                editMessageText.setChatId(chatId);
                editMessageText.setMessageId(callbackQuary);
            }*/


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

        if (update.hasMessage() && update.getMessage().hasContact()) {
            Long chatId = update.getMessage().getChatId();

            try {
                execute(myBotService.language(chatId));
            } catch (TelegramApiException e) {
                throw new RuntimeException(e);
            }


        } else if (update.hasCallbackQuery()) {

            CallbackQuery callbackQuery = update.getCallbackQuery();
            Long chatId = callbackQuery.getMessage().getChatId();
            Integer messageId = callbackQuery.getMessage().getMessageId();
            String data = callbackQuery.getData();
            System.out.println(data);

            if (data.equals("Lavash")) {
                EditMessageText editMessageText = new EditMessageText();
                editMessageText.setChatId(chatId);
                editMessageText.setMessageId(callbackQuery.getMessage().getMessageId());
            }

            if (data.equals("plusId")){
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(messageId);
                editMessageReplyMarkup.setReplyMarkup(myBotService.sendPhotoLavashoziPlus(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }


            }
            if(data.equals("minusId")){
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(messageId);
                editMessageReplyMarkup.setReplyMarkup(myBotService.sendPhotoLavashoziMinus(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }


        }
    }

    @Override
    public String getBotToken() {
        return "7747156046:AAFRB-oFAHOH2KWnwX9GEh3591R1ixC5Q9o";
    }

    public void info(Long chatId, String text, String firstname, String lastname) {
        System.out.println(" ChatId " + chatId + "\n" + " Text " + text + "\n" +
                " Firsname " + firstname + "\n" + " Lastname " + lastname);
    }
}
