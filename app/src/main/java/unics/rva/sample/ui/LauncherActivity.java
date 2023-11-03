package unics.rva.sample.ui;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.Nullable;

/**
 * Create by luochao
 * on 2023/11/3
 */
public class LauncherActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Button btn = new Button(this);
        btn.setText("启动乐家桌面");
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    Intent it = new Intent();
                    it.setComponent(new ComponentName("com.xinjing.launcher","com.xinjing.launcher.home.HomeActivity"));
                    it.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    startActivity(it);
                }catch (Exception e){
                    Toast.makeText(LauncherActivity.this,"启动乐家桌面失败",Toast.LENGTH_SHORT).show();
                }
            }
        });
        setContentView(btn);
    }
}