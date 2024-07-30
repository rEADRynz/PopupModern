package com.nurazlib.popupmodern;

import android.app.Dialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class PopupModern extends Dialog {

    public PopupModern(Context context) {
        super(context);

        View view = LayoutInflater.from(context).inflate(R.layout.popup_modern, null);
        setContentView(view);

        TextView tvTitle = view.findViewById(R.id.tvTitle);
        TextView tvMessage = view.findViewById(R.id.tvMessage);
        Button btnClose = view.findViewById(R.id.btnClose);

        btnClose.setOnClickListener(v -> dismiss());
    }

    public void setTitle(String title) {
        TextView tvTitle = findViewById(R.id.tvTitle);
        tvTitle.setText(title);
    }

    public void setMessage(String message) {
        TextView tvMessage = findViewById(R.id.tvMessage);
        tvMessage.setText(message);
    }
}