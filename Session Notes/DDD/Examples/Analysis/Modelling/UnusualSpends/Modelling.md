--- 

## Modelling:

### 1. CreditCard: Entity
#### attributes: number: String, userId: String
#### behaviours: get/set, addTransaction(transactionId: String)

### 2. User: Entity
#### attributes: id: String, name: String, email: String, mobile: String, card: List<CreditCard>
#### behaviours: get/set, spend(amount: double)

### 3. SpendingCategory: Value Object
#### constants: FOOD, GROCERIES, FUEL, ENTERTAINMENT, UTILITY, TRAVEL, ...

### 4. Transaction: Entity
#### attributes: id: String, double amount, merchantId: String, creditCardId: String, timestamp: DateTime
#### behaviours: get/set, getMonth()

### 5. Merchant: Entity
#### attributes: id: String, name: String, category: SpendingCategory 
#### behaviours: get/set

### 6. UnusualSpendsProcessor: Service
#### behaviours: getUnusualSpending(lastMonthSpending: SpendingByCategoryAndAmount, currentMonth: SpendingByCategoryAndAmount)
