package com.cursoandroid.ph.recyclerview.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.cursoandroid.ph.recyclerview.R;
import com.cursoandroid.ph.recyclerview.RecyclerItemClickListener;
import com.cursoandroid.ph.recyclerview.adapter.AdapterMovies;
import com.cursoandroid.ph.recyclerview.model.Movie;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerMovies;
    private List<Movie> movieList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerMovies = findViewById(R.id.recyclerViewMovies);

        //List of movies
        this.createMovies();
        //Configure adapter
        AdapterMovies adapterMovies = new AdapterMovies(movieList);
        //Configure RecycleView
        RecyclerView.LayoutManager layoutMovies = new LinearLayoutManager(getApplicationContext());
        recyclerMovies.setLayoutManager(layoutMovies);
        recyclerMovies.setHasFixedSize(true);
        recyclerMovies.addItemDecoration(new DividerItemDecoration(this, LinearLayout.VERTICAL));
        recyclerMovies.setAdapter(adapterMovies);

        //Click Event
        recyclerMovies.addOnItemTouchListener(
                new RecyclerItemClickListener(
                        getApplicationContext(),
                        recyclerMovies,
                        new RecyclerItemClickListener.OnItemClickListener() {
                            @Override
                            public void onItemClick(View view, int position) {
                                Movie movie = movieList.get(position);
                                Toast.makeText(
                                        getApplicationContext(),
                                        "Item clicked: " + movie.getTitle(),
                                        Toast.LENGTH_SHORT
                                ).show();
                            }

                            @Override
                            public void onLongItemClick(View view, int position) {
                                Movie movie = movieList.get(position);
                                Toast.makeText(
                                        getApplicationContext(),
                                        "Click Long: " + movie.getTitle(),
                                        Toast.LENGTH_SHORT
                                ).show();
                            }

                            @Override
                            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                            }
                        }
                )
        );
    }

    public void createMovies () {
        Movie movie = new Movie("Capitão América: O primeiro vingador", "Fase 1",
                "2011");
        this.movieList.add(movie);
        movie = new Movie("Capitã Marvel", "Fase 3", "2019");
        this.movieList.add(movie);
        movie = new Movie("O incrível Hulk", "Fase 1", "2008");
        this.movieList.add(movie);
        movie = new Movie("Homem de Ferro", "Fase 1", "2008");
        this.movieList.add(movie);
        movie = new Movie("Homem de Ferro 2", "Fase 1", "2010");
        this.movieList.add(movie);
        movie = new Movie("Thor", "Fase 1", "2011");
        this.movieList.add(movie);
        movie = new Movie("Os Vingadores", "Fase 1", "2012");
        this.movieList.add(movie);
        movie = new Movie("Homem de Ferro 3", "Fase 2", "2013");
        this.movieList.add(movie);
        movie = new Movie("Thor: O mundo sombrio", "Fase 2", "2013");
        this.movieList.add(movie);
        movie = new Movie("Capitão América: O Soldado Invernal", "Fase 2", "2014");
        this.movieList.add(movie);
        movie = new Movie("Guardiões da Galáxia", "Fase 2", "2014");
        this.movieList.add(movie);
        movie = new Movie("Guardiões da Galáxia Vol. 2", "Fase 3", "2017");
        this.movieList.add(movie);
        movie = new Movie("Vingadores: Era de Ultron", "Fase 2", "2015");
        this.movieList.add(movie);
        movie = new Movie("Homem Formiga", "Fase 2", "2015");
        this.movieList.add(movie);
        movie = new Movie("Capitão América: Guerra Civil", "Fase 3", "2016");
        this.movieList.add(movie);
        movie = new Movie("Homem Aranha: De volta ao lar", "Fase 3", "2017");
        this.movieList.add(movie);
        movie = new Movie("Doutor Estranho", "Fase 3", "2016");
        this.movieList.add(movie);
        movie = new Movie("Pantera Negra", "Fase 3", "2018");
        this.movieList.add(movie);
        movie = new Movie("Thor: Ragnarok", "Fase 3", "2017");
        this.movieList.add(movie);
        movie = new Movie("Homem Formiga e Vespa", "Fase 3", "2018");
        this.movieList.add(movie);
        movie = new Movie("Vingadores: Guerra Infinita", "Fase 3", "2018");
        this.movieList.add(movie);
        movie = new Movie("Vingadores: Ultimato", "Fase 3", "2019");
        this.movieList.add(movie);
        movie = new Movie("Homem Aranha: Longe de casa", "Fase 3", "2019");
        this.movieList.add(movie);
    }

}