public class Of76 extends Clowns{
    public static void main(String[] args) {
        Picasso[] i =new Picasso[3];
        i[0]=new acts();
        i[1]=new Clowns();
        i[2]=new Of76();
        for (int x = 0; x < 3; x++) {
            System.out.println(i[x].iMethod() + " " + i[x].getClass());
        }
    }
}


interface Nose {
    public abstract int iMethod();
}

abstract class Picasso implements Nose {
    public int iMethod() {
        return 7;
    }
}

class Clowns extends Picasso{

}

class acts extends Picasso{
    public int iMethod() {
        return 5;
    }
}