/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ArrayObject;

/**
 *
 * @author kbgon
 */
public class TestStudent {

    public static void main(String[] args) {
        Student s1 = new Student();

        Student[] list = new Student[2];

        s1.setName("Kishor");
        s1.setAge(20);

        Student s2 = new Student();
        s2.setName("Arman");
        s2.setAge(20);
        
        list[0]=s1;
        list[1]=s2;
        
        System.out.println(list[1]);
        System.out.println(s1.getName()+s2.getName());
    }
}
