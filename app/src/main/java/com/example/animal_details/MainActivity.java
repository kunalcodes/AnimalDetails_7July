package com.example.animal_details;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements ItemClickListener {

    private ArrayList<Animal> animalList = new ArrayList<>();
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.rvRecyclerView);
        buildRecyclerviewData();
        setRecyclerViewAdapter();
    }

    private void setRecyclerViewAdapter() {
        AnimalAdapter animalAdapter = new AnimalAdapter(animalList, this);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this,2);
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setAdapter(animalAdapter);
    }

    private void buildRecyclerviewData(){
        animalList.add(new Animal(R.drawable.alligator,"Alligator", "Reptile", "Hiss"));
        animalList.add(new Animal(R.drawable.camel,"Camel", "Mammal", "Grunt"));
        animalList.add(new Animal(R.drawable.cow,"Cow", "Mammal", "Moo"));
        animalList.add(new Animal(R.drawable.deer,"Deer", "Mammal", "Bellow"));
        animalList.add(new Animal(R.drawable.dolphin,"Dolphin", "Fish", "Whistle"));
        animalList.add(new Animal(R.drawable.eagle,"Eagle", "Bird", "Screech"));
        animalList.add(new Animal(R.drawable.elephant,"Elephant", "Mammal", "Trumpet"));
        animalList.add(new Animal(R.drawable.fox,"Fox", "Mammal", "Howl"));
        animalList.add(new Animal(R.drawable.giraffe,"Giraffe", "Mammal", "Bleat"));
        animalList.add(new Animal(R.drawable.lion,"Lion", "Mammal", "Roar"));
        animalList.add(new Animal(R.drawable.owl,"Owl", "Bird", "Hoot"));
        animalList.add(new Animal(R.drawable.panda,"Panda", "Mammal", "Bleat"));
        animalList.add(new Animal(R.drawable.penguin,"Penguin", "Bird", "Squawk"));
        animalList.add(new Animal(R.drawable.peacock,"Peacock", "Bird", "Squawk"));
        animalList.add(new Animal(R.drawable.rhinoceros,"Rhino", "Mammal", "Bellow"));
        animalList.add(new Animal(R.drawable.sheep,"Sheep", "Mammal", "Bleat"));
        animalList.add(new Animal(R.drawable.snake,"Snake", "Reptile", "Hiss"));
        animalList.add(new Animal(R.drawable.squirrel,"Squirrel", "Rodent", "Squeak"));
        animalList.add(new Animal(R.drawable.tiger,"Tiger", "Mammal", "Roar"));
        animalList.add(new Animal(R.drawable.zebra,"Zebra", "Mammal", "Neigh"));
    }

    @Override
    public void onItemClicked(int position, Animal animal) {
        Toast.makeText(MainActivity.this, animal.getName(), Toast.LENGTH_SHORT).show();
    }
}