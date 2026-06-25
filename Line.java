package com.oops.linecomparison;

public class Line {

    private Point startPoint;
    private Point endPoint;

    public Line(Point startPoint, Point endPoint) {
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }

    public Double calculateLength() {
        return Math.sqrt(
                Math.pow(endPoint.x - startPoint.x, 2) +
                        Math.pow(endPoint.y - startPoint.y, 2)
        );
    }

    public boolean equals(Line otherLine) {
        return this.calculateLength().equals(otherLine.calculateLength());
    }

    public int compareTo(Line otherLine) {
        return this.calculateLength().compareTo(otherLine.calculateLength());
    }
}