A demo Crud API for Student Entity

So you can,

Create, Retrieve, Update and Delete entry at Student Entity.

Available APIs/URLs

Post : Use this to create student
localhost:8080/apis/students

Sample Data :
    {
      "std_name" : "Vikash Kr",
      "std_rollno" : 1,
      "std_course" : "MCA",
      "std_age" : 27,
      "std_city" : "Pune"
    }

Get : Use this to retrieve student
#This can use to retrieve all available student in db
localhost:8080/apis/students       

#This can use to retrieve student by id
localhost:8080/apis/students/1

Put : Use this to Update student
localhost:8080/apis/students/1

Sample Data :
    {
      "std_name" : "Vikash Kr",
      "std_rollno" : 1,
      "std_course" : "MCA",
      "std_age" : 27,
      "std_city" : "Pune"
    }


