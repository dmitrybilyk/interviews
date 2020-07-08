// let key = prompt("afdfdf", "name");
// "use strict";
// function myFunction(p1, p2) {
//     console.log(this);
// }
//
// let person = {
//     name: "Dima",
//     surName: "Bilyk",
//     fullName : function () {
//         return this.name + " " + this.surName;
//     }}

// function createCheckDigit(membershipId) {
//     return membershipId.split("").map(function (element) {
//         return parseInt(element);
//     }).reduce(function (a, b) {
//         return a + b;
//     }).toString().split("").map(function (element)
//     {
//      return parseInt(element);
//     }).reduce(function (a, b) {
//       return a + b;
//     })
// }
//
// console.log(createCheckDigit("55555"));
// console.log(person.name);

// function formatDate(userDate) {
//     var n = Date.parse(userDate);
//     var nowDate = new Date(n);
//     // var s = nowDate.format("YYYYMMDD");
//     var s = nowDate.toUTCString()
//     // format from M/D/YYYY to YYYYMMDD
// }
//
// console.log(formatDate("12/31/2014"));


// function ensure(value) {
//     var args = Array.from(arguments);
//     if (args.length === 0 || args[0] === undefined) {
//         throw 'Empty params';
//     }
//         return value;
// }
//
// try {
//     console.log(ensure(undefined));
// } catch(err) {
//     console.log(err);
// }
//
// function setup(){
//     let buttons = document.getElementsByClassName("remove");
//     for (const button of buttons) {
//         button.addEventListener('click', function () {
//             button.parentNode.remove();
//         });
//     }
// }
//
// // }
//
// function remove(element) {
//     element.parentNode.style.display = "none";
// }
//
// alert("dfdf');

// function numberSyllables(word) {
//     return word.split('-').length;
// }

// console.log(numberSyllables("di-ds"));
// document.getElementsByClassName("remove")[0].click();
// console.log(document.body.innerHTML);

// let array = ["1", 3, "4"];
// let resultArray = [];
// resultArray.push(array.shift());
// resultArray.push(array.pop());
// console.log(resultArray);

// function dashesNumber(parameter) {
//     let dashes = "";
//     for (let i = 0; i < parameter; i++) {
//         dashes += "_";
//     }
//     console.log(dashes);
// }
//
// dashesNumber(4);
//
// let string = "**^&$Regular#$%Expressions$%$$%^**";
//
// let reg = /[\w]+/g;
//
// console.log(string.match(reg).join(" "));

// ;
// console.log("1"- -"1");
//
// function bar() {
//     return foo;
//     foo = 10;
//     function foo(){};
//     var foo = '11';
// }
//
// console.log(typeof bar());

// var x = 3;
//
// var foo = {
//     x: 2,
//     baz: {
//         x:1,
//         bar: function() {
//             return this.x;
//         }
//     }
// };
// var go = foo.baz.bar;
// console.log(go());
// console.log(foo.baz.bar());

// console.log(new Array(5).toString());

// function aaa() {
//     return function () {
//             test:1;
//     }
//
// }
// console.log(aaa());

// console.log(Number("1") - Boolean(0) == 0);

// function foo(a, b) {
//     arguments[1] = 2;
//     console.log(b);
// }
// foo(1, undefined);

// var arr = [];
// arr[0] = 'a';
// arr[1] = 'b';
// arr.foo = 'c';
// // console.log(arr.length);
// console.log(arr.foo);

// var bar = 1,
//     foo = {};
// foo2: {
//     bar: 2;
//     baz: ++bar;
//     (function f() {
//
//     })()
// }
// console.log("run");
// console.log("run");
// (function f() {
//
// })();
// console.log(foo.baz + foo.bar + bar);

// console.log(10 > 9 > 0 === true);

// var myArr = ['foo', 'bar', 'baz'];
// myArr[2];
//
// console.log(myArr.includes('foo4'));

// console.log("This" instanceof String);

// function foo(a, b) {
//     arguments[1] = 2;
//     console.log(b);
// }
// foo(1);

// console.log({valueOf: function(){return 2}} == 2);
// console.log({valBum: function(){return 2}} == 2);

// console.log((1.22e-10).toFixed(5));


// var a = (function a() {
//     return ?1;
// },
//     function b () {
//         return 2;
//     })();
// console.log(typeof a);

// x = 0.000002;
// y = '-0.000003';
// a = 5;
// b = 4;
console.log([1,2,3,4][1,2]);
//
// console.log(~~(-5.5));

// console.log(parseInt(null, 28));
// console.log(parseInt(1/0,19));

