public class Cell {

    private String color;
    private boolean Rules;

    public String getLife(boolean Rules) {

        if (Rules = false) {
            color = "white";
        }
        else {
            color = "black";
        }
        return color;
    }

    public Cell(String color) {
        this.color = color;
    }

    public boolean isRules() {
        return Rules;
    }
    
}
