package commandPattern;

/**
 * Created by sergeikostin on 7/21/16.
 */
public class DeviceButton {

    Command command;

    public DeviceButton(Command command){
        this.command = command;
    }

    public void press(){
        command.execute();
    }

    public void pressUndo(){
        command.undo();
    }
}
