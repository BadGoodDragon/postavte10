package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<PersData> persDataList = new ArrayList<>();
        persDataList.add(new PersData(1, "John", "123456"));
        persDataList.add(new PersData(2, "Alice", "789012"));
        persDataList.add(new PersData(2, "Alice", "789012"));
        persDataList.add(new PersData(2, "Alice", "789012"));
        persDataList.add(new PersData(2, "Alice", "789012"));
        persDataList.add(new PersData(2, "Alice", "789012"));
        persDataList.add(new PersData(2, "Alice", "789012"));
        persDataList.add(new PersData(2, "Alice", "789012"));
        persDataList.add(new PersData(2, "Alice", "789012"));
        persDataList.add(new PersData(2, "Alice", "789012"));
        persDataList.add(new PersData(2, "Alice", "789012"));
        persDataList.add(new PersData(2, "Alice", "789012"));
        persDataList.add(new PersData(2, "Alice", "789012"));
        persDataList.add(new PersData(2, "Alice", "789012"));
        persDataList.add(new PersData(2, "Alice", "789012"));
        persDataList.add(new PersData(2, "Alice", "789012"));
        persDataList.add(new PersData(2, "Alice", "789012"));
        persDataList.add(new PersData(2, "Alice", "789012"));
        persDataList.add(new PersData(2, "Alice", "789012"));

        ListView listView = findViewById(R.id.listView);

        PersDataAdapter adapter = new PersDataAdapter(this, persDataList);
        listView.setAdapter(adapter);

        List<PetData> data = new ArrayList<>();
        data.add(new PetData("rayn gosling", "drive"));
        data.add(new PetData("rayn gosling", "drive"));
        data.add(new PetData("rayn gosling", "drive"));
        data.add(new PetData("rayn gosling", "drive"));
        data.add(new PetData("rayn gosling", "drive"));
        data.add(new PetData("rayn gosling", "drive"));
        data.add(new PetData("rayn gosling", "drive"));
        data.add(new PetData("rayn gosling", "drive"));
        data.add(new PetData("rayn gosling", "drive"));
        data.add(new PetData("rayn gosling", "drive"));
        data.add(new PetData("rayn gosling", "drive"));
        data.add(new PetData("rayn gosling", "drive"));
        data.add(new PetData("rayn gosling", "drive"));
        data.add(new PetData("rayn gosling", "drive"));
        data.add(new PetData("rayn gosling", "drive"));
        data.add(new PetData("rayn gosling", "drive"));
        data.add(new PetData("rayn gosling", "drive"));


        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new PetDataAdapter(this, data));

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                PersData selectedPerson = (PersData) parent.getItemAtPosition(position);

                recyclerView.setAdapter(new PetDataAdapter(null, selectedPerson.data));

                Toast.makeText(MainActivity.this, "Selected: " + selectedPerson.name, Toast.LENGTH_SHORT).show();
            }
        });
    }
}