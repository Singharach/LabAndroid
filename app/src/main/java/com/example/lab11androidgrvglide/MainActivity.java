package com.example.lab11androidgrvglide;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.example.lab11androidgrvglide.model.Gun;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);


        List<Gun> guns = new ArrayList<Gun>();
        Gun gun = new Gun();
        gun.setGun_name("Beretta M9");
        gun.setGun_image("https://upload.wikimedia.org/wikipedia/commons/6/61/M9-pistolet.jpg");
        gun.setGun_price(649);
        guns.add(gun);

        Gun gun2 = new Gun();
        gun2.setGun_name("M1911 Combat Commander");
        gun2.setGun_image("https://large.shootingsportsmedia.com/783133.jpg");
        gun2.setGun_price(999);
        guns.add(gun2);



        mAdapter = new MyAdapter(guns, this);
        recyclerView.setAdapter(mAdapter);

    }
}