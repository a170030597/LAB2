import java.util.*;
import java.io.*;
class rectangle
{
 public int length; 
public int breadth;
 public int area(int l,int b)
{ 
this.length=l;
 this.breadth=b ;
return 2*(l+b);
}
}
class circle extends rectangle 
{ 
public double radius;
public double area(double r)
{
 this.radius=r;
return (3.14)*r*r;
}
}
class AreaLab
{
public static void main(String args[])
{
 rectangle r = new rectangle(); 
circle c = new circle(); 
System.out.println(r.area(2,3)); 
System.out.println(c.area(5)) ;
}
}
