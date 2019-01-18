package test.com.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.wzk.binder.processor.BinderView;
import com.wzkbinder.WzkBinderView;

public class MainActivity extends AppCompatActivity {

    @BinderView(R.id.testId)
    TextView mTestId;

    @BinderView(R.id.testId)
    TextView mTestId2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        WzkBinderView.bind(this);
        mTestId.setText("这是直接用binderView获取的对象");
    }
}
