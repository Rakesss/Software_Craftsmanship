Problem Statement: Kanban System for a Distributed Software Development Team

A rapidly growing software development company,
"InnovateTech,"
is struggling with coordinating tasks and maintaining visibility
across its geographically distributed teams.
They currently use a combination of spreadsheets 
and ad-hoc communication,
leading to missed deadlines, 
duplicated efforts,
and a lack of transparency regarding project progress.


---

Meanings-
-
Kanban- Demonstrates Different Stages of workflow(ToDo,InProgress,Done)




---
Analysis:
-

4/5. class- user

Attribute-name,id,email,role

Behaviour-get/set,updatetask,

1. class- project

Attribute-name,id,startdate,enddate,description,teams

Behaviour-get/set,update(description,teams)

4/5. class- Team

Attribute-name,id,list(members with same role)

Behaviour-get/set,update list,

6. class- task

Attribute-name,id,createddate,duedate,priority,status

Behaviour-get/set update(priority,status,duedate)

2. class- workflow

Attribute-id,project,progress

Behaviour-get/set

3. class- progress

Attribute-id,task,progress(incomplete,inprogress,complete)

Behaviour-get/set 


