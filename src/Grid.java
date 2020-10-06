public class Grid extends Cell {

    private boolean[] cells;

    @Override
    public String getLife(boolean Rules) {
        return super.getLife(Rules);
    }

    public Grid(String color, boolean[] cells) {
        super(color);
        this.cells = cells;
    }

    public Grid(boolean[] cells) {
        this.cells = cells;
    }
}
