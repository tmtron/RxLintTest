# RxLintTest

## [RxLint issue 11](https://bitbucket.org/littlerobots/rxlint/issues/11)
this should be fixed since RxLint 1.3, but I still get an error when using:

* android gradle-plugin to 3.0.0-alpha2
* gradle 4.0-rc2

```java
    public void testRxLintIssue11(Observable<String> observable,
                                  Observer<String> observer) {
        observable.subscribe(observer);
    }
```
see [MainActivity::testRxLintIssue11()](https://github.com/tmtron/RxLintTest/blob/1.3_%2311/app/src/main/java/com/tmtron/rxlinttest/MainActivity.java#L20) VCS-tag `1.3#11`

Expected error message from the html report:
```
Subscription is leaked
../../src/main/java/com/tmtron/rxlinttest/MainActivity.java:20: No reference to the disposable is kept
```

## UPDATE
RxLint 1.3 works correctly when we update:
* android gradle-plugin to 3.0.0-beta3
* gradle to 4.1
* Android Studio 3.0 Beta 2

see [Branch: gradle_41_android_gradle_plugin_300-beta3](https://github.com/tmtron/RxLintTest/blob/gradle_41_android_gradle_plugin_300-beta3/README.md)
