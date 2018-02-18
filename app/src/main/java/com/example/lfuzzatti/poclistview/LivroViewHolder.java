package com.example.lfuzzatti.poclistview;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class LivroViewHolder extends RecyclerView.ViewHolder {

    private TextView titulo;
    private TextView descricao;
    private TextView autor;
    private TextView preco;

    public LivroViewHolder(View itemView) {
        super(itemView);

        //titulo = (TextView) itemView.findViewById(R.id.item_livro_titulo);
    }
}
