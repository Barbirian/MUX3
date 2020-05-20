package barbirian.com.JavaData.UI;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;

import Model.Workout;
import barbirian.com.R;

public class OptionsActivity extends AppCompatActivity {
public static final String workoutDurationText="OPTIONS ACTIVITY WORKOUT DURATION";
public static final String workoutPauseText="OPTIONS ACTIVITY WORKOUT PAUSE";
public static final String workoutSetsText="OPTIONS ACTIVITY WORKOUT SETS";
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_options);

        Button defaultOptionButton1 = findViewById(R.id.DefaultOptionButton1);

        defaultOptionButton1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                int duration=60;
                int restDuration=15;
                int sets=5;
                Intent intent=new Intent(OptionsActivity.this, WorkoutActivity.class);
                intent.putExtra(workoutDurationText,duration);
                intent.putExtra(workoutPauseText,restDuration);
                intent.putExtra(workoutSetsText,sets);
                startActivity(intent);
            }
        });

    }
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.top_menu,menu);
        return true;
    }
}
