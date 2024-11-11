package org.example;

import org.telegram.telegrambots.meta.api.methods.ParseMode;
import org.telegram.telegrambots.meta.api.methods.send.SendLocation;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.methods.send.SendPhoto;
import org.telegram.telegrambots.meta.api.objects.InputFile;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;
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
        button.setText("\uD83D\uDECDBuyurtma berish");
        row.add(button);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton();
        button1.setText("Aksiya");
        row1.add(button1);

        KeyboardButton button2 = new KeyboardButton();
        button2.setText("\uD83D\uDC4DBarcha filiallar");
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
        button1.setText("Max Way Aviasozlar");
        row.add(button1);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button2 = new KeyboardButton();
        button2.setText("Max Way Risoviy");
        row1.add(button2);

        KeyboardButton button3 = new KeyboardButton();
        button3.setText("Max Way Parus");
        row1.add(button3);
        rowList.add(row1);

        KeyboardRow row2 = new KeyboardRow();
        KeyboardButton button4 = new KeyboardButton();
        button4.setText("Max Way Parkent");
        row2.add(button);

        KeyboardButton button5 = new KeyboardButton();
        button5.setText("Max Way Universam");
        row2.add(button5);
        rowList.add(row2);

        KeyboardRow row3 = new KeyboardRow();
        KeyboardButton button6 = new KeyboardButton();
        button6.setText("Max Way Royson");
        row3.add(button6);

        KeyboardButton button7 = new KeyboardButton();
        button7.setText("Max Way Muqimiy");
        row3.add(button7);
        rowList.add(row3);

        //Dalshe qolgan filiallarni qo'shish kerak


        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        return sendMessage;
    }
    public SendMessage filialsForOrders(Long chatId){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("\uD83D\uDCCDFiliallar ro'yxati");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();
        button.setText("\uD83D\uDCCDMax Way Beruniy");
        row.add(button);

        KeyboardButton button1 = new KeyboardButton();
        button1.setText("\uD83D\uDCCDMax Way Aviasozlar");
        row.add(button1);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button2 = new KeyboardButton();
        button2.setText("\uD83D\uDCCDMax Way Risoviy");
        row1.add(button2);

        KeyboardButton button3 = new KeyboardButton();
        button3.setText("\uD83D\uDCCDMax Way Parus");
        row1.add(button3);
        rowList.add(row1);

        KeyboardRow row2 = new KeyboardRow();
        KeyboardButton button4 = new KeyboardButton();
        button4.setText("\uD83D\uDCCDMax Way Parkent");
        row2.add(button);

        KeyboardButton button5 = new KeyboardButton();
        button5.setText("\uD83D\uDCCDMax Way Universam");
        row2.add(button5);
        rowList.add(row2);

        KeyboardRow row3 = new KeyboardRow();
        KeyboardButton button6 = new KeyboardButton();
        button6.setText("\uD83D\uDCCDMax Way Royson");
        row3.add(button6);

        KeyboardButton button7 = new KeyboardButton();
        button7.setText("\uD83D\uDCCDMax Way Muqimiy");
        row3.add(button7);
        rowList.add(row3);

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

    public SendMessage infoAviasozlar(Long chatId){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Filial: Max Way Aviasozlar" + "\n" + "Manzil:  Aviasozlar ko'chasi, 23, Toshkent" +
                "\n" + "Orientir: " + "\n" + "Telefon raqami: +998712005400" + "\n" + "Ish vaqti : 10:00 - 03:00");
        return sendMessage;
    }

    public SendLocation locationAviasozlar(Long chatId){
        SendLocation sendLocation = new SendLocation();
        sendLocation.setChatId(chatId);
        sendLocation.setLatitude(41.290894);
        sendLocation.setLongitude(69.342153);
        return sendLocation;
    }

    public SendMessage infoRisoviy(Long chatId){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Filial: Max Way Risoviy" + "\n" + "Manzil:  Oltinko'l ko'chasi, 10, Toshkent" +
                "\n" + "Orientir: Tantana to'yxonasi" + "\n" + "Telefon raqami: +998712005400" + "\n" + "Ish vaqti : 10:00 - 23:00");
        return sendMessage;
    }

    public SendLocation locationRisoviy(Long chatId){
        SendLocation sendLocation = new SendLocation();
        sendLocation.setChatId(chatId);
        sendLocation.setLatitude(41.274899);
        sendLocation.setLongitude(69.309423);
        return sendLocation;
    }

    public SendMessage infoParus(Long chatId){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Filial: Max Way Parus" + "\n" + "Manzil:  Qatortol ko'chasi, 60/5, Toshkent" +
                "\n" + "Orientir: Parus savdo markazi" + "\n" + "Telefon raqami: +998712005400" + "\n" + "Ish vaqti : 10:00 - 03:00");
        return sendMessage;
    }

    public SendLocation locationParus(Long chatId){
        SendLocation sendLocation = new SendLocation();
        sendLocation.setChatId(chatId);
        sendLocation.setLatitude(41.293536);
        sendLocation.setLongitude(69.212856);
        return sendLocation;
    }

    public SendMessage infoParkent(Long chatId){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Filial: Max Way Parkent" + "\n" + "Manzil:  Parkent ko'chasi, 30B, Toshkent" +
                "\n" + "Orientir: Parkent bozori" + "\n" + "Telefon raqami: +998712005400" + "\n" + "Ish vaqti : 10:00 - 03:00");
        return sendMessage;
    }

    public SendLocation locationParkent(Long chatId){
        SendLocation sendLocation = new SendLocation();
        sendLocation.setChatId(chatId);
        sendLocation.setLatitude(41.314772);
        sendLocation.setLongitude(69.325067);
        return sendLocation;
    }

    public SendMessage infoUniversam(Long chatId){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Filial: Max Way Universam" + "\n" + "Manzil:  Amir Temur shox ko'chasi, 41/3, Toshkent" +
                "\n" + "Orientir: Universam Yunusobod" + "\n" + "Telefon raqami: +998712005400" + "\n" + "Ish vaqti : 10:00 - 23:00");
        return sendMessage;
    }

    public SendLocation locationUniversam(Long chatId){
        SendLocation sendLocation = new SendLocation();
        sendLocation.setChatId(chatId);
        sendLocation.setLatitude(41.363468);
        sendLocation.setLongitude(69.288586);
        return sendLocation;
    }

    public SendMessage infoRoyson(Long chatId){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Filial: Max Way Royson" + "\n" + "Manzil:  Zarqaynar ko'chasi, 2, Toshkent" +
                "\n" + "Orientir: Sirk" + "\n" + "Telefon raqami: +998712005400" + "\n" + "Ish vaqti : 10:00 - 01:00");
        return sendMessage;
    }

    public SendLocation locationRoyson(Long chatId){
        SendLocation sendLocation = new SendLocation();
        sendLocation.setChatId(chatId);
        sendLocation.setLatitude(41.322643);
        sendLocation.setLongitude(69.241973);
        return sendLocation;
    }

    public SendMessage infoMuqimiy(Long chatId){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Filial: Max Way Muqimiy" + "\n" + "Manzil:  Chilonzor ko'chasi, Toshkent" +
                "\n" + "Orientir: Chilonzor 1-kvartal" + "\n" + "Telefon raqami: +998712005400" + "\n" + "Ish vaqti : 10:00 - 03:00");
        return sendMessage;
    }

    public SendLocation locationMuqimiy(Long chatId){
        SendLocation sendLocation = new SendLocation();
        sendLocation.setChatId(chatId);
        sendLocation.setLatitude(41.287875);
        sendLocation.setLongitude(69.229238);
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

        //Qolgan menyuni kiritib chiqish
        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;



    }

    public SendMessage sendMessageInline(Long chatId){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Quyidagilardan birini tanlang");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<InlineKeyboardButton> row= new ArrayList<>();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();

        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("Mini");
        button.setCallbackData("miniId");
        row.add(button);
        rowlist.add(row);

        InlineKeyboardButton button1 = new InlineKeyboardButton();
        button1.setText("Standart");
        button1.setCallbackData("standartId");
        row.add(button1);

        InlineKeyboardButton button2 = new InlineKeyboardButton();
        button2.setText("Big");
        button2.setCallbackData("bigId");
        row.add(button2);

        inlineKeyboardMarkup.setKeyboard(rowlist);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);
        return sendMessage;
    }

    public SendPhoto sendPhotoLavash(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://maxway.uz/_next/image?url=https%3A%2F%2Fcdn.delever.uz%2Fdelever%2F750f3234-3fa8-4aab-b763-0e37dd82f609&w=1920&q=75"));
        sendPhoto.setCaption("Ixtiyoriy birini tanlang");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<InlineKeyboardButton> row = new ArrayList<>();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();

        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("Big");
        button.setCallbackData("bigId");
        row.add(button);
        rowlist.add(row);

        InlineKeyboardButton button1 = new InlineKeyboardButton();
        button1.setText("Standart");
        button1.setCallbackData("standartId");
        row.add(button1);

        InlineKeyboardButton button2 = new InlineKeyboardButton();
        button2.setText("Mini");
        button2.setCallbackData("miniId");
        row.add(button2);

        inlineKeyboardMarkup.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return sendPhoto;
    }

    public SendPhoto aboutUs(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://maxway.uz/_next/image?url=%2Fimages%2Fabout.png&w=1920&q=75"));
        sendPhoto.setCaption("""
                <b>Max Way</b>
                <b>Aloqa markazi</b> "+998712005400"
                <a href = "https://maxway.uz/about"> Biz haqimizda</a>
                """);
        sendPhoto.setParseMode(ParseMode.HTML);
        return sendPhoto;
    }

    int i=1;

    public SendPhoto sendPhotoLavashozi(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://images.app.goo.gl/sfBxQkvZzEMHxXC4A"));
        sendPhoto.setCaption("Ixtiyoriy birini tanlang");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<InlineKeyboardButton> row = new ArrayList<>();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();

        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("-");
        button.setCallbackData("minusId");
        row.add(button);
        rowlist.add(row);


        button= new InlineKeyboardButton();
        button.setText(String.valueOf(i));
        button.setCallbackData("sonId");
        row.add(button);

        button= new InlineKeyboardButton();
        button.setText("+");
        button.setCallbackData("plusId");
        row.add(button);

        inlineKeyboardMarkup.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);

        return sendPhoto;
    }

    public InlineKeyboardMarkup sendPhotoLavashoziPlus(Long chatId) {

        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://images.app.goo.gl/sfBxQkvZzEMHxXC4A"));
        sendPhoto.setCaption("Ixtiyoriy birini tanlang");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<InlineKeyboardButton> row = new ArrayList<>();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();

        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("-");
        button.setCallbackData("minusId");
        row.add(button);
        rowlist.add(row);


        button= new InlineKeyboardButton();
        button.setText(String.valueOf(++i));
        button.setCallbackData("sonId");
        row.add(button);

        button= new InlineKeyboardButton();
        button.setText("+");
        button.setCallbackData("plusId");
        row.add(button);

        inlineKeyboardMarkup.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);

        return inlineKeyboardMarkup;
    }

    public InlineKeyboardMarkup sendPhotoLavashoziMinus(Long chatId) {

        if (i>1){
            --i;
        }
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://images.app.goo.gl/sfBxQkvZzEMHxXC4A"));
        sendPhoto.setCaption("Ixtiyoriy birini tanlang");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<InlineKeyboardButton> row = new ArrayList<>();
        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();

        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("-");
        button.setCallbackData("minusId");
        row.add(button);
        rowlist.add(row);


        button= new InlineKeyboardButton();
        button.setText(String.valueOf(i));
        button.setCallbackData("sonId");
        row.add(button);

        button= new InlineKeyboardButton();
        button.setText("+");
        button.setCallbackData("plusId");
        row.add(button);

        inlineKeyboardMarkup.setKeyboard(rowlist);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);

        return inlineKeyboardMarkup;
    }
    public SendPhoto sendPhoto(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://images.app.goo.gl/sxEWPiKGUMZYhQq6A"));
        return sendPhoto;
    }




}
