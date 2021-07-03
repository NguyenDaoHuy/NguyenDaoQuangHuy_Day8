package com.example.day6_nguyendaoquanghuy;

public class MainPresenter implements MainMVP.Presenter {

    MainMVP.View view;

    public MainPresenter(MainMVP.View view) {
        this.view = view;
    }

    @Override
    public void clickButtonMain() {
        view.showMain();
    }

    @Override
    public void clickEditTextEditTag() {
        view.showEditTag();
    }

    @Override
    public void clickEditTextEditWeek() {
        view.showEditWeek();
    }
}
