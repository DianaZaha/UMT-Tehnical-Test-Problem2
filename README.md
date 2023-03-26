# UMT-Tehnical-Test-Problem2

# Problem
Given some points in cartesian coordinate, (X, Y) find the number of rectangles that can be created
by those points.

Take into consideration only the rectangles that are parallel with the X, Y axes.

Sample input:
(1,1), (1,3), (2,1), (2,3), (3,1), (3,3)
Sample output: 3

If we modify the sample and remove the (2,3) the output will be: 1
Sample input 2:
(1,1), (1,3), (2,1), (3,1), (3,3)
Sample output 2: 1

# Solution
I used a Point class to represent the input points, and a RectanglesCounter class to store the points and count the rectangles. 

The RectanglesCounter class uses an ArrayList to store the points, and has methods to add and remove points, check if a point is contained in the list, 
and count the rectangles that can be formed from the given points.

The algorithm checks if a pair of points form a line parallel to the x or y-axis by checking if their coordinates match in one dimension.

If they do, the pair is discarded. If the pair has different coordinates in both dimensions, it is a candidate for forming a diagonal of a rectangle. 

To verify that the line is really the diagonal of a rectangle, we create the other two points of the rectangle by combining the coordinates of the original pair. 

Once these new points are formed, we verify that both of them belong to the list of given points. 

If they do, then the line is indeed the diagonal of a rectangle.

The current implementation counts every rectangle twice because each rectangle has two diagonals. 

Therefore, for each rectangle that is counted, there is another identical rectangle that is also counted. 

To account for this, we need to divide the final count of rectangles by 2. 


# Notes 
The algorithm used in countRectangles() has a time complexity of O(n^2), as it needs to compare each pair of points, requiring nested loops. 

Although this algorithm may quickly become inefficient for very large sets of data, it is still easy to understand and explain.


# Assumptions
The user adds only valid points, with only 2 coordinates.

