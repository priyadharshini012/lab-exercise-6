/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkgabstract;

import java.util.Scanner;



/**
 *
 * @author priyadharshini
 */
public class perimeter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        peri obj=new peri();
        obj.getradius();
        obj.display();
        obj.getvalue();
        obj.show();
        
        
    }
    
}
interface perimeterofcircle
{
    Scanner obj=new Scanner(System.in);
    void getradius();
    void display();
}
interface perimeterofrectangle extends perimeterofcircle
{
    void getvalue();
    void show();
}
class peri implements perimeterofrectangle
{
    int r;
    public void getradius()
    {
        System.out.println("enter the radius:");
        r=obj.nextInt();
    }
    float a;
   public void display()
   {
       a=(int) (2*3.14*r);
    System.out.println("the perimeter of the circle is "+a);
    }
        int l,b;
    public void getvalue()
    {
        System.out.println("enter the length and breadth:");
        l=obj.nextInt();
        b=obj.nextInt();
    }
    int p;
   public void show()
   {
       p=(int) (2*(l+b));
    System.out.println("the perimeter of the rectangle is "+p);
    }
    
}       
    
    
        
        
    
