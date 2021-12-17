# BDD from scratch with Serenity and JBehave

[YouTube tutorial](https://www.youtube.com/watch?v=pNOnLl8rZAw) demonstrating:

- [Serenity](https://serenity-bdd.info/), an automated acceptance test reporting library
- [JBehave](https://jbehave.org/), a BDD framework for Java

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

### From the terminal
- `$ mvn clean verify`

### From IntelliJ
- Right-click on java story file (e.g. CellLifecycle), and select 'Run <StoryFile>'

## References

- [Serenity BDD](https://serenity-bdd.github.io/theserenitybook/latest/index.html)
- [JBehave](https://jbehave.org/)
