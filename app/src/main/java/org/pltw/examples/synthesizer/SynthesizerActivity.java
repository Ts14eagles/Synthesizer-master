package org.pltw.examples.synthesizer;

import android.media.MediaPlayer;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Half;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.NumberPicker;

import java.util.ArrayList;

public class SynthesizerActivity extends AppCompatActivity {

    private final int WHOLE_NOTE = 1000;
    private Button fButton;
    private Button eButton;
    private Button ch3Button;
    private Button ch4Button;
    private Button twinkleButton;
    private Button ch12Button;
    private NumberPicker notePicker;
    private NumberPicker amountPicker;
    private static final String TAG = SynthesizerActivity.class.getName();
    MediaPlayer mpE;
    MediaPlayer mpFs;
    MediaPlayer mpG;
    MediaPlayer mpA;
    MediaPlayer mpB;
    MediaPlayer mpCs;
    MediaPlayer mpD;
    MediaPlayer mpHighE;
    MediaPlayer mpC;
    MediaPlayer mpBb;
    MediaPlayer mpDs;
    MediaPlayer mpF;
    MediaPlayer mpGs;
    MediaPlayer mpHighF;
    MediaPlayer mpHighFs;
    MediaPlayer mpHighG;
    String [] notes = {"mpE", "mpFs", "mpG", "mpA", "mpB", "mpCs", "mpD", "mpHighE", "mpC", "mpBb", "mpDs", "mpF", "mpGs", "mpHighF", "mpHighFs", "mpHighG"};
    ArrayList<MediaPlayer> mediaplayers;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_synthesizer);

        fButton = (Button) findViewById(R.id.button1);
        eButton = (Button) findViewById(R.id.button2);
        ch3Button = (Button) findViewById(R.id.button3);
        ch4Button = (Button) findViewById(R.id.button4);
        twinkleButton = (Button) findViewById(R.id.button5);
        ch12Button = (Button) findViewById(R.id.button6);
        notePicker = (NumberPicker) findViewById(R.id.numberPicker);
        amountPicker = (NumberPicker) findViewById(R.id.numberPicker3);

        notePicker.setMaxValue(15);
        notePicker.setMinValue(0);
        notePicker.setDisplayedValues(notes);
        amountPicker.setMaxValue(20);
        amountPicker.setMinValue(0);

        mpE = MediaPlayer.create(this, R.raw.scalee);
        mpFs = MediaPlayer.create(this, R.raw.scalef);
        mpG = MediaPlayer.create(this, R.raw.scaleg);
        mpA = MediaPlayer.create(this, R.raw.scalea);
        mpB = MediaPlayer.create(this, R.raw.scaleb);
        mpCs = MediaPlayer.create(this, R.raw.scalecs);
        mpD = MediaPlayer.create(this, R.raw.scaled);
        mpHighE = MediaPlayer.create(this, R.raw.scalehighe);
        mpC = MediaPlayer.create(this, R.raw.scalec);
        mpBb = MediaPlayer.create(this, R.raw.scalebb);
        mpDs = MediaPlayer.create(this, R.raw.scaleds);
        mpF = MediaPlayer.create(this, R.raw.scalef);
        mpGs = MediaPlayer.create(this, R.raw.scalegs);
        mpHighF = MediaPlayer.create(this, R.raw.scalehighf);
        mpHighFs = MediaPlayer.create(this, R.raw.scalehighfs);
        mpHighG = MediaPlayer.create(this, R.raw.scalehighg);

        mediaplayers = new ArrayList<>();
        mediaplayers.add(mpE);
        mediaplayers.add(mpFs);
        mediaplayers.add(mpG);
        mediaplayers.add(mpA);
        mediaplayers.add(mpB);
        mediaplayers.add(mpCs);
        mediaplayers.add(mpD);
        mediaplayers.add(mpHighE);
        mediaplayers.add(mpC);
        mediaplayers.add(mpBb);
        mediaplayers.add(mpDs);
        mediaplayers.add(mpF);
        mediaplayers.add(mpGs);
        mediaplayers.add(mpHighF);
        mediaplayers.add(mpHighFs);
        mediaplayers.add(mpHighG);








        fButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i(TAG, "This worked! Button 1 pressed.");
                mpFs.start();
            }
        });
        eButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mpE.start();
                delayPlaying(WHOLE_NOTE);
                mpE.stop();
            }
        });
        ch3Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                for (int i = 0; i<notes.length-1; i++){
                    mediaplayers.get(i).seekTo(0);
                    mediaplayers.get(i).start();
                    delayPlaying(WHOLE_NOTE/2);
                }

            }
        });
        ch4Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int times = amountPicker.getValue();
                for (int i = 0; i<times; i++){
                    mediaplayers.get(notePicker.getValue()).seekTo(0);
                    mediaplayers.get(notePicker.getValue()).start();
                    delayPlaying(WHOLE_NOTE);
                }


            }
        });
        twinkleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mpA.seekTo(0);
                mpA.start();
                delayPlaying(WHOLE_NOTE/2);
                mpA.seekTo(0);
                mpA.start();
                delayPlaying(WHOLE_NOTE/2);
                mpHighE.seekTo(0);
                mpHighE.start();
                delayPlaying(WHOLE_NOTE/2);
                mpHighE.seekTo(0);
                mpHighE.start();
                delayPlaying(WHOLE_NOTE/2);
                mpHighFs.seekTo(0);
                mpHighFs.start();
                delayPlaying(WHOLE_NOTE/2);
                mpHighFs.seekTo(0);
                mpHighFs.start();
                delayPlaying(WHOLE_NOTE/2);
                mpHighE.seekTo(0);
                mpHighE.start();
                delayPlaying(WHOLE_NOTE);
                mpD.seekTo(0);
                mpD.start();
                delayPlaying(WHOLE_NOTE/2);
                mpD.seekTo(0);
                mpD.start();
                delayPlaying(WHOLE_NOTE/2);
                mpCs.seekTo(0);
                mpCs.start();
                delayPlaying(WHOLE_NOTE/2);
                mpCs.seekTo(0);
                mpCs.start();
                delayPlaying(WHOLE_NOTE/2);
                mpB.seekTo(0);
                mpB.start();
                delayPlaying(WHOLE_NOTE/2);
                mpB.seekTo(0);
                mpB.start();
                delayPlaying(WHOLE_NOTE/2);
                mpA.seekTo(0);
                mpA.start();


            }
        });
        ch12Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mpA.seekTo(0);
                mpA.start();
                delayPlaying(WHOLE_NOTE);
                mpA.seekTo(0);
                mpA.start();
                delayPlaying(WHOLE_NOTE);
                mpA.seekTo(0);
                mpA.start();
                delayPlaying(WHOLE_NOTE);
                mpF.seekTo(0);
                mpF.start();
                delayPlaying(WHOLE_NOTE/2);
                mpC.seekTo(0);
                mpC.start();
                delayPlaying(WHOLE_NOTE/2);
                mpA.seekTo(0);
                mpA.start();
                delayPlaying(WHOLE_NOTE);
                mpF.seekTo(0);
                mpF.start();
                delayPlaying(WHOLE_NOTE/2);
                mpC.seekTo(0);
                mpC.start();
                delayPlaying(WHOLE_NOTE/2);
                mpA.seekTo(0);
                mpA.start();
                delayPlaying(WHOLE_NOTE);
                mpHighE.seekTo(0);
                mpHighE.start();
                delayPlaying(WHOLE_NOTE);
                mpHighE.seekTo(0);
                mpHighE.start();
                delayPlaying(WHOLE_NOTE);
                mpHighE.seekTo(0);
                mpHighE.start();
                delayPlaying(WHOLE_NOTE);
                mpHighF.seekTo(0);
                mpHighF.start();
                delayPlaying(WHOLE_NOTE/2);
                mpC.seekTo(0);
                mpC.start();
                delayPlaying(WHOLE_NOTE/2);
                mpA.seekTo(0);
                mpA.start();
                delayPlaying(WHOLE_NOTE/2);
                mpF.seekTo(0);
                mpF.start();
                delayPlaying(WHOLE_NOTE/2);
                mpC.seekTo(0);
                mpC.start();
                delayPlaying(WHOLE_NOTE/2);
                mpA.seekTo(0);
                mpA.start();

            }
        });
    }

    private void delayPlaying(int delay) {
        try {
            Thread.sleep(delay);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
