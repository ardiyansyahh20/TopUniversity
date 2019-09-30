package com.ardi.topuniversity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvUniv;
    private ArrayList<University> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvUniv = findViewById(R.id.rv_univ);
        rvUniv.setHasFixedSize(true);
        list.addAll(UniversityData.getListData());
        showList();
    }

    private void showList() {
        rvUniv.setLayoutManager(new LinearLayoutManager(this));
        ListUniversityAdapter listUniversityAdapter = new ListUniversityAdapter(list);
        rvUniv.setAdapter(listUniversityAdapter);

        listUniversityAdapter.setOnItemClickCallback(new ListUniversityAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(University data) {
                Intent intent = new Intent(MainActivity.this, DetailUniversityActivity.class);
                intent.putExtra(DetailUniversityActivity.ITEM_EXTRA, data);
                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.menu_profil) {
            Intent intent = new Intent(MainActivity.this, ProfilActivity.class);
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }

//    private void showSelectedUniversity(University university){
//        Intent intentDetail = new Intent(MainActivity.this, DetailUniversityActivity.class);
//        intentDetail.putExtra(DetailUniversityActivity.EXTRA_NAME, university.getNamaUniv());
//        intentDetail.putExtra(DetailUniversityActivity.EXTRA_DESC, university.getDetailUniv());
//        intentDetail.putExtra(DetailUniversityActivity.EXTRA_IMG, university.getFotoUniv());
//        intentDetail.putExtra(DetailUniversityActivity.EXTRA_WEBSITE, university.getWebsiteUniv());
//        startActivity(intentDetail);
//    }
}
