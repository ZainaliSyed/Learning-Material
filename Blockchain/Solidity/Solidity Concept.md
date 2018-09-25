

# Solidity 
- Unit 
- The address type is a 160-bit value that does not allow any arithmetic operations.
- Inheritance is done using `is` keyword.
  ```JavaScript
  contract Bank {

  }
  contract Name is Bank {

  }
  ```
 - access modifer are pubic,private and internal (simiar to protected)
 - Modifier is something like function 
 - requiure is just like if condiction
 - **_;** is used when require is true run body where modifier is call 
 
 ``` 
 modifier isOwner{
        require(owner== msg.sender);
        _;
    }
    
    function () payable isOwner {
      
   }
   function setName (string _name) public isOwner{
   name = _name
   } 
   ```
   # constructor
   
    - A constructor is optional. Only one constructor is allowed, and this means overloading is not supported.
   
   # Functions
   - Functions are of two types internal and external 
   - Functions can be specified as being **(know as visibility specifier)** `external, public, internal or private`, where the default is public. For state variables, external is not possible and the default is internal.
   # Fallback Function
   -  the fallback function can only rely on 2300 gas being available 
   -  Contracts that receive Ether directly (without a function call, i.e. using send or transfer) but do not define a fallback function throw an exception, sending back the Ether 
   
   # Inheritance 
   - 
