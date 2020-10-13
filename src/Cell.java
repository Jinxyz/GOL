import sun.font.TrueTypeFont;

public class Cell {

    private boolean Life;

    public Cell(boolean life) {
        Life = life;
    }

    public boolean isLife() {
        return Life;
    }

    public void setLife(boolean life) {
        Life = life;
    }
}
