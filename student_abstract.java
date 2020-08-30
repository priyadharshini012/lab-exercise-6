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
public class student_abstract {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        studentA s=new studentA();
        s.getpercentage();
        s.display();
        s.calculate();
        studentB s1=new studentB();
        s1.getpercentage();
        s1.display();
        s1.calculate();
    }
    
}
abstract class mark
{
    abstract void getpercentage();
    Scanner obj=new Scanner(System.in);
}
class studentA extends mark
{
    float sub1,sub2,sub3;
    void getpercentage()
            {
                System.out.println("marks for student A");
                System.out.println("enter mark for subject1:");
                sub1=obj.nextFloat();
                System.out.println("enter the mark for subject2:");
                sub2=obj.nextFloat();
                System.out.println("enter the mark for subject3:");
                sub3=obj.nextFloat();
            }
    void display()
    {
        System.out.println("subject1:"+sub1);
        System.out.println("subject2:"+sub2);
        System.out.println("subject3:"+sub3);
    }
    float c,f;
            double percent;
    void calculate()
    {
        c=sub1+sub2+sub3;
        f=c/300;
        percent=f*100;
        System.out.println("percentage of 3 subject is"+percent);
    
                
            }
}
class studentB extends mark
{
float s1,s2,s3,s4;
    void getpercentage()
            {
                System.out.println("marks for student B");
                System.out.println("enter mark for subject1:");
                s1=obj.nextFloat();
                System.out.println("enter the mark for subject2:");
                s2=obj.nextFloat();
                System.out.println("enter the mark for subject3:");
                s3=obj.nextFloat();
                System.out.println("enter the mark for subject4:");
                s4=obj.nextFloat();
            }
    void display()
    {
        System.out.println("subject1:"+s1);
        System.out.println("subject2:"+s2);
        System.out.println("subject3:"+s3);
        System.out.println("subject4:"+s4);

    }
    float r,a;
            double per;
    void calculate()
    {
        r=s1+s2+s3+s4;
        a=r/400;
        per=a*100;
        System.out.println("percentage of 4 subject is"+per);
   
                
            }
}