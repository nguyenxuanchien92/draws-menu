import models.Draw;

public class Main {
    public static void main(String[] args) {
        Draw draw = new Draw(6);
        draw.drawTriangle(draw);
    }
}
