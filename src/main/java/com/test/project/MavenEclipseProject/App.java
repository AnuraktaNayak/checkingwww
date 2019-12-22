package com.test.project.MavenEclipseProject;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException
    {
        System.out.println( "Hello World!" );
        
        long start = System.currentTimeMillis();
        Thread.sleep(200000);
        System.out.println("Sleep time in ms = "+(System.currentTimeMillis()-start));
    }
}
