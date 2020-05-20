package barbirian.com.JavaData.UI;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.Menu;
import android.widget.TextView;

import Model.Workout;
import barbirian.com.R;

public class WorkoutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workout);

        final TextView countDownTimerTextView=findViewById(R.id.CountdownTimer);

        Intent intent=getIntent();
        int workoutDuration=intent.getIntExtra(OptionsActivity.workoutDurationText,100);
        int restDuration=intent.getIntExtra(OptionsActivity.workoutPauseText,30);
        int sets=intent.getIntExtra(OptionsActivity.workoutSetsText,5);

        Workout workout=new Workout(workoutDuration,restDuration,sets);

        startWorkout(workout);
        new CountDownTimer(workoutDuration*1000, 1000) {

        public void onTick(long millisUntilFinished) {
            countDownTimerTextView.setText("seconds remaining: " + millisUntilFinished / 1000);
        }

        public void onFinish() {
            countDownTimerTextView.setText("done!");
        }
    }.start();
    }
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.top_menu,menu);
        return true;
    }
    private void startWorkout(Workout workout) {

    }
}
