package com.example.lfuzzatti.poclistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView mRecyclerView = (RecyclerView) findViewById(R.id.card_view);

        List<Livro> listLivros = new ArrayList<Livro>();
        listLivros.add(new Livro("Dominando Android", "José da Silva",
                "Livro para desenvolvedor Android", 250d));

        //mRecyclerView.setAdapter();
    }

}

