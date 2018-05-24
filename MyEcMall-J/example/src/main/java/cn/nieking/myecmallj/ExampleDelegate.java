package cn.nieking.myecmallj;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import cn.nieking.latte.core.delegates.LatteDelegate;

public class ExampleDelegate extends LatteDelegate {
    @Override
    public Object setLayout() {
        return R.layout.delegate_example;
    }

    @Override
    protected void onBindView(@Nullable Bundle savedInstanceState, View rootView) {

    }
}
