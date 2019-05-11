import java.util.ArrayList;

public class DotCom {
        private ArrayList<String> locationCells;
        private String name;
//        int numOfHits=0;

        String checkYourSelf(String userInput) {
            String result = "miss";
            int index = locationCells.indexOf(userInput);
            if (index >= 0) {
                locationCells.remove(index);
                if (locationCells.isEmpty()) {
                    result = "kill";
                } else {
                    result = "hit";
                }
            }
            System.out.println(result);
            return  result;
        }

        void setLocationCells(ArrayList<String> p) {
            locationCells = p;
        }

    public void setName(String n) {
            name=n;
    }
}
