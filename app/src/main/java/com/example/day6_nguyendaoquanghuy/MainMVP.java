package com.example.day6_nguyendaoquanghuy;

public interface MainMVP {

        interface View{
            void showMain();
            void showEditTag();
            void showEditWeek();
        }

        interface Presenter{
            void clickButtonMain();
            void clickEditTextEditTag();
            void clickEditTextEditWeek();
        }

}
