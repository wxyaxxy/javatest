//import java.util.TreeMap;

public class SimpleDotComGame {
    public static void main(String[] args) {
        int numOfGuesses=0;
        GameHelper helper = new GameHelper();
        simpleDotCom theDotCom = new simpleDotCom();
//        int[] p = {2, 3, 4};
//        theDotCom.setLocationCells(p);
        int randomNum = (int) (Math.random() * 5);
        int[] locations = {randomNum, randomNum + 1, randomNum + 2};

        theDotCom.setLocationCells(locations);
        boolean isAlive = true;

        while (isAlive == true) {
            String guess = helper.getUserInput("enter a number");
            String result = theDotCom.checkYourSelf(guess);

            numOfGuesses++;
            if (result.equals("kill")) {
                isAlive = false;
                System.out.println("You took " + numOfGuesses + " guesses");
            }
        }
//        String result = theDotCom.checkYourSelf(String.valueOf(targetNumber));
//        if (result.equals("hit")) {
//
//        }


//        int target = Math().random() * 10 % 4;
    }
}
