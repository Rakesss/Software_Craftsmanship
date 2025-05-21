Problem Statement: Personal Finance Tracker

You need to design a simple application to help individuals track their personal finances.
The system should allow users to record income and expenses, 
categorize transactions, and manage different accounts.


---

ANALYSIS
-
1. we need an user(record income/expenses/categorize transactions/manage different accounts)
2. we need expense(userid/transactionid/category)
3. we need an transaction(userid/date/time/category)
4. we need an income(salary/bonous/passive income)

--- 

MODELLING
-

class-user

attribute-name ,id ,email,contact,address

behaviour-get/set, checkexpense,switchaccounts,addaccount,removeaccount,updateaccount

---

class-expense

attribute-userid,transactionid,transactiontype,transactiondate,transactiontime

behaviour-get

---

class-transaction

attribute-userid,date,time,cateagory,tarnsactionid

behaviour-get/set


---


class-income

attribute-userid,salary,bonous,paassiveincome

behaviour-get/set

---
