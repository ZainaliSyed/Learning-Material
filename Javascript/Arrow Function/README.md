function () {
return 42
}
// same as:
() => 42
// same as:
() => {
return 42
}
function person(name) {
return { name: name }
}
// same as:
(name) => {
return { name: name }
}

const multiply = (x) => (y) => x \* y
multiply(5)(20)
