package com.jakkalgaming.myapplication;

/**
 * Created by JDoga on 12/20/2016.
 */

public class MainActivity extends AppCompatActivity {
    private GameView myGameView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        myGameView = new GameView(this);
        setContentView(myGameView);
    }

    @Override
    protected void onPause() {
        super.onPause();
        //The following call pauses the rendering thread
        //If your OpenGL application is memory intensive,
        //You should consider de-allocating objects
        //that consume significant memory here.

        myGameView.onPause();
    }

    @Override
    protected void onResume() {
        super.onResume();

        myGameView.onResume();
    }
}
