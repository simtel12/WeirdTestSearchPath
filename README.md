## Steps to Repro:
1) Run "All tests" in `common` module.  Observe only test from `common` ran
2) Run "All tests" in `httpcore` module.  Observe that both `common` and `httpcore` tests ran.
3) Run "All tests" in `common` module again.  Observe that both `common` and `httpcore` tests ran.
4) From command-line: Do a gradle clean
5) Run tests for `httpcore` again.  Observe only `httpcore` test ran.

For grins, you can run the tests for `data` at various points - you'll see that all tests that have run since the most recent `gradle clean` will be re-run.

To make it work as expected, comment out the line `implementation Deps.junit5_api` in `commonteststuff/build.gradle`.  It also works as expected if all JUnit4 references are converted to JUnit5.  The problem only happens when both JUnit4 and JUnit5 APIs are coexisting. 

## Heirarchy

```
data - A fake module representing some data-related classes
 |
 |-> implementation classpath: 
 |        common
 |
 |-> test classpath
 |        junit4
 
 
common - A fake module representing a module of shared utility classes.
 |
 |-> test classpath
 |        commonteststuff
 |        junit4
 
httpcore - A fake module representing our network layer module.
 |
 |-> implementation classpath:
 |        common
 |
 |-> test classpath
 |        commonteststuff
 |        junit4
 
commonteststuff - provides test-related helper classes and extension methods.  Extended asserts, mocks, etc.
 |
 |-> implementation classpath:
 |        common
 |        httpcore
 |
 |-> test classpath
 |        junit4
 |        junit5
```
