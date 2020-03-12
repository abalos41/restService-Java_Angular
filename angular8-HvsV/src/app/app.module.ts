import { BrowserModule } from "@angular/platform-browser";
import { NgModule } from "@angular/core";
import { FormsModule } from "@angular/forms";
import { AppRoutingModule } from "./app-routing.module";
import { AppComponent } from "./app.component";
import { HttpClientModule } from "@angular/common/http";
import { CreateVillanoComponent } from './create-villano/create-villano.component';
import { VillanoListComponent } from './villano-list/villano-list.component';
import { UpdateVillanoComponent } from './update-villano/update-villano.component';

@NgModule({
  declarations: [AppComponent, CreateVillanoComponent, VillanoListComponent, UpdateVillanoComponent],
  imports: [BrowserModule, AppRoutingModule, FormsModule, HttpClientModule],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule {}
