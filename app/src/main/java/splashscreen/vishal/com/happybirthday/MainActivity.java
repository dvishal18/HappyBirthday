package splashscreen.vishal.com.happybirthday;

import android.media.MediaPlayer;
import android.media.session.MediaController;
import android.net.Uri;
import android.os.Environment;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();


        View decorView = getWindow().getDecorView();
        // Hide both the navigation bar and the status bar.
        // SYSTEM_UI_FLAG_FULLSCREEN is only available on Android 4.1 and higher, but as
        // a general rule, you should design your app to hide the status bar whenever you
        // hide the navigation bar.
        int uiOptions = View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                | View.SYSTEM_UI_FLAG_FULLSCREEN;
        decorView.setSystemUiVisibility(uiOptions);

        final VideoView mVideoView = (VideoView) findViewById(R.id.videoView1);

        String path = "android.resource://" + getPackageName() + "/" + R.raw.happybirthday;
        mVideoView.setMediaController(new android.widget.MediaController(this));
        mVideoView.setVideoURI(Uri.parse(path));
        mVideoView.requestFocus();
        mVideoView.start();
    }

}