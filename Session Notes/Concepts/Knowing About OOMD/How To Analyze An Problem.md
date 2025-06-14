---------------------------------------------------------------------------------------------------------------------------------------------------------------------
                                                    Problem-Sattement-Analysis
----------------------------------------------------------------------------------------------------------------------------------------------------------------------

It's election night! 
Exciting! We have a feed of election results from a data supplier. They will supply us a file which will contain the votes share for each constituency. Write code to find out the winning party from each constituency and print it to console.

Class-Election
Attribute-Address,Election-Id,Party-Names,Election-Type,Date,Status,Result
Behaviour-Open-Voting,Cast-Vote,Verify-Voteer Eligibility,Count-Votes,Register-Members,Issue-Id's


Class-constituency-party
Attribute-Party-Name,Party-Id,Party-Logo,Party-members
Behaviour-Analyse Election Results,Form Alliances,Nominate Candidates


Class-Vote
Attribute-Vote-Id,Voter-Id,Vote-Date,Vote-Location,Vote-Time,Vote-Status,Vote-Method
Behaviour-Count-Vote,Cast-Vote,Record-Vote,Check-for-Vote(Valid/Invalid)



--------------------------------------------------------------------------------------------------------------
                                                           EXAMPLES
------------------------------------------------------------------------------------------------------------


1.Develop a Hospital Management System that allows patients to book appointments with doctors
---------------------------------------------------------------------------------------------------------------

nouns-class
verbs-behaviour

Class-Hospital
Attribute-Name,Address,Hospital-Id,Capacity,Departments
Behaviour-check-in,check-out,stay,Admit-Patients,Transfer,Treat Patients,Discharge-Patients

Class -Patients
Attributs-Name,Address,Id,Phone-no,Treatement-Cause,Treatement-Id,Scheduled-Date
Behaviour-check-in,check-out,stay,Make-Payment,Take-Treatement,Give-Feedback

Class-Doctors
Attributes-Name,Id,Phone-no,QualiFication,Specilization,Experience,Status
Behaviour-Diagnose-Patient,Discharge-Patients,Treat Patients,Refer-Patients,Prescribe-Patients,Take-CheckupRounds


------------------------------------------------------------------------------------------------------------------------------------------
2.Develop a Student Attendance Management System for a school , where teachers can mark daily attendance,
------------------------------------------------------------------------------------------------------------------------------------------


Class-School
Attribute-Name,Address,School-Id,Capacity,Departments,Contact-Info
Behaviour-Enroll-Students,Conduct-Class,Manage-Records,Manage Academic Records




Class-Teacher
Attribute-Name,Address,Teacher-Id,Specality,Department,Experience,Salary
Behaviour-Teach-Class,Take-Attendence,Organize-Class,Conduct-Exam






Class-Student
Attribute-Name,Address,Student-Id,Attendence Record,Department,Class
Behaviour-Attend-Class,Take-Exam,Do-Homework,Follow-Rules,Apply or Leave
