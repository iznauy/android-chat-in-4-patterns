package nju.androidchat.client.component;

import android.content.Context;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.annotation.StyleableRes;

import com.bumptech.glide.Glide;

import java.util.UUID;

import nju.androidchat.client.R;

public class ItemImgReceive extends LinearLayout {

    @StyleableRes
    int index0 = 0;

    private ImageView imageView;
    private Context context;
    private UUID messageId;
    private String url;

    public ItemImgReceive(Context context, String url, UUID messageId) {
        super(context);
        this.context = context;
        inflate(context, R.layout.item_img_receive, this);
        this.imageView = findViewById(R.id.chat_item_content_img);
        this.messageId = messageId;
        setUrl(url);
    }
    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
        this.url = url;
        setImage(url);
    }

    private void setImage(String url) {
        Glide.with(context).load(url).into(imageView);
    }

}
