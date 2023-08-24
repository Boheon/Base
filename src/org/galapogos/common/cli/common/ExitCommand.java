package org.galapogos.common.cli.common;


import org.galapogos.common.cli.Input;
import org.galapogos.common.cli.ui.Application;

public class ExitCommand implements Command {

    private Application app;

    public ExitCommand(Application app) {
        this.app = app;
    }

    @Override
    public void execute() {
        boolean answer = Input.confirm("종료하시겠습니까?");
        if(answer) {

            app.cleanup();
            System.out.println("종료합니다.");
            System.exit(0);
        }
    }
}
