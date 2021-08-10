package com.jfdeveloper.ui;

import com.jfdeveloper.actors.Wizard;

import java.util.List;

public interface WizardConsole {

    void manaDice(String output);

    void statusBar(String name, int health, int power, int mana);

    int wizardChoice(int mana, int denSize);

    void wizardsStatus(List<Wizard> wizards);

    int buyMonster(int mana, int denSize);
}
