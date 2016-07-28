package commandPattern;

/**
 * Created by sergeikostin on 7/21/16.
 */
public class TurnTvOff implements Command{

    ElectronicDevice theDevice;

    public TurnTvOff(ElectronicDevice newDevice){
        theDevice = newDevice;
    }

    @Override
    public void execute() {

        theDevice.off();

    }

    @Override
    public void undo() {
        theDevice.off();
    }
}
