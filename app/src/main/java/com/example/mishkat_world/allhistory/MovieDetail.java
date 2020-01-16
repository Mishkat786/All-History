package com.example.mishkat_world.allhistory;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.mishkat_world.allhistory.Common.Common;
import com.example.mishkat_world.allhistory.Model.Movie;
import com.flaviofaria.kenburnsview.KenBurnsView;
import com.squareup.picasso.Picasso;

public class MovieDetail extends AppCompatActivity {


    KenBurnsView image;
    TextView title;
    TextView summary;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_detail);
        image= (KenBurnsView)findViewById(R.id.movie_image);
        title= (TextView)findViewById(R.id.movie_title);
        summary= (TextView)findViewById(R.id.movie_summary);


        if (getIntent() !=null){
            int movie_index = getIntent().getIntExtra("movie_index",-1);
            if (movie_index != -1)
                loadMovieDetail(movie_index);
        }


    }

    private void loadMovieDetail(int movie_index) {

        Movie movie = Common.movieList.get(movie_index);
        Picasso.with(getBaseContext()).load(movie.getUrl()).into(image);
        title.setText(movie.getTitle());
        summary.setText(movie.summary);
    }



}
