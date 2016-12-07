package roadgraph;

import geography.GeographicPoint;

public class MapEdge {
    private GeographicPoint from;
    private GeographicPoint to;
    private String roadName;
    private String roadType;
    private double length;

    public MapEdge(GeographicPoint from, GeographicPoint to,
                   java.lang.String roadName, java.lang.String roadType, double length) {
        this.from = from;
        this.to = to;
        this.roadName = roadName;
        this.roadType = roadType;
        this.length = length;
    }

    public GeographicPoint getFrom() {
        return from;
    }

    public GeographicPoint getTo() {
        return to;
    }

    public String getRoadName() {
        return roadName;
    }

    public String getRoadType() {
        return roadType;
    }

    public double getLength() {
        return length;
    }
}
