public class SimpleDotComTestDrive {
    public static void main(String[] args) {
        simpleDotCom dot = new simpleDotCom();

        int[] locations = {2, 2, 2};
        dot.setLocationCells(locations);
        String userGuess = "2";
        String result = dot.checkYourSelf(userGuess);

        String testResult = "failed";
        if (result.equals("hit")) {
            testResult = "passed";
        }
        System.out.println(testResult);

    }
}
