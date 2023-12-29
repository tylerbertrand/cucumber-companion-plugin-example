# Cucumber companion plugin example

This repository contains two branches:
1. `without-cucumber-companion`
2. `with-cucumber-companion`

The two branches demonstrate how Cucumber-based tests are executed before and after applying the Cucumber companion plugin.

Without the cucumber companion plugin, typically, a single JUnit 5 suite class is created to run all features. This means that all tests are executed as part of a single class, which lacks the class-level granularity required to benefit from Test Distribution and Predictive test selection. One workaround is to create a single test class per feature file, which does not scale.

The Cucumber companion plugin automates the creation of these JUnit 5 suite classes to allow fine grained selection of tests.

[Here are the tests without the Cucumber companion plugin applied](https://ge.solutions-team.gradle.com/s/azhjumyvannks/tests/overview). All tests belong to a single test class - the JUnit 5 suite class. Each Cucumber example is recorded as a test case, grouped by the example number.

[Here are the same tests with the Cucumber companion plugin applied](https://ge.solutions-team.gradle.com/s/awzonnj24zria/tests/overview). The Cucumber companion plugin generates a JUnit 5 suite class per feature, breaking down the features into the necessary class structure to take advantage of Test Distribution and Predictive Test Selection.

