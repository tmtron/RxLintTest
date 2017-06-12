package com.tmtron.rxlinttest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import io.reactivex.Observable;
import io.reactivex.Observer;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // this should not be an error anymore since RxLint 1.3??
    // https://bitbucket.org/littlerobots/rxlint/issues/11
    public void testBehaviourSubjectSubscription(Observable<String> observable,
                                                 Observer<String> observer) {
        observable.subscribe(observer);
    }

}
