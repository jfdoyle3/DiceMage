package com.jfdeveloper.ui;

import com.jfdeveloper.dice.Die;

import java.util.List;

public interface Console {

    void manaDice(List<Die> dice);

    void statusBar(String name,int health, int power, int mana);
}
