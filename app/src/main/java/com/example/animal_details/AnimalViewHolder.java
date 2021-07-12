package com.example.animal_details;

import android.view.Menu;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class AnimalViewHolder extends RecyclerView.ViewHolder {

    private ImageView mIvImage;
    private TextView mTvtvAnimalType;
    private TextView mTvtvAnimalSound;
    private CardView cardView;
    private ItemClickListener itemClickListener;


    public AnimalViewHolder(@NonNull View itemView, ItemClickListener itemClickListener) {
        super(itemView);
        this.itemClickListener = itemClickListener;
        intiViews(itemView);
    }

    private void intiViews(View itemView) {
        mIvImage = itemView.findViewById(R.id.ivImage);
        mTvtvAnimalType = itemView.findViewById(R.id.tvAnimalType);
        mTvtvAnimalSound = itemView.findViewById(R.id.tvAnimalSound);
        cardView = itemView.findViewById(R.id.cvCard);
    }

    public void setData(Animal animal){
        mIvImage.setImageResource(animal.getImage());
        mTvtvAnimalType.setText(animal.getType());
        mTvtvAnimalSound.setText(animal.getSound());
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                itemClickListener.onItemClicked(getAdapterPosition(), animal);
            }
        });
    }
}
