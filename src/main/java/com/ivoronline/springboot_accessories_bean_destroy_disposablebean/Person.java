package com.ivoronline.springboot_accessories_bean_destroy_disposablebean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.stereotype.Component;

@Component
public class Person implements DisposableBean {

  //PROPERTIES
  public String name;
  
  //CONSTRUCTOR
  Person() {
    System.out.println("Person Created");
  }
  
  //DESTROY
  @Override
  public void destroy() {
    System.out.println("Person Destroyed");
  }

}
