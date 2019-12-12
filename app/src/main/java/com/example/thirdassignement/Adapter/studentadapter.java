package com.example.thirdassignement.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.thirdassignement.R;

import java.util.List;

public class studentadapter extends RecyclerView.Adapter<studentadapter.ViewHolder> {

    List<students> students;
    Context context;


    public studentadapter(List<students> students, Context context) {
        this.students = students;
        this.context = context;
    }




    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext())
                .inflate(R.layout.studentdetails, parent, false);
        return new ViewHolder(v);

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        students student=students.get(position);
        String gender=student.getGender();

        holder.tName.setText(student.g);

    }

    @Override
    public int getItemCount() {
        return students.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView tName,tAge, tAddress, tGender;
        Button btn;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView=itemView.findViewById(R.id.imageView);
            tName=itemView.findViewById(R.id.tvName);

            tAge = itemView.findViewById(R.id.tvAge);
            tAddress = itemView.findViewById(R.id.tvAddress);
            tGender = itemView.findViewById(R.id.tvGender);
            btn = itemView.findViewById(R.id.btnDelete);

        }
    }


}
