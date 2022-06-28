import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TwoDecked implements ShipsLogic{
    public int shipLength = 2; /* <================================================Длина корабля*/
    public static int getShipsRemains() {
        return shipsRemains;
    }

    public static void setShipsRemains(int shipsRemains) {
        TwoDecked.shipsRemains = shipsRemains;
    }

    private static int shipsRemains = 0;
    public int[] arrayOfCor = new int[4];


    public void inputCoordinates() {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {

            System.out.println("Enter the coordinates of " + (shipsRemains + 1)  + " one-decked ship");
            int x = Integer.parseInt(reader.readLine());
            int y = Integer.parseInt(reader.readLine());
            int x1 = Integer.parseInt(reader.readLine());
            int y1 = Integer.parseInt(reader.readLine());

            if(x == 0 || x == 9 || y == 0 || y == 9) {
                if(Game.player1[x][y] == null){
                    arrayOfCor[0] = x;
                    arrayOfCor[1] = y;

                    shipsRemains++;
                }
                else{
                    System.out.println("Unreachable value, try again");
                    this.inputCoordinates();
                }
            }
            else if (x >= 10 || y >= 10 || x < 0 || y < 0 || x1 >= 10 || y1 >= 10 || x1 < 0 || y1 < 0 || Game.player1[x - 1][y - 1] != null
                    || Game.player1[x + 1][y + 1] != null
                    ||  Game.player1[x - 1][y] != null  ||  Game.player1[x][y - 1] != null ||  Game.player1[x + 1][y] != null
                    ||  Game.player1[x][y + 1] != null ||  Game.player1[x][y] != null ){
                System.out.println("Unreachable value, try again");
                this.inputCoordinates();


            } else {

                arrayOfCor[0] = x;
                arrayOfCor[1] = y;
                arrayOfCor[2] = x1;
                arrayOfCor[3] = y1;

                shipsRemains++;
            }

        } catch (IOException io) {
        }
    }

    public void toMarkCoordinates(String[][] player1, String[][] player2) {
        for (int i = 0; i <= player1.length - 1; i++) {
            for (int j = 0; j <= player1.length - 1; j++) {

                for (int k = 0; k < this.arrayOfCor.length; k++) {
                    if (this.arrayOfCor[0] == i && this.arrayOfCor[1] == j) {
                        player1[i][j] = "|==|";
                        player2[i][j] = "|<>|";

                    }
                }
            }
        }


    }
}
