package bodergame;

public class Bord {

    private int rows;
    private int columns;
    private Piece[][] pieces;

    public Bord(int rows, int columnms){
        this.setRows(rows);
        this.setColumns(getColumns());
        pieces = new Piece[rows][columnms];
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getColumns() {
        return columns;
    }

    public void setColumns(int columns) {
        this.columns = columns;
    }
}
