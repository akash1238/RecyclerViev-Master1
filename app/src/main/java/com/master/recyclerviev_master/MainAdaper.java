package com.master.recyclerviev_master;

import android.content.Context;
import android.content.pm.LabeledIntent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MainAdaper extends RecyclerView.Adapter<MainAdaper.ViewHolder> {
    private Context context;
    private Boolean aBoolean;

    public MainAdaper(Context context, Boolean aBoolean) {
        this.context = context;
        this.aBoolean = aBoolean;
    }
    private void setAnimation(View viewToAnimate) {
        ScaleAnimation anim = new ScaleAnimation(0.0f, 1.0f, 0.1f, 1.0f
                , Animation.RELATIVE_TO_PARENT, 0.5f,
                Animation.RELATIVE_TO_PARENT, 0.5f
        );
        anim.setDuration(1000);
        viewToAnimate.startAnimation(anim);

    }
    @NonNull
    @Override
    public MainAdaper.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {


        if (aBoolean == true) {
            View view = LayoutInflater.from(context).inflate(R.layout.single_row_main, parent, false);
            return new ViewHolder(view);
        } else {
            View view = LayoutInflater.from(context).inflate(R.layout.single_row_main_vertical, parent, false);
            return new ViewHolder(view);
        }
    }

    @Override
    public void onBindViewHolder(@NonNull MainAdaper.ViewHolder holder, int position) {
        setAnimation(holder.itemView);
    }

    @Override
    public int getItemCount() {
        return 20;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
