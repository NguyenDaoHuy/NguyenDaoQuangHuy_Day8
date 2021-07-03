package com.example.day6_nguyendaoquanghuy;

public class PresenterTune implements TunePresenter.Presenter{

    TunePresenter.View view;

    public PresenterTune(TunePresenter.View view) {
        this.view = view;
    }

    @Override
    public void clickFromFile() {
        view.showFromFile();
    }

    @Override
    public void clickFromDefaults() {
        view.showFromDefaults();
    }
}
