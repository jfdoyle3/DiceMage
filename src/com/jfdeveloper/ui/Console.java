package com.jfdeveloper.ui;

import com.jfdeveloper.actors.Monster;
import com.jfdeveloper.actors.Wizard;
import com.jfdeveloper.dice.Die;

import java.util.List;

public interface Console {

    void manaDice(List<Die> dice);

    void statusBar(String name, int health, int power, int mana);

    int wizardChoice(int mana);

    void wizardsStatus(List<Wizard> wizards);

     void buyMonster(int mana,int denSize);
}
