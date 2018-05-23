package cn.nieking.myecmallj;

import android.app.Application;

import com.joanzapata.iconify.fonts.FontAwesomeModule;

import cn.nieking.latte.core.app.Latte;
import cn.nieking.latte.ec.icon.FontEcModule;

public class ExampleApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Latte.init(this)
                .withIcon(new FontAwesomeModule())
                .withIcon(new FontEcModule())
                .withApiHost("http://127.0.0.1/")
                .configure();
    }
}
