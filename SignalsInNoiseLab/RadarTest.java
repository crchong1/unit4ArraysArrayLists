

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Write a description of test class RadarTest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RadarTest
{
    /** description of instance variable x (add comment for each instance variable) */
    private int x;

    /**
     * Default constructor for objects of class RadarTest
     */
    public RadarTest()
    {
        // initialise instance variables
        x = 0;
    }
    
    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        
    }
    
    @Test
    public void test()
    {
        Radar radar = new Radar(100,100,0,0);
        radar.setMonsterLocation(0,0); // hardcodes monster location to zero, zero
        
        for(int i = 0; i < 100; i++)
        {
            radar.scan(); // scan for 100 iterations
        }
        
        int count = 0;
        int x=0;
        int y=0;
        for(int i = 0; i < 100; i++)
        {
            for(int j = 0; j <100; j++)
            {
                if (radar.getAccumulatedDetection(i,j) > count)
                {
                    count = radar.getAccumulatedDetection(i,j); //gets max count
                    y=j;
                    x=i; //update position
                }
            }
        }
        assertEquals(x,0);//test if x position is zero
        assertEquals(y,0);//test is y position is zero
    }
    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

}
