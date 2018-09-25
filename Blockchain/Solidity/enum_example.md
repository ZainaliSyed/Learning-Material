- 4 options are there
- pure and view (View can be return to object and pure can return to int type value )

```
pragma solidity ^ 0.4.16;
contract Enum{
    enum ActionChoices {GOLEFT, GORIGHT, GOSTRAIGHT, SITSTILL}
    ActionChoices choice;
    ActionChoices constant defaultChoice = ActionChoices.GOLEFT;

    function getDefaultChoice() public pure returns(uint){
        return uint(defaultChoice); // `pure`
    }
    function setGoStraight() public{
        choice = ActionChoices.GOSTRAIGHT;
    }

    function getChoice () public view returns(ActionChoices){
        return choice;
    }
}
```
