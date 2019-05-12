public class MonsterTestDrive {
    public static void main(String[] args) {
        monster[] ma = new monster[3];
        ma[0] = new vampire();
        ma[1] = new dragon();
        ma[2] = new monster();
        for (int x = 0; x < 3; x++) {
            ma[x].frighten(x);
        }
    }
}

