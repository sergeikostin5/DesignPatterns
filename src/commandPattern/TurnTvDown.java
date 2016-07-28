package commandPattern;

/**
 * Created by sergeikostin on 7/21/16.
 */
public class TurnTvDown implements Command{

    ElectronicDevice theDevice;

    public TurnTvDown(ElectronicDevice newDevice){
        theDevice = newDevice;
    }

    @Override
    public void execute() {

        theDevice.volumeDown();

    }

    @Override
    public void undo() {
        theDevice.volumeUp();
    }
}
