package com.iqmsoft

class TestObject{
    String name
    int age

    public TestObject(String name, int age){
        this.age = age
        this.name = name
    }

    public TestObject(){
        this.age = 3
        this.name = "Jas"
    }

    public int getAge(){
        return this.age
    }
}
