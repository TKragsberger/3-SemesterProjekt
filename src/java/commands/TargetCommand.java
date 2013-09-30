package commands;

import javax.servlet.http.HttpServletRequest;
import model.Command;

public class TargetCommand implements Command {
    private String target;

    public TargetCommand(String target) {
        this.target = target;
    }

    @Override
    public String execute(HttpServletRequest request) {
        return target;
    }
}
