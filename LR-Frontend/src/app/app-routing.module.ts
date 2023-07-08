import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { RegisterComponent } from './register/register.component';
import { LoginComponent } from './login/login.component';
import { HomePageComponent } from './home-page/home-page.component';
import { AppComponent } from './app.component';

const routes: Routes = [
  {
    path:'login',component:LoginComponent,
    children:[{
      path:'homepage',
      component:HomePageComponent
    }]
  },
  {
    path:'register',component:RegisterComponent
  },
  {
    path:'login/homepage',component:HomePageComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
