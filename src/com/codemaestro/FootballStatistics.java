package com.codemaestro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class Point {
	int x;
	int y;
	
	Point(int x, int y ){
		this.x=x;
		this.y=y;
	}
	
	int getX(){
		return x ;
	}
	
	int getY(){
		return y ;
	}
}
public class FootballStatistics {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int noPoints=in.nextInt();
		
		Point[] arrayPoint= new Point[noPoints];
		
		List<Point> convexPoint ;
		
		for(int i=0;i<noPoints;i++){
			int x=in.nextInt();
			int y= in.nextInt();
			arrayPoint[i]= new Point(x, y);
		}
		
		convexPoint=convexHull(arrayPoint,noPoints);
		long maxDis= maximumDistance(convexPoint);
		System.out.println(maxDis);
	}
	
	private static long maximumDistance(List<Point> convexPoint) {
		long result=0;
		
		for(int i= 0; i<convexPoint.size();i++){
			for(int j=i+1;j<convexPoint.size();j++){
				long distance = distance(convexPoint.get(i),convexPoint.get(j));
					if(distance>result)
						result = distance;
				
			}
		}
		
		return result;
	}

	private static long distance(Point point1, Point point2) {
		return (long)Math.pow(Math.abs(point1.getX()-point2.getX()), 2) + (long)Math.pow(Math.abs(point1.getY()-point2.getY()), 2);
	}

	static int orientation(Point p, Point q, Point r)
	{
	    int val = (q.y - p.y) * (r.x - q.x) -
	              (q.x - p.x) * (r.y - q.y);
	 
	    if (val == 0) return 0;  // colinear
	    return (val > 0)? 1: 2; // clock or counterclock wise
	}
	
	 static List<Point> convexHull(Point points[], int n)
	{
	    // There must be at least 3 points
	    if (n < 3)
	    	return Arrays.asList(points);
	 
	    // Initialize Result
	    List<Point> result= new ArrayList<Point>();
	   
	    // Find the leftmost point
	    int l = 0;
	    for (int i = 1; i < n; i++)
	        if (points[i].x < points[l].x)
	            l = i;
	 
	    // Start from leftmost point, keep moving counterclockwise
	    // until reach the start point again
	    int p = l, q;
	    do
	    {
	        // Search for a point 'q' such that orientation(p, i, q) is
	        // counterclockwise for all points 'i'
	        q = (p+1)%n;
	        for (int i = 0; i < n; i++)
	          if (orientation(points[p], points[i], points[q]) == 2)
	             q = i;
	 
	        result.add(points[q]) ; // Add q to result as a next point of p
	        p = q; // Set p as q for next iteration
	    } while (p != l);
	 
	    return  result;
	}
}
