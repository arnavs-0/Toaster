package com.arnav.toaster;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class Toaster extends Toast {
    public static int SUCCESS = 1;
    public static int WARNING = 2;
    public static int ERROR = 3;
    public static int INFO = 4;
    public static int DEFAULT = 5;

    public Toaster(Context context){
        super(context);
    }

    public static Toast makeText(Context context, CharSequence message, int duration, int type){
        Toast toast = new Toast(context);
        View layout = LayoutInflater.from(context).inflate(R.layout.toaster_layout, null);
        LinearLayout linearLayout = layout.findViewById(R.id.toast_type);
        ImageView icon = layout.findViewById(R.id.toast_icon);
        TextView text = layout.findViewById(R.id.toast_text);

        switch (type){
            case 1:
                linearLayout.setBackgroundResource(R.drawable.success);
                icon.setImageResource(R.drawable.ic_check);
                icon.setColorFilter(android.R.color.white);
                break;
            case 2:
                linearLayout.setBackgroundResource(R.drawable.warning);
                icon.setImageResource(R.drawable.ic_warning);
                icon.setColorFilter(android.R.color.white);
                break;
            case 3:
                linearLayout.setBackgroundResource(R.drawable.error);
                icon.setImageResource(R.drawable.ic_error);
                icon.setColorFilter(android.R.color.white);
                break;
            case 4:
                linearLayout.setBackgroundResource(R.drawable.info);
                icon.setImageResource(R.drawable.ic_info);
                icon.setColorFilter(android.R.color.white);
                break;
            case 5:
                linearLayout.setBackgroundResource(R.drawable.normal);
                icon.setVisibility(View.GONE);
                break;
        }

        text.setText(message);
        toast.setDuration(duration);
        toast.setView(layout);

        return toast;
    }

    public static Toast makeText(Context context, int message, int duration, int type){
        Toast toast = new Toast(context);
        View layout = LayoutInflater.from(context).inflate(R.layout.toaster_layout, null);
        LinearLayout linearLayout = layout.findViewById(R.id.toast_type);
        ImageView icon = layout.findViewById(R.id.toast_icon);
        TextView text = layout.findViewById(R.id.toast_text);

        switch (type){
            case 1:
                linearLayout.setBackgroundResource(R.drawable.success);
                icon.setImageResource(R.drawable.ic_check);
                icon.setColorFilter(android.R.color.white);
                break;
            case 2:
                linearLayout.setBackgroundResource(R.drawable.warning);
                icon.setImageResource(R.drawable.ic_warning);
                icon.setColorFilter(android.R.color.white);
                break;
            case 3:
                linearLayout.setBackgroundResource(R.drawable.error);
                icon.setImageResource(R.drawable.ic_error);
                icon.setColorFilter(android.R.color.white);
                break;
            case 4:
                linearLayout.setBackgroundResource(R.drawable.info);
                icon.setImageResource(R.drawable.ic_info);
                icon.setColorFilter(android.R.color.white);
                break;
            case 5:
                linearLayout.setBackgroundResource(R.drawable.normal);
                icon.setVisibility(View.GONE);
                break;
        }

        text.setText(message);
        toast.setDuration(duration);
        toast.setView(layout);

        return toast;
    }

    public static Toast makeTextCustom(Context context, CharSequence message, int duration, Drawable background, Drawable iconId){
        Toast toast = new Toast(context);
        View layout = LayoutInflater.from(context).inflate(R.layout.toaster_layout, null);
        LinearLayout linearLayout = layout.findViewById(R.id.toast_type);
        ImageView icon = layout.findViewById(R.id.toast_icon);
        TextView text = layout.findViewById(R.id.toast_text);

        linearLayout.setBackground(background);
        icon.setBackground(iconId);

        text.setText(message);
        toast.setDuration(duration);
        toast.setView(layout);

        return toast;
    }
    public static Toast makeTextCustom(Context context, int message, int duration, Drawable background, Drawable iconId){
        Toast toast = new Toast(context);
        View layout = LayoutInflater.from(context).inflate(R.layout.toaster_layout, null);
        LinearLayout linearLayout = layout.findViewById(R.id.toast_type);
        ImageView icon = layout.findViewById(R.id.toast_icon);
        TextView text = layout.findViewById(R.id.toast_text);

        linearLayout.setBackground(background);
        icon.setBackground(iconId);

        text.setText(message);
        toast.setDuration(duration);
        toast.setView(layout);

        return toast;
    }

    public static Toast makeTextBackground(Context context, CharSequence message, int duration, Drawable background, String textColor){
        Toast toast = new Toast(context);
        View layout = LayoutInflater.from(context).inflate(R.layout.toaster_layout, null);
        LinearLayout linearLayout = layout.findViewById(R.id.toast_type);
        ImageView icon = layout.findViewById(R.id.toast_icon);
        TextView text = layout.findViewById(R.id.toast_text);

        linearLayout.setBackground(background);
        icon.setVisibility(View.GONE);

        text.setText(message);
        text.setTextColor(Color.parseColor(textColor));
        toast.setDuration(duration);
        toast.setView(layout);

        return toast;
    }

    public static Toast makeTextBackground(Context context, int message, int duration, Drawable background, String textColor){
        Toast toast = new Toast(context);
        View layout = LayoutInflater.from(context).inflate(R.layout.toaster_layout, null);
        LinearLayout linearLayout = layout.findViewById(R.id.toast_type);
        ImageView icon = layout.findViewById(R.id.toast_icon);
        TextView text = layout.findViewById(R.id.toast_text);

        linearLayout.setBackground(background);
        icon.setVisibility(View.GONE);

        text.setText(message);
        text.setTextColor(Color.parseColor(textColor));
        toast.setDuration(duration);
        toast.setView(layout);

        return toast;
    }

}
