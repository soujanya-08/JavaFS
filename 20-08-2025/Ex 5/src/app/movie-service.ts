import { Injectable } from '@angular/core';
import { Movie } from './movie';

@Injectable({
  providedIn: 'root'
})
export class MovieService {
  movieList:Movie[]=[
    {movieId:'M01',movieName:'KGF', movieLanguage:'Kannada',imdbRating:8 },
    {movieId:'M02',movieName:'Kantara', movieLanguage:'Kannada',imdbRating:8.5 },
    {movieId:'M03',movieName:'3 idiots', movieLanguage:'Hindi',imdbRating:9 },
    {movieId:'M04',movieName:'Dhrishyam', movieLanguage:'Hindi',imdbRating:9 }
  ]
  getMovies(): Movie[] {
    return this.movieList;
  }

  deleteByEmpId(movieId: string): void {
    this.movieList = this.movieList.filter(m => m.movieId !== movieId);
  }
  addMovie(movie: Movie): void {
    this.movieList.push(movie);
  }
  findByMovieId(movieId: string): Movie | undefined {
    return this.movieList.find(m => m.movieId === movieId);
  }

   updateMovie(movie: Movie): void {
    const index = this.movieList.findIndex(m => m.movieId === movie.movieId);
    if (index !== -1) {
      this.movieList[index] = movie;
    } else {
      console.error(`Movie with MovieId ${movie.movieId} not found.`);
    }
  }
}
