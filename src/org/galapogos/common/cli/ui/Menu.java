package org.galapogos.common.cli.ui;



import org.galapogos.common.cli.Input;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    List<MenuItem> menuItemList;

    public Menu() {
        this.menuItemList = new ArrayList<MenuItem>();
    }

    //menuItem 추가
    public void add(MenuItem item) {
        this.menuItemList.add(item);
    }

    public void print() {
        for (int i = 0; i < menuItemList.size(); i++) {
            System.out.print((i + 1) + "]" + menuItemList.get(i).getTitle() + " ");
        }
        System.out.println();
    }


    public MenuItem select(){
        int i = Input.readInt("선택 > ") - 1;

        if(i < menuItemList.size()){
            return menuItemList.get(i);
        }
        return null;
    }
}
