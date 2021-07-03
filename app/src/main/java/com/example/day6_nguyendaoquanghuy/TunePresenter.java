package com.example.day6_nguyendaoquanghuy;

public interface TunePresenter {

    interface View{
        void showFromFile();
        void showFromDefaults();
    }

    interface Presenter{
        void clickFromFile();
        void clickFromDefaults();
    }
}
