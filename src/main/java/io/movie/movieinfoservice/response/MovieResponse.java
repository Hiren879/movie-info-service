package io.movie.movieinfoservice.response;

import io.movie.movieinfoservice.model.Movie;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MovieResponse {
	Movie movie;
}
