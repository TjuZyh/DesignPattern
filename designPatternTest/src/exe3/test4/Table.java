package exe3.test4;

/**
 * @Author zyh
 * @Date 2022/4/28 10:42 下午
 * @Version 1.0
 */
//Component
public class Table {
    private int row;
    private int col;
    private String des;

    public Table() {
    }

    public Table(int row, int col) {
        this.row = row;
        this.col = col;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    @Override
    public String toString() {
        System.out.println();
        for(int i = 0 ; i < row ; i++){
            for(int j = 0 ; j < col ; j++){
                System.out.print( "& " );
            }
            System.out.println();
        }
        return " ";
    }
}
