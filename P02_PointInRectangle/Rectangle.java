package P02_PointInRectangle;

public class Rectangle {

    //полета -> характеристики
    private Point bottomLeftPoint;
    private Point topRightPoint;

    //конструктор -> създаваме обект от класа / различни правоъгълници

    public Rectangle(Point bottomLeftPoint, Point topRightPoint) {
        this.bottomLeftPoint = bottomLeftPoint;
        this.topRightPoint = topRightPoint;
    }

    //методи -> действие, които ще може да извършва всеки един правоъгълник
    public boolean contains(Point point){
        return point.getX() >= bottomLeftPoint.getX() && point.getX() <= topRightPoint.getX()
                && point.getY() >= bottomLeftPoint.getY() && point.getY() <= topRightPoint.getY();


    }
}
