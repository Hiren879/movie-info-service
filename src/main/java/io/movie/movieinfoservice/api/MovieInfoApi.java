package io.movie.movieinfoservice.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.movie.movieinfoservice.model.Movie;
import io.movie.movieinfoservice.response.MovieResponse;

@RestController
@RequestMapping("/movie-info")
public class MovieInfoApi {

	@GetMapping("/{movieId}")
	public MovieResponse getMovieInfo(@PathVariable("movieId") String movieId) {
		return new MovieResponse(new Movie(123, "War"));
	}

}
