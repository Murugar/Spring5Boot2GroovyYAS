package com.iqmsoft;
import com.iqmsoft.TestObject;

import spock.lang.Specification
import spock.lang.Unroll

class TestObjectTests extends Specification{

    @Unroll("ExampleObject testing with parameters name: #a, age: #b")
    def ExampleObjectConstructor(){
        expect:
        TestObject exampleObject = new TestObject(a, b)
        exampleObject.getName() == a
        exampleObject.getAge() == b

        where:
          a   | b
        "Jas" | 3
        "Abc" | 4
    }


    def ExampleObjectConstructorWithoutParams(){
        expect:
        TestObject exampleObject = new TestObject()
        exampleObject.getName() == "Jas"
        exampleObject.getAge() == 3
    }

    def "Failing because of wrong type of second parameter"(){
        when:
        TestObject exampleObject = new TestObject("Jas", "3")
        then:
        thrown(GroovyRuntimeException)
    }

}