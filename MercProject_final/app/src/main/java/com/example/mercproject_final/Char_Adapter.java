package com.example.mercproject_final;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


public class Char_Adapter extends RecyclerView.Adapter<Char_Adapter.Char_viewHolder> {


    String name[];//角色名字
    TextView check;
    int images[];//角色圖片
    Context context;//這是甚麼


    public Char_Adapter(Context ct , String[] s1 , TextView s2 , int[] image) {
        name = s1;
        check = s2;
        images = image;
        context = ct;
    }


    //三個method
    @NonNull
    @Override
    public Char_viewHolder onCreateViewHolder(@NonNull ViewGroup parent , int viewType) {
        LayoutInflater inflater = LayoutInflater.from ( context );
        View view = inflater.inflate ( R.layout.char_five , parent , false );
//        Char_viewHolder evh = new Char_viewHolder ( view  );
        return  new Char_viewHolder (view);
    }


    @Override
    public void onBindViewHolder(@NonNull Char_viewHolder holder , int position) {
        holder.char_name_text.setText ( name[position] );
        holder.char_five_img.setImageResource ( images[position] );
        holder.char_five_checked.setText ( "未持有" );
    }

    @Override
    public int getItemCount() {
        return images.length;
    }

    public class Char_viewHolder extends RecyclerView.ViewHolder {

        TextView char_name_text, char_five_checked;
        ImageView char_five_img;

        public Char_viewHolder(@NonNull View itemView ) {
            super ( itemView );
            char_name_text = itemView.findViewById ( R.id.char_five_name );
            char_five_img = itemView.findViewById ( R.id.char_five_img );
            char_five_checked = itemView.findViewById ( R.id.char_five_checked );


            itemView.setOnClickListener ( new View.OnClickListener ( ) {
                @Override

                public void onClick(View view) {
                    char_five_checked.setText ( "已擁有" );

//                    }
                }

            } );
        }

    }
}
