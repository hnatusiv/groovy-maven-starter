package com.dmdev.lesson27

import static com.dmdev.lesson27.DslBuilder.*


/*def email =new Email()
email.setFrom("from@mail.com")
email.setTo("to@mail.com")
email.setTitle("title")

def body = new EmailBody()
body.setText("text")
body.setImages(List.of("image.jpg"))
email.setBody(body)*/

mail {
    from "from@mail.com"
       to  "to@mail.com"
       title "title"

   body {
       text "text  of the letter"
             images (['image.jpg','image2.png '])

       }
    

}
