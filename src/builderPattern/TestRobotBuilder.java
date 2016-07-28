package builderPattern;

/**
 * Created by sergeikostin on 7/27/16.
 */
public class TestRobotBuilder {

    public static void main(String[] args) {

        RobotBuilder robotBuilder = new OldRobotBuilder();

        RobotEngineer robotEngineer = new RobotEngineer(robotBuilder);

        robotEngineer.makeRobot();

        Robot robot = robotEngineer.getRobot();

        System.out.println("Robot was built");

        System.out.println("Robot head type: " + robot.getRobotHead());
        System.out.println("Robot torso type: " + robot.getRobotTorso());


    }



}
