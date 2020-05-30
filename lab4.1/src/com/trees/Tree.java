package com.trees;/*
Создать объект класса Дерево, используя классы Лист, Ветка. Методы: зацвести, опасть листьям, покрыться инеем, пожелтеть листьям*/

public class Tree extends Branch {

    public Tree(Leaves leaves) {
        super();
    }
    public void bloom(){
        System.out.println("Дерево зацвело");
    }
    public void shankOff(Leaves leaves){
        leaves.setLeavesCount(0);
        System.out.println("Листья опали. Количество листьев " + leaves.getLeavesCount());
    }
    public void frost(){
        System.out.println("Листья покрылись инеем");
    }
    public void growYellow(Leaves leaves){
        leaves.setColor("yellow");
        System.out.println("Цвет листьев " + leaves.getColor());

    }

}
