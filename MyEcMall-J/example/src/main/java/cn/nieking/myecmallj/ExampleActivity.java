package cn.nieking.myecmallj;

import cn.nieking.latte.core.activities.ProxyActivity;
import cn.nieking.latte.core.delegates.LatteDelegate;

public class ExampleActivity extends ProxyActivity {

    @Override
    public LatteDelegate setRootDelegate() {
        return new ExampleDelegate();
    }
}
