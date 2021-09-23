package com.iqmsoft

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController
import com.iqmsoft.TestObject

@RestController
class MainController{
    @RequestMapping("/")
    public sayHello(){
        return "Hello From Groovy"
    }

    @RequestMapping(name =  "/testpost", method = RequestMethod.POST)
    public ResponseEntity<TestObject> sendPics(@RequestBody TestObject exampleObject){
        return new ResponseEntity<TestObject>(exampleObject, HttpStatus.OK)
    }

}