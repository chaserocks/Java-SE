package Aug11TypesofInheritance;

import Aug11TypesofInheritance.ClassA;


/*Types of Inheritance in Java – Single,Multiple,Multilevel,Hierarchical & Hybrid
August 17, 2015 by javainterviewpoint Leave a Comment

Below are the types of inheritance which is supported by Java.

Single Inheritance
Multiple Inheritance (Through Interface)
Multilevel Inheritance
Hierarchical Inheritance
Hybrid Inheritance (Through Interface)

Lets see about each one of them one by one.

1. Single Inheritance in Java

Single Inheritance is the simple inheritance of all, When a class extends another class(Only one class) then we  call it as Single inheritance. The below diagram represents the single inheritance in java where Class B extends only one class Class A. Here Class B will be the Sub class and Class A will be one and only Super class.Single_Inheritance_in_Java
Single Inheritance Example
*/


public class ClassB extends ClassD
{
    public void dispB()
    {
        System.out.println("disp() method of ClassB");
    }

    public static void main(String args[])
    {
        //Assigning ClassB object to ClassB reference
        ClassB b = new ClassB();
        //call dispA() method of ClassA
      //  b.dispA();
        b.dispD();
        //call dispB() method of ClassB
        b.dispB();
    }
}

