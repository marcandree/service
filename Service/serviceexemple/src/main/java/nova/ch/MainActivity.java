package nova.ch;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    // Method to start the service
    public void startService(View view)
    {
        startService(new Intent(this, MyService.class));
    }

    // Method to stop the service
    public void stopService(View view)
    {
        stopService(new Intent(this, MyService.class));
    }


}
