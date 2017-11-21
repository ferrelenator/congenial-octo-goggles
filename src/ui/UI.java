package ui;

import data.Shape;
import java.util.ArrayList;

public interface UI {
    public void printShapeAreaPerimeter(Shape shape);
    public void Menu();
    public int figures(ArrayList<Shape> figure);
    public int newfigure();
    public int deletefigure(ArrayList<Shape> figure);
    public double newCircle();
    public double newEquilateral();
    public double []newIsoceles();
    public double []newScaleno();
    public double newSquare();
    public double []newRecatangle();
    public double []newTrapezoid();
    public void errorMsg();
}
