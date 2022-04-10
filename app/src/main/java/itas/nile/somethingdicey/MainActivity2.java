package itas.nile.somethingdicey;

import static android.os.Build.VERSION_CODES.LOLLIPOP;
import static android.util.Log.e;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.provider.MediaStore;
import android.speech.tts.TextToSpeech;
import android.util.Log;
import android.view.View;
import android.content.Context;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.EventListener;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.StringTokenizer;

public class MainActivity2 extends AppCompatActivity {

    HashMap<String, String> words = new HashMap<String, String>();
    private TextToSpeech tts;
    private ToggleButton makeSound;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);



        words.put("Hello", "Ahoyyy");
        words.put("hello", "ahoyyy");
        words.put("Hi", "Ahoy");
        words.put("hi", "ahoy");
        words.put("yes", "ai");
        words.put("Yes", "Ai");
        words.put("ok", "ai");
        words.put("OK", "AI");
        words.put("okay", "ai");
        words.put("no", "nai");
        words.put("No", "Nai");
        words.put("NO", "NAI");
        words.put("Treasure", "Booty");
        words.put("treasure", "booty");
        words.put("Money", "Loot");
        words.put("money", "loot");
        words.put("cash", "gold");
        words.put("Cash", "Gold");
        words.put("everyone", "all hands");
        words.put("friend", "bucko");
        words.put("Friend", "Bucko");
        words.put("rob", "pillage");
        words.put("Rob", "Pillage");
        words.put("sea", "chuck");
        words.put("Sea", "huck");
        words.put("see", "spy");
        words.put("See", "Spy");
        words.put("beer", "groog");
        words.put("Beer", "Groog");
        words.put("friends", "me hearties");
        words.put("Friends", "Me hearties");
        words.put("jerk", "scallywag");
        words.put("Jerk", "Scallywag");
        words.put("pirate", "buccaneer");
        words.put("Pirate", "Buccaneer");
        words.put("bag", "duffle");
        words.put("Bag", "Duffle");
        words.put("your", "yer");
        words.put("Your", "Yer");
        words.put("me", "my");
        words.put("Me", "My");
        words.put("telescope", "spyglass");
        words.put("Telescope", "Spyglass");
        words.put("kitchen", "galley");
        words.put("Kitchen", "Galley");
        words.put("boy", "lad");
        words.put("Boy", "Lad");
        words.put("girl", "lass");
        words.put("Girl", "Lass");
        words.put("clean", "swab");
        words.put("Clean", "Swab");
        words.put("wow", "blimey!");
        words.put("Wow", "Blimey!");
        words.put("room", "cabin");
        words.put("Room", "Cabin");
        words.put("quickly", "smartly");
        words.put("Quickly", "Smartly");
        words.put("bed", "cot");
        words.put("Bed", "Cot");
        words.put("surprise", "sink me");
        words.put("Surprise", "Sink me");
        words.put("food", "grub");
        words.put("Food", "Grub");
        words.put("cheat", "hornswaggle");
        words.put("Cheat", "Hornswaggle");
        words.put("sailor", "Jack Tar");
        words.put("Sailor", "Jack Tar");
        words.put("the", "thee");
        words.put("The", "Thee");
        words.put("store", "market");
        words.put("Store", "Market");
        words.put("I", "eye");
        words.put("hungry", "starvin");
        words.put("Hungry", "Starvin");
        words.put("bad", "vile");
        words.put("Bad", "Vile");
        words.put("hit", "skewer");
        words.put("Hit", "Skewer");
        words.put("wind", "blow");
        words.put("Wind", "Blow");
        words.put("windy", "good blow");
        words.put("Windy", "Good blow");

    }


    private void speak(String text) {

        StringBuffer sayThis = new StringBuffer();

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            tts.speak(text, TextToSpeech.QUEUE_FLUSH, null, null);
        } else {
            tts.speak(text, TextToSpeech.QUEUE_FLUSH, null);
        }
        Log.e("run_finish", "speak class");
    }

    @Override
    public void onDestroy() {
        if (tts != null) {
            tts.stop();
            tts.shutdown();
        }
        super.onDestroy();
        Log.e("run_finish", "onDestroy, line 149");
    }


    public void translateThis(View view) {


        EditText editText = findViewById(R.id.editView);
        String userText = editText.getText().toString();

        StringBuffer transText = new StringBuffer();
        Random rand = new Random();

        List<String> yous = new ArrayList<>();
        yous.add("ye");
        yous.add("ye filthy");
        yous.add("ye yellow bellied");

        List<String> starts = new ArrayList();
        starts.add("Yar! ");
        starts.add("Blimey! ");
        starts.add("Yo ho ho! ");
        starts.add("Shiver me timers! ");

        List<String> ends = new ArrayList();
        ends.add(", ye son of a biscuit eater.");
        ends.add(", ye sea dog.");
        ends.add(",  salty sea bass.");


        StringTokenizer tokens = new StringTokenizer(userText, " ,.", true);

        if (userText == "") {
            System.out.print("");
            Log.e("run_finish", "User entered an empty text");
        } else {
            int indexStart = rand.nextInt(starts.size());
            Log.d("itas123", "Here is the random from indexStart: " + indexStart);
            String randomStart = starts.get(indexStart);
            transText.append(randomStart);
            Log.e("run_finish", "user entered text, line 201");
        }
        Log.e("run_finish", "random starer if statement finished line 202");

        while (tokens.hasMoreTokens()) {
            String word = tokens.nextToken();
            Log.d("itas123", "Here is the next word: " + word);

            String value = words.get(word);

            if (word.equalsIgnoreCase("you")) {
                int indexStory = rand.nextInt(yous.size());
                Log.d("itas123", "Here is the random index: " + indexStory);
                String randomYou = yous.get(indexStory);
                transText.append(randomYou);

            } else if (value != null) {// if the word is in the dictionary
                Log.d("itas123", "Found a pirate word: " + value);
                transText.append(value);

            } else {
                // else the next word was not in the list, so just add it back in
                transText.append(word);
            }
        }

        if (userText == "") {
            System.out.print("");
        } else {
            int indexEnd = rand.nextInt(ends.size());
            Log.d("itas123", "Here is the random from indexEnd: " + indexEnd);
            String randomEnd = ends.get(indexEnd);
            transText.append(randomEnd);
        }


        Log.d("itas123", "Here is the translation: " + userText.toString());
        Log.d("itas123", "Here is the translation: " + transText.toString());

        final TextView helloTransText = (TextView) findViewById(R.id.textView);
        helloTransText.setText(transText.toString());

        tts = new TextToSpeech(this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if (status == TextToSpeech.SUCCESS) {
                    int result = tts.setLanguage(Locale.US);
                    if (result == TextToSpeech.LANG_MISSING_DATA || result == TextToSpeech.LANG_NOT_SUPPORTED) {
                        e("TTS", "This language is not supported");
                    }
                    speak(transText.toString());
                } else {
                    Log.e("TTS", "Initialization failed");
                }

                Log.e("run_finish", "TextToSpeech class, after 'hello'");
            }
        });

        //https://www.tabnine.com/code/java/methods/android.media.AudioManager/adjustVolume
        ToggleButton makeSound = (ToggleButton) findViewById(R.id.speakOut);
        makeSound.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                AudioManager audioManager = (AudioManager) getSystemService(Context.AUDIO_SERVICE);

                if(isChecked)
                    audioManager.adjustVolume(AudioManager.ADJUST_MUTE, AudioManager.FLAG_SHOW_UI);

                else
                    audioManager.adjustVolume(AudioManager.ADJUST_UNMUTE, AudioManager.FLAG_SHOW_UI);


            }
        });
    }

}



