package com.example.networking;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.List;

@SuppressWarnings("FieldCanBeLocal")
public class MainActivity extends AppCompatActivity implements JsonTask.JsonTaskListener {

    private final String JSON_URL = "https://mobprog.webug.se/json-api?login=brom";
    private final String JSON_FILE = "mountains.json";

    private final String TAG = "==>";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new JsonTask(this).execute(JSON_URL);

    }

    @Override
    public void onPostExecute(String json) {
        Log.d("MainActivity", json);

        json = readFile("mountains.json");

        Log.d(TAG,json);

        Gson gson = new Gson();
        // Unmarshall JSON -> list of objects
        Type type = new TypeToken<List<mountains>>() {}.getType();
        List<mountains> listOfMountains = gson.fromJson(json, type);
        Log.d(TAG, "Number of elements"+listOfMountains.size());
        Log.d(TAG, "Element 0"+listOfMountains.get(0).toString());

    }

}
