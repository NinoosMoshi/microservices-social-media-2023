import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './components/header/header.component';
import { FooterComponent } from './components/footer/footer.component';
import { SignUpComponent } from './components/sign-up/sign-up.component';
import { ContactComponent } from './components/contact/contact.component';
import { UserHomeComponent } from './components/user-home/user-home.component';
import { LeftBarComponent } from './components/user-home/left-bar/left-bar.component';
import { RightBarComponent } from './components/user-home/right-bar/right-bar.component';
import { PublishComponent } from './components/user-home/publish/publish.component';
import { CoolImagesComponent } from './components/user-home/cool-images/cool-images.component';
import { MainPageComponent } from './components/user-home/main-page/main-page.component';
import { FriendsComponent } from './components/user-home/friends/friends.component';
import { TimeLinesComponent } from './components/time-lines/time-lines.component';
import { TimeLineComponent } from './components/time-lines/time-line/time-line.component';
import { TimeAboutComponent } from './components/time-lines/time-about/time-about.component';
import { TimeFriendsComponent } from './components/time-lines/time-friends/time-friends.component';
import { TimeAlbumComponent } from './components/time-lines/time-album/time-album.component';
import { TimeLineDetailsComponent } from './components/time-lines/time-line-details/time-line-details.component';
import { TimeLineProfileComponent } from './components/time-lines/time-line-profile/time-line-profile.component';


@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    FooterComponent,
    SignUpComponent,
    ContactComponent,
    UserHomeComponent,
    LeftBarComponent,
    RightBarComponent,
    PublishComponent,
    CoolImagesComponent,
    MainPageComponent,
    FriendsComponent,
    TimeLinesComponent,
    TimeLineComponent,
    TimeAboutComponent,
    TimeFriendsComponent,
    TimeAlbumComponent,
    TimeLineDetailsComponent,
    TimeLineProfileComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
