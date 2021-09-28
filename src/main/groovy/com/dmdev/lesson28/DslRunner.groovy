package com.dmdev.lesson28
// def email=  new Email ()
//email.setFrom("from@mail.net")
//email.setTo("to@mail.net")
//email.setTitle("title")

//def body= new EmailBody()
//body.setText("SameThing text")
//body.setImages(List.of("image.jpg"))
//email.setBody(body)

mail {
   from "from@mail.net"
   to "to@mail.net"
   title "title"

     body {
         text "SameThing text"
         images (['image.jpg','image2.png'])
         image 'test.jpeg'
     }

}

