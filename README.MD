
Test Below:

A rest service with 2 methods (POST or GET doesn't matter)
Each method calls a class which resides in its own jar file . MethodA calls a method in ClassA which in jarA and MethodB calls a method in ClassB which is in jarB.

ClassA is a bean defined in application context xml file packaged in jarA

Get for entity B
`http://localhost:8080/b/1`

Post for entity A
`POST http://localhost:8080/a/`

Please check _Task.postman_collection.json_ for a Postman collection with some simple requests.

ClassB is a bean defined in application context xml file packaged in jarB .

Whole application should be one war file which can be deployed in a tomcat . Please send upload source and war file here or upload in github and send me the details, and I will check.

Use Eclipse IDE
Use java 1.8
Use gradle as build tool
Use spring framework for REST service . l

Please run the gradle IDE tasks before opening the project:

`gradle idea`

or 

`gradle eclipse`
