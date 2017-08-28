# RxLintTest

## [RxLint issue 11](https://bitbucket.org/littlerobots/rxlint/issues/11)

after updating

* android gradle-plugin to 3.0.0-beta3
* gradle to 4.1

Rx-Lint version 1.3 reports the expected errors

```
Correctness
1	error RxLeakedSubscription: Subscription is leaked
1	error RxSubscribeOnError: Subscriber is missing onError handling
```

for this code:
```java
    public void testRxLintIssue11(Observable<String> observable,
                                  Observer<String> observer) {
        observable.subscribe(observer);
    }
```

