package commandPattern;

/**
 * Created by sergeikostin on 7/21/16.
 */
public interface Command {

    void execute();
    void undo();

}
