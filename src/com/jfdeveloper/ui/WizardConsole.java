package com.jfdeveloper.ui;

import com.jfdeveloper.actors.Monster;
import com.jfdeveloper.actors.Wizard;
import com.jfdeveloper.dice.Die;
import com.jfdeveloper.objects.Den;

import java.util.List;

public interface WizardConsole {

    void manaDice(String output);

    void statusBar(String name, int health, int power, int mana, String den);

    int wizardChoice(int mana, int denSize);

    void wizardsStatus(List<Wizard> wizards);

    void buyMonster(int mana,int denSize);
}
