// 1)
// i = 7, j = 3


class MainProgram {
    public static void main(String[] args) {
        rollDice(3);
        printRect('$', 3, 4);
        printRectHollow('$', 9, 9);
    }
    //2)
    public static void rollDice(int num) {
        int rand = 0;
        for (int i = 1; i <= num; i++) {
            rand = (int)(6* Math.random()) + 1;
            System.out.println("Roll number " + i + " is " + rand);
        }
    }

    //3
    public static void printRect(char symb, int wid, int hei) {
        for (int height = 1; height <= hei; height++) {
            for (int width = 1; width <= wid; width++) {
                System.out.print(symb);
            }
        }
        System.out.println();
    }

    public static void printRectHollow(char symb, int wid, int hei) {
        for (int height = 1; height <= hei; height++) {
            for (int width = 1; width <= wid; width++) {
                if (height == 1 || height == hei || width == 1 || width == wid)
                System.out.print(symb);
                else
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}