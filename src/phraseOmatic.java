public class phraseOmatic {
    public static void main(String[] args){
        String[] wordListOne={"24/7","multiTier","30,000 foot","B-to-B","win-win","frontend",
                "web-based","pervasive","smart","sixsigma","critical-path","dynamic"};

        String[] wordListTwo={"empowered","sticky","value-added","oriented","centric","distributed",
                "clustered","branded","outside-the-box","positioned","networked","focused","leveraged",
                "aligned","targeted","shared","cooperative","accelerated"};

        String[] wordListThree = {"process", "tipping-point", "solution", "architecture", "core competency",
                    "strategy","mindshare","portal","space","vision","paradigm","mission"};

        int oneLength = wordListOne.length;
        int twolength = wordListTwo.length;
        int threelength = wordListThree.length;

        int rand1 = (int) (Math.random()*oneLength);
        int rand2 = (int) (Math.random() * twolength);
        int rand3 = (int) (Math.random() * threelength);
        String phare = wordListOne[rand1] + " " + wordListTwo[rand2] + " "+wordListThree[rand3];

        System.out.println("What we need is a " + phare);
    }
}
