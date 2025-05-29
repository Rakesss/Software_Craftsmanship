Problem Statement: Simple Vending Machine System

A traditional vending machine needs an upgrade to a digital system.
The current mechanical design is prone to errors
(e.g., dispensing the wrong item, not returning change correctly)
and offers no way for operators to easily track sales or manage inventory.
A new, simpler digital system is needed to reliably dispense products, handle payments, manage product stock,
and report basic sales information.

class-sales


attribute-name,id,list<itemname, itemquantity,date>


behaviour-get/set,list(update,add)


class-inventry


attribute-name,id,list<item,itemid,price>


behaviour-get/set,list(add,update,remove)



class-stock

attribute-name,id,list<itemquantity,itemname,price>


behaviour-get/set,list(add,remove,update)



class-payment
enum;(upi,card,cash)



class-item
enum;(name,id,price)


