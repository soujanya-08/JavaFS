import { bootstrapApplication } from '@angular/platform-browser';
import { appConfig } from './app/app.config';
import { App } from './app/app';
import { MovieComp } from './app/movie-comp/movie-comp';

bootstrapApplication(MovieComp, appConfig)
  .catch((err) => console.error(err));
