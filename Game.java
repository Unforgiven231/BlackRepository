public class Game {
    static public String[][] player1 = new String[10][10];
    static public String[][] player2 = new String[10][10];

    public static void startGame() {



        /* корабли игрока 1 */
        System.out.println("Player 1");
        OneDecked opl1 = new OneDecked();
        OneDecked opl2 = new OneDecked();
        OneDecked opl3 = new OneDecked();
        OneDecked opl4 = new OneDecked();

        opl1.inputCoordinates();
        opl1.toMarkCoordinates(player1, player2);
        opl2.inputCoordinates();
        opl2.toMarkCoordinates(player1, player2);
        opl3.inputCoordinates();
        opl3.toMarkCoordinates(player1, player2);
        opl4.inputCoordinates();
        opl4.toMarkCoordinates(player1, player2);

        System.out.println("Player 2");
        OneDecked opl5 = new OneDecked();
        OneDecked opl6 = new OneDecked();
        OneDecked opl7 = new OneDecked();
        OneDecked opl8 = new OneDecked();

        opl5.inputCoordinates();
        opl5.toMarkCoordinates(player2, player1);
        opl6.inputCoordinates();
        opl6.toMarkCoordinates(player2, player1);
        opl7.inputCoordinates();
        opl7.toMarkCoordinates(player2, player1);
        opl8.inputCoordinates();
        opl8.toMarkCoordinates(player2, player1);

    }
}
