/*Create a class 'Student' with three data members which are name, age and address. The
constructor of the class assigns default values name as "unknown", age as '0' and address
 as "not available". It has two member methods with the same name “setInfo”. First method
 has two parameters for name and age and assigns the same whereas the second method takes
 three parameters which are assigned to name, age and address respectively. Print the name,
 age and address of 10 students.*/

import java.util.Scanner;
public class Student {
    String name,address;
    int age;

    Student()
    {
        name="unknown";
        age=0;
        address="not available";
    }
    public void setinfo(String name,int age)
    {

    }
    public void setinfo(String name,int age,String address)
    {
        System.out.println(name + " " + age + " " + address);
    }

}
class Home
{
    public static void main(String[] args) {
        Student obj=new Student();
        for(int i=0;i<10;i++)
        {
            Scanner s=new Scanner(System.in);
            String a=s.nextLine();
            int b=s.nextInt();
            s.nextLine();
            String c=s.nextLine();
            obj.setinfo(a,b,c);
        }

    }
}