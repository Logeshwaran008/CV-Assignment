const str = "This is a sunnay day";
const reversedString = str.split("").reduce((acc, char) => char + acc, "");
console.log(reversedString)