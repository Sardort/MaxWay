package org.example;

import org.telegram.telegrambots.meta.api.methods.send.SendLocation;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;

import java.util.ArrayList;
import java.util.List;

public class MyBotService {


    // qachon yozasiz aka bularni


    public SendMessage sendMessage(Long chatId){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Salom");
        return sendMessage;
    }

    public SendMessage sendContactShare(Long chatId){

        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Kontaktingizni yuboring");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();
        button.setText("ShareContact");
        button.setRequestContact(true);
        row.add(button);
        rowList.add(row);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        return sendMessage;

    }


    public SendMessage language(Long chatId){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Xush kelibsiz / Добро пожаловать" + "\n" + "Tilni tanlang / Выберите язык");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();
        button.setText("O'zbek tili");
        row.add(button);

        KeyboardButton button1 = new KeyboardButton();
        button1.setText("Русский язык");
        row.add(button1);

        rowList.add(row);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        return sendMessage;
    }

    public SendMessage mainMenuUzbek(Long chatId){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Quyidagilardan birini tanlang");
        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();
        button.setText("🛍" + "Buyurtma berish");
        row.add(button);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton();
        button1.setText("Aksiya");
        row1.add(button1);

        KeyboardButton button2 = new KeyboardButton();
        button2.setText("Barcha filiallar");
        row1.add(button2);
        rowList.add(row1);

        KeyboardRow row2 = new KeyboardRow();
        KeyboardButton button3 = new KeyboardButton();
        button3.setText("Mening buyurtmalarim");
        row2.add(button3);


        KeyboardButton button4 = new KeyboardButton();
        button4.setText("Izoh qoldirish");
        row2.add(button4);
        rowList.add(row2);

        KeyboardRow row3 = new KeyboardRow();
        KeyboardButton button5 = new KeyboardButton();
        button5.setText("Vakansiyalar");
        row3.add(button5);

        KeyboardButton button6 = new KeyboardButton();
        button6.setText("Biz haqimizda");
        row3.add(button6);
        rowList.add(row3);

        KeyboardRow row4 = new KeyboardRow();
        KeyboardButton button7 = new KeyboardButton();
        button7.setText("Sozlamalar");
        row4.add(button7);
        rowList.add(row4);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        return sendMessage;
    }

    public SendMessage orderMenu(Long chatId){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Quyidagilardan birini tanlang");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowlist = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();
        button.setText("Olib ketish");
        row.add(button);

        KeyboardButton button1 = new KeyboardButton();
        button1.setText("Yetkazib berish");
        row.add(button1);
        rowlist.add(row);

        replyKeyboardMarkup.setKeyboard(rowlist);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        return sendMessage;

    }

    public SendMessage filials(Long chatId){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Filiallar ro'yxati");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();
        button.setText("Max Way Beruniy");
        row.add(button);

        KeyboardButton button1 = new KeyboardButton();
        button1.setText("Max Way Mega Planet");
        row.add(button1);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button2 = new KeyboardButton();
        button2.setText("Max Way Aviasozlar");
        row1.add(button2);

        KeyboardButton button3 = new KeyboardButton();
        button3.setText("Max Way Risoviy");
        row1.add(button3);
        rowList.add(row);

        KeyboardRow row2 = new KeyboardRow();
        KeyboardButton button4 = new KeyboardButton();
        button4.setText("Max Way Parus");
        row2.add(button);

        KeyboardButton button5 = new KeyboardButton();
        button5.setText("Max Way Parkent");
        row2.add(button5);
        rowList.add(row);

        KeyboardRow row3 = new KeyboardRow();
        KeyboardButton button6 = new KeyboardButton();
        button6.setText("Max Way Royson");
        row3.add(button6);

        KeyboardButton button7 = new KeyboardButton();
        button7.setText("Max Way Muqimiy");
        row3.add(button7);
        rowList.add(row);

        //Dalshe qolgan filiallarni qo'shish kerak


        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        return sendMessage;
    }

    public SendMessage infoBeruniy(Long chatId){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Filial: Max Way Beruniy" + "\n" + "Manzil:  Beruniy ko'chasi, 47, Toshkent" +
                "\n" + "Orientir: Beruniy metro bekati" + "\n" + "Telefon raqami: +998712005400" + "\n" + "Ish vaqti : 10:00 - 23:00");
        return sendMessage;
    }

    public SendLocation locationBeruniy(Long chatId){
        SendLocation sendLocation = new SendLocation();
        sendLocation.setChatId(chatId);
        sendLocation.setLatitude(41.344430);
        sendLocation.setLongitude(69.205021);
        return sendLocation;
    }

    public SendMessage menuFilial(Long chatId){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Kategoriyani tanlang");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList=new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();
        button.setText("Interaktiv menyu");
        row.add(button);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton();
        button1.setText("Orqaga");
        row1.add(button1);

        KeyboardButton button2 = new KeyboardButton();
        button2.setText("Savat");
        row1.add(button2);
        rowList.add(row1);

        KeyboardRow row2 = new KeyboardRow();
        KeyboardButton button3 = new KeyboardButton();
        button3.setText("Aksiya Lavash mini" + "\n"+ "1+1=3");
        row2.add(button3);

        KeyboardButton button4 = new KeyboardButton();
        button4.setText("Yangilik");
        row2.add(button4);
        rowList.add(row2);

        KeyboardRow row3 = new KeyboardRow();
        KeyboardButton button5 = new KeyboardButton();
        button5.setText("Barakali Maxi Box");
        row3.add(button5);

        KeyboardButton button6 = new KeyboardButton();
        button6.setText("Klab-Sendvich");
        row3.add(button6);
        rowList.add(row3);

        KeyboardRow row4 = new KeyboardRow();
        KeyboardButton button7 = new KeyboardButton();
        button7.setText("Lavash");
        row4.add(button7);

        KeyboardButton button8 = new KeyboardButton();
        button8.setText("Shaurma");
        row4.add(button8);
        rowList.add(row4);
        return sendMessage;
        //Qolgan menyuni kiritib chiqish
    }



}
