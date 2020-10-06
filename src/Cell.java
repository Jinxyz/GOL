import sun.font.TrueTypeFont;

public class Cell {

    private String color;
    private boolean Rules;
    private boolean[] cells;

    }
    public boolean getLife(boolean cells) {

        if (Rules = false) {
            for (int i = 0; i < 500; i++) {
                cells[i] = false;
            }
        } else {
            for (int i = 0; i < 500; i++) {
                cells[i] = true;
            }


            /*
            Kolla på kod

            int[] grid = new int[36];
            for (int i=0; i < 36; i++){
                grid([i]=(Math.random());
        }
             */

        return cells;
    }
    public String getColor() {
        return color;
    }

    public boolean isRules() {
        return Rules;
    }

    public boolean[] getCells() {
        return cells;
    }
}