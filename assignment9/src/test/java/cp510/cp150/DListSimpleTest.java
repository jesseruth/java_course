package cp510.cp150;

import cp510.d_list.DList;
import cp510.d_list.DNode;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

public class DListSimpleTest
{
    @Test
    public void testTail()
    {
        DList   list    = new DList();
        assertTrue( list.isEmpty() );
        assertEquals( list, list.getNext() );
        assertEquals( list, list.getPrevious() );

        int limit   = 10;
        for ( int inx = 0 ; inx < limit ; ++inx )
        {
            DNode   node    = new DNode( new Integer( inx ) );
            assertFalse( node.isEnqueued() );
            list.addTail( node );
            assertFalse( list.isEmpty() );
            assertTrue( node.isEnqueued() );
            assertEquals( node, list.getTail() );
            assertEquals( inx + 1, list.size() );
        }

        for ( int inx = limit - 1 ; inx >= 0 ; --inx )
        {
            DNode   node    = list.removeTail();
            assertFalse( node.isEnqueued() );
            assertEquals( inx, node.getData() );
        }

        assertTrue( list.isEmpty() );
    }

    @Test
    public void buildRandom1()
    {
        Random randy       = new Random( 0 );
        List<DNode> nodeList    = new ArrayList<>();
        DList       list        = new DList();

        assertTrue( list.isEmpty() );
        validateList( list, nodeList );

        DNode    first   = new DNode( "Node 0" );

        list.addAfter( first );
        try {
            list.addAfter( first );
            fail();
        } catch (IllegalArgumentException e) {
        }
    }

    private void validateList( DList list, List<DNode> nodes )
    {
        DNode    node    = list.getHead();
        int     size    = nodes.size();
        assertEquals( size, list.size() );
//        System.out.println( size + ", " + list.size() );

        for ( int inx = 0 ; inx < size ; ++inx )
        {
            DNode    temp    = nodes.get( inx );
            assertTrue( temp == node );
            node = node.getNext();
        }
        assertTrue( node == list );
    }

    @Test
    public void checkGetSetData()
    {
        DNode    node    = new DNode();
        assertNull( node.getData() );

        String  test0   = "Test 0";
        node = new DNode( test0 );
        assertEquals( test0, node.getData() );

        String  test1   = "String 1";
        node.setData( test1 );
        assertEquals( test1, node.getData() );

        String  test2   = "String 2";
        node.setData( test2 );
        assertEquals( test2, node.getData() );

        node.setData( null );
        assertNull( node.getData() );

    }

    @Test
    public void testHead()
    {
        DList   list    = new DList();
        assertTrue( list.isEmpty() );
        assertEquals( list, list.getNext() );
        assertEquals( list, list.getPrevious() );

        int limit   = 10;
        for ( int inx = 0 ; inx < limit ; ++inx )
        {
            DNode   node    = new DNode( new Integer( inx ) );
            assertFalse( node.isEnqueued() );
            list.addHead( node );
            assertFalse( list.isEmpty() );
            assertTrue( node.isEnqueued() );
            assertEquals( node, list.getHead() );
            assertEquals( inx + 1, list.size() );
        }

        for ( int inx = limit - 1 ; inx >= 0 ; --inx )
        {
            DNode   node    = list.removeHead();
            assertFalse( node.isEnqueued() );
            assertEquals( inx, node.getData() );
        }

        assertTrue( list.isEmpty() );
    }


    @Test
    public void testRemoveAll()
    {
        DList   list    = new DList();

        int limit   = 10;
        for ( int inx = 0 ; inx < limit ; ++inx )
        {
            for ( int jnx = 0 ; jnx < inx ; ++jnx )
                list.addTail( new DNode( null ) );
            assertEquals( inx, list.size() );
            list.removeAll();
            assertEquals( 0, list.size() );
            assertTrue( list.isEmpty() );
        }
    }

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