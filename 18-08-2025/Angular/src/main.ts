import { bootstrapApplication } from '@angular/platform-browser';
import { appConfig } from './app/app.config';
import { App } from './app/app';
import {Secondcomp} from './app/secondcomp/secondcomp';
import { Login } from './app/login/login';
import { Thirdcomp } from './app/thirdcomp/thirdcomp';
import { ListComp } from './app/list-comp/list-comp';
import { ConditionComp } from './app/condition-comp/condition-comp';
import { SearchComp } from './app/search-comp/search-comp';
import { Home } from './app/home/home';
// Ex3
bootstrapApplication(Home, appConfig)
  .catch((err) => console.error(err));
