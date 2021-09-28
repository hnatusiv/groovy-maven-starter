package com.dmdev.lesson27

import com.dmdev.lesson28.MailSpecification

class DslBuilder {

    static  MailSpecification mail( @DelegatesTo(MailSpecification)Closure closure){
     def mailSpecification  =  new MailSpecification()

       //closure.delegate= mailSpecification
     //   closure.resolveStrategy=Closure.DELEGATE_ONLY
     // closure()

      mailSpecification.with closure
        mailSpecification
    }
}
