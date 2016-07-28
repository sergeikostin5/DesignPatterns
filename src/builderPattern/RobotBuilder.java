package builderPattern;

/**
 * Created by sergeikostin on 7/25/16.
 */
public interface RobotBuilder {

    void buildRobotHead();

    void buildRobotTorso();

    void buildRobotArms();

    void buildRobotLegs();

    Robot getRobot();

}
