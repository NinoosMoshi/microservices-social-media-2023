import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ContactComponent } from './components/contact/contact.component';
import { TimeAboutComponent } from './components/time-lines/time-about/time-about.component';
import { TimeAlbumComponent } from './components/time-lines/time-album/time-album.component';
import { TimeFriendsComponent } from './components/time-lines/time-friends/time-friends.component';
import { TimeLineComponent } from './components/time-lines/time-line/time-line.component';
import { MainPageComponent } from './components/user-home/main-page/main-page.component';

const routes: Routes = [
  {path: 'mainpage', component: MainPageComponent},
  {path: 'contact', component: ContactComponent},
  {path: 'timeline', component: TimeLineComponent},
  {path: 'timeline-about', component: TimeAboutComponent},
  {path: 'timeline-friends', component: TimeFriendsComponent},
  {path: 'timeline-album', component: TimeAlbumComponent},
  {path: '', component: MainPageComponent},
  {path: '**', component: MainPageComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
