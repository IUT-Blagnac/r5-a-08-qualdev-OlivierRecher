const { Given, When, Then } = require('@cucumber/cucumber');
const assert = require('assert');

let student;
let homeworks = [];
let exist;
let result1;
let result2;

Given('I am student', function () {
    student = "student";
});

When('I add a new homework with the title {string}', function (title) {
    homeworks.push(title);
    result1 = "created";
});

Then('the homework is {string}', function (expectedResult) {
    assert(result1, expectedResult);
});


Given('that the homework {string} exists', function (title) {
    exist = homeworks.includes(title);
});

When('I work on the homework', function () {
    if (exist) {
        result2 = "done";
    }
});

Then('the homework is now {string}', function (expectedResult) {
    assert(result2, expectedResult);
});