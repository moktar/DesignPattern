package com.example.designpattern.behavioralpattern.commandpattern;

public class MenuOptions {

    private ActionListernerCommand openCommand;
    private ActionListernerCommand saveCommand;

    public MenuOptions(ActionListernerCommand openCommand, ActionListernerCommand saveCommand) {
        this.openCommand = openCommand;
        this.saveCommand = saveCommand;
    }

    public void clickOpen() {
        openCommand.execute();
    }

    public void clickSave() {
        saveCommand.execute();
    }
}
