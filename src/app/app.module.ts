import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { FooterComponent } from './footer/footer.component';
import { FinancialCommitmentsComponent } from './financial-commitments/financial-commitments.component';
import { SaveComponent } from './save/save.component';
import { ImportantInformationComponent } from './important-information/important-information.component';
 
@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    FooterComponent,
    FinancialCommitmentsComponent,
    SaveComponent,
    ImportantInformationComponent,
   ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
