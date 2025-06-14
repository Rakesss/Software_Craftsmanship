


* Bounded Context: Functionality attached to a particular system



Design Types in DDD:

1. Entity: Any model which has id, which is mutable

2. Value Object: Any model which does not need unique id, which is immutable

3. Aggregate: An Entity, made up of other entities

4. Repository: An abstraction layer on top of DB

5. Service: Is a class, where the domain/core logic is kept
    a. Domain Service: domain handling
    b. Application Service: App handling