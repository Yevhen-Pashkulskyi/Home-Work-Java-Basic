package org.example.oop.phone.imp;

import org.example.oop.phone.IOS;
import org.example.oop.phone.Smartphones;

public class IPhones implements IOS, Smartphones {
    @Override
    public String siriAssistant() {
        return "Привет Siri";
    }

    @Override
    public String call() {
        return "Звонок с iPhone";
    }

    @Override
    public String sms() {
        return "Сообщение с iPhone";
    }

    @Override
    public String internet() {
        return "Поиск в интернете с iPhone";
    }
}
