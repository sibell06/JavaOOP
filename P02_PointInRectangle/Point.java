package P02_PointInRectangle;

//описвам как ще ми изглежда точката и какви функции ще изпълнява
public class Point {

    //полета -> характеристики
    private int x;
    private int y;

    //конструктор -> създаваме обекети от класа/отделни точки

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }
}
