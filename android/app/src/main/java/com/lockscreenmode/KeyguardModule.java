package com.y_drive_driver_app;

import android.view.WindowManager;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import java.util.Map;
import java.util.HashMap;
public class KeyguardModule extends ReactContextBaseJavaModule {

    public KeyguardModule(ReactApplicationContext reactContext) {
        super(reactContext);
    }

    @Override
    public String getName() {
        return "KeyguardModule";
    }
    @ReactMethod
    public void showOverKeyguard() {
        ReactContext reactContext = getReactApplicationContext();
        if (reactContext != null) {
            getCurrentActivity().runOnUiThread(() -> {
                // Show the activity even when the screen is locked for the current activity
                getCurrentActivity().getWindow().addFlags(WindowManager.LayoutParams.FLAG_SHOW_WHEN_LOCKED);
            });
        }
    }
    @ReactMethod
    public void clearShowOverKeyguard() {
        ReactContext reactContext = getReactApplicationContext();
        if (reactContext != null) {
            getCurrentActivity().runOnUiThread(() -> {
                // Clear the FLAG_SHOW_WHEN_LOCKED flag
                getCurrentActivity().getWindow().clearFlags(WindowManager.LayoutParams.FLAG_SHOW_WHEN_LOCKED);
            });
        }
    }
}
