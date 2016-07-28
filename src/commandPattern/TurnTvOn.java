package commandPattern;

/**
 * Created by sergeikostin on 7/21/16.
 */
public class TurnTvOn implements Command{

    ElectronicDevice theDevice;

    public TurnTvOn(ElectronicDevice newDevice){
        theDevice = newDevice;
    }

    @Override
    public void execute() {

        theDevice.on();

    }

    @Override
    public void undo() {
        theDevice.off();
    }
}
