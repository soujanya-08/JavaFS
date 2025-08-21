import { Component } from '@angular/core';
import { Movie } from '../movie';
import { MovieService } from '../movie-service';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-movie-comp',
  imports: [FormsModule],
  templateUrl: './movie-comp.html',
  styleUrl: './movie-comp.css'
})
export class MovieComp {
  movielist: Movie[] = [];
  movieId: string = '';
  movieIdAdd: string = '';
  movieNameAdd: string = '';
  movieLanguageAdd: string = '';
  imdbAdd:number = 0;
  constructor(private movieService: MovieService) {
    this.movielist = this.movieService.getMovies();
  }

  delete(): void {
    this.movieService.deleteByEmpId(this.movieId);
    this.movielist = this.movieService.getMovies();
    this.movieId = '';

  }

  save() {
    const newMovie: Movie = {
      movieId: this.movieIdAdd,
      movieName: this.movieNameAdd,
      movieLanguage: this.movieLanguageAdd,
      imdbRating:this.imdbAdd
    };
    this.movieService.addMovie(newMovie);
    this.movielist = this.movieService.getMovies();
    this.movieIdAdd = '';
    this.movieNameAdd = '';
    this.movieLanguageAdd = '';
    this.imdbAdd=0;
}

update() {
  const newMovie: Movie = {
      movieId: this.movieIdAdd,
      movieName: this.movieNameAdd,
      movieLanguage: this.movieLanguageAdd,
      imdbRating:this.imdbAdd
    };
    this.movieService.updateMovie(newMovie);
    this.movielist = this.movieService.getMovies();
    this.movieIdAdd = '';
    this.movieNameAdd = '';
    this.movieLanguageAdd = '';
    this.imdbAdd=0;
}
edit() {
  const movie = this.movieService.findByMovieId(this.movieId);
  if (movie) {
    this.movieIdAdd = movie.movieId;
    this.movieNameAdd = movie.movieName;
    this.movieLanguageAdd = movie.movieLanguage;
    this.imdbAdd = movie.imdbRating;
  } else {
    alert('Movie not found');
}
}
}
