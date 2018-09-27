[Solidity Functions](https://solidity.readthedocs.io/en/v0.4.25/contracts.html#visibility-and-getters)

# Functions

- Functions are of two types internal and external
- Functions can be specified as being **(know as visibility specifier)** `external, public, internal or private`, where the default is public. For state variables, external is not possible and the default is internal.
- function syntax can be written as

```
function (<parameter types>) {internal|external} [pure|constant|view|payable] [returns (<return types>)]
```

# Fallback Function

- the fallback function can only rely on 2300 gas being available
- Contracts that receive Ether directly (without a function call, i.e. using send or transfer) but do not define a fallback function throw an exception, sending back the Ether

# Private

- visibility specifier is given after the type for state variables and between parameter list and return parameter list for functions.
- `private` only prevents other contracts from **accessing and modifying** the information, but it will still be visible to the whole world outside of the blockchain.

// private will not show value you entered

```
pragma solidity ^0.4.16;

contract C {
    function f(uint a) private pure returns (uint b) { return a + 1; }
    function setData(uint a) internal { data = a; }
    uint public data;
}
```

# Public
