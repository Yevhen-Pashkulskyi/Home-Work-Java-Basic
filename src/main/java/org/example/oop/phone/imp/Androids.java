package org.example.oop.phone.imp;

import org.example.oop.phone.LinuxOs;
import org.example.oop.phone.Smartphones;

public class Androids implements LinuxOs, Smartphones {
    @Override
    public String okGoogle() {
        return "Ok Google";
    }

    @Override
    public String call() {
        return "Звонок с Android телефона";
    }

    @Override
    public String sms() {
        return "Отправляю смс с Android телефона";
    }

    @Override
    public String internet() {
        return "Поиск в интернете с Android телефона";
    }
}
