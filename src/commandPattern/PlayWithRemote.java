package commandPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sergeikostin on 7/21/16.
 */
public class PlayWithRemote {

    public static void main(String[] args) {
        ElectronicDevice device = TvRemote.getDevice();

        TurnTvOn onCommand = new TurnTvOn(device);
        DeviceButton onPress = new DeviceButton(onCommand);
        onPress.press();

        TurnTvOff offCommand = new TurnTvOff(device);
        onPress.command = offCommand;
        onPress.press();

        TurnTvUp volumeUpCommand = new TurnTvUp(device);
        onPress = new DeviceButton(volumeUpCommand);
        onPress.press();
        onPress.press();
        onPress.press();

        //--------

        Television tv = new Television();
        Radio radio   = new Radio();
        List<ElectronicDevice> allDevices = new ArrayList<>();
        allDevices.add(tv);
        allDevices.add(radio);

        TurnItAllOff turnlOffDevices = new TurnItAllOff(allDevices);
        DeviceButton turnThemOff = new DeviceButton(turnlOffDevices);
        turnThemOff.press();

        //---------------------

        turnThemOff.pressUndo();


    }
}
