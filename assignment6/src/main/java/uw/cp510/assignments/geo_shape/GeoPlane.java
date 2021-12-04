package uw.cp510.assignments.geo_shape;

import cp510.d_list.DList;
import cp510.d_list.DNode;

/**
 * This is a simple class that contains an instance variable of type DList. The DList will maintain
 * a collection of DNodes; the data stored in a DNode will always be type GeoShape. It has the
 * following methods:
 *
 * @author Jesse Ruth
 */
public class GeoPlane {
    /**
     * List of nodes.
     */
    private DList dNodes = new DList();

    /**
     * Create a new GeoPlane object.
     */
    public GeoPlane() {
    }

    /**
     * Number of shapes in plane.
     * @return count
     */
    public int getSize() {
        return dNodes.size();
    }

    /**
     * Redraw the list.
     */
    public void redraw() {
        DNode temp;
        temp = dNodes.getHead();
        while (temp != dNodes) {
            GeoShape shape = (GeoShape) temp.getData();
            shape.draw(null);
            temp = temp.getNext();
        }
    }

    /**
     * Add a shape to the list.
     *
     * @param shape GeoShape
     */
    public void addShape(GeoShape shape) {
        dNodes.addTail(new DNode(shape));
    }

    /**
     * Remove specific shape from list.
     *
     * @param shape GeoShape
     * @return boolean
     */
    public boolean removeShape(GeoShape shape) {
        DNode temp;
        temp = dNodes.getHead();
        while (temp != dNodes) {
            GeoShape thisShape = (GeoShape) temp.getData();
            if (thisShape.equals(shape)) {
                temp.remove();
                return true;
            }
            temp = temp.getNext();
        }
        return false;
    }
}
