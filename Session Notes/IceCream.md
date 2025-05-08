HOW TO MAKE AN ICE-CREAM

Base:
Cone
Large
Cup

Toppings
ChocoChips
Caramel Syrup
Hot Fudge
Crushed Almonds





// Base Object:
Base Cone = new Base("Cone");
         Base Large = new Base("Large");
         Base Cup = new Base("Cup");
//Toppings Object
         Topping ChocoChips = new Topping("ChocoChips");
         Topping Caremal = new Topping("Caramel Syrup");
         Topping Almonds = new Topping("Crushed Almonds");
         Topping HotFudge = new Topping("Hot Fudge");


         IceCream Recommended = new IceCream(Cone , ChocoChips);
         IceCream Special = new IceCream(Large , Almonds);