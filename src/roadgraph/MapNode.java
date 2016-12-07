package roadgraph;

import geography.GeographicPoint;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class MapNode {
    private GeographicPoint location;
    private HashSet<MapEdge> edges;

    public MapNode(GeographicPoint location) {
        this.location = location;
        this.edges = new HashSet<MapEdge>();
    }

    public void addEdge(GeographicPoint from, GeographicPoint to,
                        String roadName, String roadType, double length) {
        edges.add(new MapEdge(from, to, roadName, roadType, length));
    }

    public List<GeographicPoint> getNeighbors() {
        List<GeographicPoint> neighbors = new ArrayList<GeographicPoint>();

        for (MapEdge e: edges) {
            neighbors.add(e.getTo());
        }

        return neighbors;
    }

    public GeographicPoint getLocation() {
        return location;
    }
}
