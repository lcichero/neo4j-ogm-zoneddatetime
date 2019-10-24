package nz.co.lionel.neo4ogmzoneddatetime.entity;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;

import java.time.ZonedDateTime;

@NodeEntity
public class Point {

    @Id
    @GeneratedValue
    private Long id;
    private double x;
    private double y;
    private ZonedDateTime at;

    public Point() {
    }

    public Point(final double x, final double y, final ZonedDateTime at) {
        this.x = x;
        this.y = y;
        this.at = at;
    }

    public double getX() {
        return x;
    }

    public void setX(final double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(final double y) {
        this.y = y;
    }

    public ZonedDateTime getAt() {
        return at;
    }

    public void setAt(final ZonedDateTime at) {
        this.at = at;
    }
}