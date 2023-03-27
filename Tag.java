package lz77;

public class Tag {

    public int position;
    public int length;
    public char symbol;

    Tag(int pos, int len, char sym) {
        position = pos;
        length = len;
        symbol = sym;
    };

    public void DisplayTags() {

        System.out.print("< " + position);
        System.out.print(" , " + length);
        System.out.print(" , " + symbol + " > \n");

    }

    /*
     * public tag getTags() {
     * Scanner Obj = new Scanner(System.in);
     * string s;
     * s = Obj.next();
     * position = Obj.nextInt();
     * s = Obj.next();
     * length = Obj.nextInt();
     * s = Obj.next();
     * symbol = Obj.next();
     * s = Obj.next();
     * return this;
     * }
     */
}
