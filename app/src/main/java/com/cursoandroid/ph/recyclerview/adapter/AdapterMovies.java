package com.cursoandroid.ph.recyclerview.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.cursoandroid.ph.recyclerview.R;
import com.cursoandroid.ph.recyclerview.model.Movie;

import java.util.List;

public class AdapterMovies extends RecyclerView.Adapter<AdapterMovies.MyViewHolder> {

    private List<Movie> movieList;

    public AdapterMovies(List<Movie> list) {
        this.movieList = list;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemListMovie = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.adapter_list_movie, parent, false);


        return new MyViewHolder(itemListMovie);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Movie movie = movieList.get(position);
        holder.title.setText(movie.getTitle());
        holder.gender.setText(movie.getGender());
        holder.year.setText(movie.getYear());

    }

    @Override
    public int getItemCount() {
        return movieList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView title, year, gender;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.textViewTitle);
            year = itemView.findViewById(R.id.textViewYear);
            gender = itemView.findViewById(R.id.textViewGender);
        }
    }

}
