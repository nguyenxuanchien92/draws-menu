package models;

public class Draw {

    private int line;

    public Draw(int line) {
        this.line = line;
    }

    public void drawTriangle(Draw draw) {
        for (int i = draw.line; i > 0 ; i--) {
            System.out.println("*");
        }
    }
}
//chưa hoàn thành việc vẽ hình

