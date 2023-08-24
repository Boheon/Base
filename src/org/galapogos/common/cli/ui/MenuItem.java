package org.galapogos.common.cli.ui;


import org.galapogos.common.cli.common.Command;

public class MenuItem {
    private String title;//메뉴 제목
    private Command cmd;//해당 메뉴를 실행할 명령

    public MenuItem(String title, Command cmd) {
        super();
        this.title = title;
        this.cmd = cmd;
    }

    public String getTitle() {
        return title;
    }

    public void execute(){
        if(cmd != null){
            cmd.execute();
        }
    }
}
