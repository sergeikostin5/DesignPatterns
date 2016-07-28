package commandPattern;

/**
 * Created by sergeikostin on 7/21/16.
 */
public class TvRemote {

    public static ElectronicDevice getDevice(){
        return new Television();
    }

}
