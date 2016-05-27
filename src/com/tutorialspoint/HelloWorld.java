/**
 * Copyright (c) 2004-2015 LARUS Business Automation Srl
 *
 * All Rights Reserved.
 *
 * NOTICE:  All information contained herein is, and remains
 * the property of LARUS Business Automation Srl and its suppliers,
 * if any. The intellectual and technical concepts contained
 * herein are proprietary to LARUS Business Automation Srl
 * and its suppliers and may be covered by Italian and Foreign Patents,
 * patents in process, and are protected by trade secret or copyright law.
 * Dissemination of this information or reproduction of this material
 * is strictly forbidden unless prior written permission is obtained
 * from LARUS Business Automation Srl.
 */
package com.tutorialspoint;

public class HelloWorld {
   private String message;

   public void setMessage(String message){
      this.message  = message;
   }

   public void getMessage(){
      System.out.println("Your Message : " + message);
   }
}