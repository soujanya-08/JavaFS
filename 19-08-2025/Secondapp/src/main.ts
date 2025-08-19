import { bootstrapApplication } from '@angular/platform-browser';
import { appConfig } from './app/app.config';
import { App } from './app/app';
import { Home } from './app/home/home';
import { Ex2 } from './app/ex2/ex2';

bootstrapApplication(Home, appConfig)
  .catch((err) => console.error(err));
