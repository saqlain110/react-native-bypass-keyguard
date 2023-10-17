package com.bypasskeyguard;

import androidx.annotation.NonNull;
import android.view.WindowManager;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.module.annotations.ReactModule;
import java.util.Map;
import java.util.HashMap;

@ReactModule(name = BypassKeyguardModule.NAME)
public class BypassKeyguardModule extends ReactContextBaseJavaModule {
  public static final String NAME = "BypassKeyguard";

  public BypassKeyguardModule(ReactApplicationContext reactContext) {
    super(reactContext);
  }

  @Override
  @NonNull
  public String getName() {
    return NAME;
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
