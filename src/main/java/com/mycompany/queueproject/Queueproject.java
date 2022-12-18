/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.queueproject;

/**
 *
 * @author lenovo
 */
public class Queueproject {

    public static void main(String[] args) {
       
        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
        Employee billEnd = new Employee("Bill", "End", 78);

        ArrayQueue queue = new ArrayQueue(10);
        queue.add(janeJones);
        queue.add(johnDoe);
        queue.add(marySmith);
        queue.add(mikeWilson);
        queue.add(billEnd);
        
        System.out.println("Add to Queue \n");
        queue.printQueue();

        queue.remove();
        queue.remove();
        System.out.println("Remove 2 Data from Queue \n");
        queue.printQueue();

        System.out.println("Peek Data From Queue \n");
        System.out.println(queue.peek());
        queue.remove();
        queue.remove();
        queue.remove();
        //queue.remove();

        queue.add(mikeWilson);

        System.out.println("Print Queue \n");
        queue.printQueue();
    }
    }

