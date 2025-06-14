You're asked to design a system for a society parking lot. 
The system should allow vehicles to enter and exit, assign a parking spot & record check-in and check-out time.
Assume only cars and bikes are allowed.

---


Questions-
-
1. Is user registration required?
2. Can same user have multiple cars/bikes?
3. Do the user/visitor has to state its reason?

---
Analysis-
-
1. We need an EntryGate(no,status,type,reason)
2. We need an ExitGate(no,status,type)
3. We need an sensor(id,status,time,type)
4. we need an vechile(name,id,ownerid,lisenceplateno,type)
5. we need an slot(no,vechicleid)
6. we need to verify(Date,time,vechicledata)
7. we need an record(vechicle(check-in,check-out),date)
