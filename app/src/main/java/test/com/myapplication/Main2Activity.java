package test.com.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.wzk.binder.processor.BinderView;

public class Main2Activity extends AppCompatActivity {

//    @BindView(R.id.textTv2)
    @BinderView(R.id.textTv2)
    TextView mTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
}
