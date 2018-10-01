# Render

- whenever any of the props of the particular element gets changes, that element will only be updated.
- it's because React store them in ReactDOM object but not HTML DOM. And it carefully analyse what it needs to be updated. ReactDOM is simply an object with key:value pair.
