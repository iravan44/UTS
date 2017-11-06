package com.dwi.uts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView rv;
    ContactAdapter adapter;
    List<ContactModel> contactModels = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rv = (RecyclerView) findViewById(R.id.rv);
        adapter = new ContactAdapter(this, contactModels);
        rv.setLayoutManager(new LinearLayoutManager(this));
        rv.setAdapter(adapter);
        isiData();

    }

    private void isiData() {
        ContactModel model = new ContactModel("Dwi", "dwi@gmail.com","087733810322");
        contactModels.add(model);

        model = new ContactModel("Rosdan", "Rosdan@gmail.com","085345762186");
        contactModels.add(model);

        model = new ContactModel("Arwana", "Arwana@gmail.com","083762983614");
        contactModels.add(model);

        adapter.notifyDataSetChanged();

    }
}
