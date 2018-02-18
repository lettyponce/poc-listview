package com.example.lfuzzatti.poclistview;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import java.util.List;

public class LivroAdapter extends RecyclerView.Adapter {

    private List<Livro> livros;

    public LivroAdapter(List<Livro> livros) {
    }

    /**
     *  Método que criamos o ViewHolder, que fazíamos por boa prática no ListView.
     *  Além disso, é neste método que devemos inflar a view para vincular ao ViewHolder.
     *
     * @param parent
     * @param viewType
     * @return
     */
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    /**
     * Retorna a quantidade de itens que teremos no recyclerview
     * @return int
     */
    @Override
    public int getItemCount() {
        return livros.size();
    }
}
