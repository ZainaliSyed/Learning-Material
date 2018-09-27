# Promise

## Reference :

- [ Promise/all ](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Promise/all)

- get Resolve and Reject
- return is used when we have to console , where then(() => { a= 10;}) not return is something like eg : saving database
- `.then/catch(handler)` returns a new promise that changes depending on what handler

## catch

- .catch behaves like try..catch.
- If we throw inside .catch, then the control goes to the next closest error handler.

# Promise chaining

- `Promise chaining` is known as multiple then in it
- When a handler returns a value, it becomes the **`result`** of that promise,

## Reference :

- [promise-chaining](https://javascript.info/promise-chaining)
