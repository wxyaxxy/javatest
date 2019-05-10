public class simpleDotCom {
    int locationCells[];
    int numOfHits=0;

    String checkYourSelf(String stringGuess) {
        int guess = Integer.parseInt(stringGuess);
        String result = "miss";

        for (int cell : locationCells) {
            if (guess == cell) {
                result = "hit";
                numOfHits++;
                break;
            }
        }
        if (numOfHits == locationCells.length) {
            result = "kill";
        }

        System.out.println(result);
        return  result;
    }

    void setLocationCells(int[] p) {
        locationCells = p;
    }
}
