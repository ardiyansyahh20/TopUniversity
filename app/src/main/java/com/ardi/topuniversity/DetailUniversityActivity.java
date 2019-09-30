package com.ardi.topuniversity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailUniversityActivity extends AppCompatActivity {

    public static final String ITEM_EXTRA = "item_extra";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_university);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Detail University");
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        TextView tvName = findViewById(R.id.tv_nama_univ);
        TextView tvDeskripsi = findViewById(R.id.tv_deskripsi_univ);
        TextView tvWebsite = findViewById(R.id.tv_website_univ);
        ImageView imgUniv = findViewById(R.id.img_foto_univ);

        final University university = getIntent().getParcelableExtra(ITEM_EXTRA);
        Glide.with(this)
                .load(university.getFotoUniv())
                .into(imgUniv);
        tvName.setText(university.getNamaUniv());
        tvDeskripsi.setText(university.getDetailUniv());
        tvWebsite.setText(university.getWebsiteUniv());
        tvWebsite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = university.getWebsiteUniv();
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });

    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }
}
