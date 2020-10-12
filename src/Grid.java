public class Grid extends Cell {

    int width;
    int height;

    @Override
    public String getLife(boolean Rules) {
        return super.getLife(Rules);

    }

    boolean[] grid = new boolean[36];
    public Grid(String color, boolean[] grid) {
        super(color);
        this.grid = grid;

        for (int i=0; i < grid.length; i++) {
            grid([i]=(Math.random());
            if (Math.random() < 0.5){
                grid[i] = true;
            }

        }

    }

}
