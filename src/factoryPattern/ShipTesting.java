package factoryPattern;

import java.util.Scanner;


/**
 * Created by sergeikostin on 7/28/16.
 */
public class ShipTesting {

    public static void main(String[] args) {

        EnemyShipFactory shipFactory = new EnemyShipFactory();

        EnemyShip theEnemy = null;

        Scanner input = new Scanner(System.in);
        String enemyShipOption = "";
        System.out.println("What type of ship? (U / R / B)");

        if(input.hasNextLine()){
            enemyShipOption = input.nextLine();
        }

        theEnemy = shipFactory.makeEnemyShip(enemyShipOption);

        doStuffEnemy(theEnemy);


    }

    public static void doStuffEnemy(EnemyShip anEnemyShip){
        anEnemyShip.display();
        anEnemyShip.followHeroShip();
        anEnemyShip.enemyShipShoots();
    }
}
