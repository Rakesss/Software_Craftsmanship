
---
Modelling
-

class- user

Attribute-name,id,email,role

Behaviour-get/set,updatetask,

 class- project

Attribute-name,id,startdate,enddate,description,teams

Behaviour-get/set,update(description,teams)

 class- Team

Attribute-name,id,list(members with same role)

Behaviour-get/set,update list,

 class- task

Attribute-name,id,createddate,duedate,priority,status

Behaviour-get/set update(priority,status,duedate)

 class- workflow

Attribute-id,project,progress

Behaviour-get/set

class- stage

Attribute-id,task,progress(incomplete,inprogress,complete)

Behaviour-get/set 

