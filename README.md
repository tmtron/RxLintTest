# RxLintTest

## [RxLint issue 11](https://bitbucket.org/littlerobots/rxlint/issues/11)
this should be fixed since RxLint 1.3, but I still get an error:

```java
    public void testBehaviourSubjectSubscription(Observable<String> observable,
                                                 Observer<String> observer) {
        observable.subscribe(observer);
    }
```
see [MainActivity::testRxLintIssue11()](https://github.com/tmtron/RxLintTest/blob/1.3_%2311/app/src/main/java/com/tmtron/rxlinttest/MainActivity.java#L20) VCS-tag `1.3#11`

Error message from the html report:
```
Subscription is leaked
../../src/main/java/com/tmtron/rxlinttest/MainActivity.java:20: No reference to the disposable is kept
```


