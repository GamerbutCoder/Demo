package com;

public class Rectangle {
    private int height,width;
    private Point origin;
    public Rectangle(int h,int w,int x,int y){
        this.height =h;
        this.width = w;
        origin = new Point(x,y);
    }
    public double getDiagonalLength(){
        return Math.sqrt(height*height + width*width);
    }
}
