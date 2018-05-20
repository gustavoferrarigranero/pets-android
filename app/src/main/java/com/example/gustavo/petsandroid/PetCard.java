package com.example.gustavo.petsandroid;

import android.content.Context;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.mindorks.placeholderview.SwipePlaceHolderView;
import com.mindorks.placeholderview.annotations.Layout;
import com.mindorks.placeholderview.annotations.Resolve;
import com.mindorks.placeholderview.annotations.View;
import com.mindorks.placeholderview.annotations.swipe.SwipeCancelState;
import com.mindorks.placeholderview.annotations.swipe.SwipeIn;
import com.mindorks.placeholderview.annotations.swipe.SwipeInState;
import com.mindorks.placeholderview.annotations.swipe.SwipeOut;
import com.mindorks.placeholderview.annotations.swipe.SwipeOutState;

@Layout(R.layout.my_pet_card_view)
public class PetCard {

    @View(R.id.petImageView)
    private ImageView petImageView;

    @View(R.id.petName)
    private TextView petName;

    @View(R.id.petAge)
    private TextView petAge;

    private Pet mPet;
    private Context mContext;

    public PetCard(Context context, Pet pet) {
        mContext = context;
        mPet = pet;
    }

    @Resolve
    private void onResolved(){
        Glide.with(mContext).load(mPet.getImageUrl()).into(petImageView);
        petName.setText(mPet.getName());
        petAge.setText(mPet.getAge());
    }

}