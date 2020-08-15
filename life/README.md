# BDD from scratch with Serenity and JBehave

[YouTube tutorial](https://www.youtube.com/watch?v=pNOnLl8rZAw) demonstrating:

- Serenity, an automated acceptance test reporting librry
- JBehave, a BDD framework for Java

Illustrated by the Conway's Game of Life.

## Setup

- Use IntelliJ community
- Add JBehave Support plugin
- Create an empty maven project using IntelliJ
- add dependencies in pom file

## First story

- add story file cell_lifecycle.story under the package src/test/resources/stories/life/cells
- add corresponding java story file CellLifecycle.java under src/test/java/life/stories

## Run tests

- `$ mvn clean verify`

## References

- [Serenity BDD](https://serenity-bdd.github.io/theserenitybook/latest/index.html)
- [JBehave](https://jbehave.org/)
