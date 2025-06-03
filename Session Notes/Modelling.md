Modelling
-

class-entrygate
-

attributes-gateno.,status(open/undermaintainance/closed),type(Automatic slider/barrier),verify


behaviour-get/set,update status 


class-exitgate
-

attributes-gateno.,status(open/undermaintainance/closed),type(Automatic slider/barrier)


behaviour-get/set,update status



class-snesor
-

attributes-id,status(active/inactive),type(motion/position),time


behaviour-get/set,update(status/time),scan vechicle


class-vechicle
-

enum;(name,id,ownerid,lisenceplateno,type)



class - verify
-

attributes-date,time,vechicledata



behaviour- get/set, updtae(date,time), check(vechicledata), if (vechicledata==!notfound)---> visitor(state reason)


class-record
-

attributes-list(vechicle),date


behaviour-get/set, update date