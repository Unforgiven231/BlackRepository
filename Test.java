public class Test {

    public static void checkResult(){
        for (int i = 0; i <= Game.player1.length-1; i++){
            for (int j = 0; j <= Game.player1.length-1; j++){
                System.out.print(Game.player1[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i <= Game.player2.length-1; i++){
            for (int j = 0; j <= Game.player2.length-1; j++){
                System.out.print(Game.player2[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("One decked ships created: " + OneDecked.getShipsRemains());
    }
}

