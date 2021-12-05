package cp510.cp150;

import cp510.d_list.DList;
import cp510.d_list.DNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DListSimpleTest
{
    @Test
    public void addTailTest()
    {
        // Create an empty list. Verify that list.flink and list.blink -> list
        DList list    = new DList();
        assertEquals( list, list.getNext() );
        assertEquals( list, list.getPrevious() );
        assertEquals( list, list.getHead() );
        assertEquals( list, list.getTail() );
        assertEquals( 0, list.size() );
        assertTrue( list.isEmpty() );

        // The first node added to the list will be both head and tail
        /*
         *        List root       head/tail
         *              +---+      +---+
         *              |   |--->  |   |---> to root
         *              +---+      +---+
         * to head <--- |   |  <---|   |
         *              +---+      +---+
         */
        DNode   head    = new DNode( 0 );
        list.addTail( head );
        assertEquals( list, head.getNext() );
        assertEquals( list, head.getPrevious() );
        assertEquals( head, list.getNext() );
        assertEquals( head, list.getPrevious() );
        assertEquals( head, list.getHead() );
        assertEquals( head, list.getTail() );
        assertEquals( 1, list.size() );
        assertFalse( list.isEmpty() );


        // Slowly build list, performing validations with each add
        for ( int inx = 1 ; inx <= 10 ; ++inx )
        {
            DNode   node    = new DNode( inx );
            list.addTail( node );

            int     expSize = inx + 1;

            assertNotEquals( list, head.getNext() );
            assertNotEquals( list, node.getPrevious() );
            assertEquals( list, head.getPrevious() );
            assertEquals( list, node.getNext() );
            assertEquals( head, list.getHead() );
            assertEquals( node, list.getTail() );
            assertEquals( head, list.getNext() );
            assertEquals( node, list.getPrevious() );
            assertEquals( expSize, list.size() );
            assertFalse( list.isEmpty() );
        }

        DNode node    = list.getHead();
        while ( node != list )
        {
            System.out.println( node.getData() );
            node = node.getNext();
        }
    }
}