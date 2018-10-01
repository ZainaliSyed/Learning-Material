# Aysnc Await

- keyword `await` that works only inside async functions,
- outside of an async function's body, you will get a `SyntaxError`

- forget to use await async function will return a promise // `an unresolved promise`

The async keyword before a function has two effects:

- Makes it always return a promise.
- Allows to use await in it.

## Difference b/w Promise and aysnc

- Async/await is constructed in order to give a clean syntax to the continuation semantics of asynchronous operations.
- It avoids callback / promise hell. `it avoid then callback`

- `Promise` use then() work like aysnc but async wait for re // toask

## understanding

- Node.js is aysnc means do not wait for response , where aysnc functions are just like php sync functions
- Php is sync it waits for response
