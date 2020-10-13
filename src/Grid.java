public class Grid extends Cell {

    int width;
    int height;
    int grid;
    private boolean Rules;
    private boolean cells[];

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public Grid(int width, int height) {
        this.width = width;
        this.height = height;

        grid = width * height;

    }

    public int getGrid() {
        return grid;
    }

    public Grid(boolean life, boolean rules) {
        super(life);
        Rules = rules;

    }

    public boolean getLife(boolean cells) {
        if (Rules = false) {
            for (int i = 0; i < grid.getwidth; i++) {
                cells[i] = false;
            }
        } else {
            for (int i = 0; i < 500; i++) {
                cells[i] = true;
            }
        }
        this.cells[] = cells[];
        return cells;
    }

    public void Populate() {

        for (int i = 0; i < width*height; i++) {
            cells[i] = new Cell(Math.random());
        }
    }

    public boolean isRules() {
        return Rules;
    }

    public boolean[] getCells() {
        return cells;
    }

}
