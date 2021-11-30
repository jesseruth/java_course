package uw.cp510.assignments.geo_shape;

import cp510.d_list.DList;
import cp510.d_list.DNode;

public class GeoPlane {
    private DList dNodes = new DList();

    public void redraw() {
        DNode temp;
        temp = dNodes.getHead();
        while (temp != dNodes) {
            GeoShape shape = (GeoShape) temp.getData();
            shape.draw(null);
            temp = temp.getNext();
        }
    }

    public void addShape(GeoShape rect) {
        dNodes.addTail(new DNode(rect));
    }

    public boolean removeShape( GeoShape shape ) {
        DNode temp;
        temp = dNodes.getHead();
        while (temp != dNodes) {
            if (temp.getData() != null) {
                System.out.println("huh");
                return true;
            }
            temp = dNodes.getNext();
        }
        return false;
    }
}
