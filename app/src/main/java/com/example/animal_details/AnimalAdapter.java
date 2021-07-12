package com.example.animal_details;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AnimalAdapter extends RecyclerView.Adapter<AnimalViewHolder> {

    private ArrayList<Animal> animalList;
    private ItemClickListener itemClickListener;

    public AnimalAdapter(ArrayList<Animal> animalArrayList, ItemClickListener itemClickListener){
        animalList = animalArrayList;
        this.itemClickListener = itemClickListener;
    }

    @NonNull
    @Override
    public AnimalViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout, parent,false);
        return new AnimalViewHolder(view, itemClickListener);
    }

    @Override
    public void onBindViewHolder(@NonNull AnimalViewHolder holder, int position) {
        Animal animal = animalList.get(position);
        holder.setData(animal);
    }

    @Override
    public int getItemCount() {
        return animalList.size();
    }
}
