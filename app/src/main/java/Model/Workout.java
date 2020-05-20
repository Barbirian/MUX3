package Model;

import android.os.CountDownTimer;

public class Workout {
    private int workoutDuration;
    private int restDuration;
    private int sets;

    public Workout(int workoutDuration, int restDuration, int sets) {
        this.workoutDuration = workoutDuration;
        this.restDuration = restDuration;
        this.sets = sets;
    }

    public int getWorkoutDuration() {
        return workoutDuration;
    }

    public void setWorkoutDuration(int workoutDuration) {
        this.workoutDuration = workoutDuration;
    }

    public int getRestDuration() {
        return restDuration;
    }

    public void setRestDuration(int restDuration) {
        this.restDuration = restDuration;
    }

    public int getSets() {
        return sets;
    }

    public void setSets(int sets) {
        this.sets = sets;
    }

    public void startWorkout(int workoutDuration,int restDuration, int sets) {
       this.workoutDuration=workoutDuration;
       this.restDuration=restDuration;
       this.sets=sets;

        /*new CountDownTimer(workoutDuration*1000, 1000) {

        public void onTick(long millisUntilFinished) {
            mTextField.setText("seconds remaining: " + millisUntilFinished / 1000);
        }

        public void onFinish() {
            mTextField.setText("done!");
        }
    }.start();*/
}

}
