import { NgModule } from "@angular/core";
import { Routes, RouterModule } from "@angular/router";

import { CreateVillanoComponent } from "./create-villano/create-villano.component";
import { VillanoListComponent } from "./villano-list/villano-list.component";
import { UpdateVillanoComponent } from "./update-villano/update-villano.component";

const routes: Routes = [
  { path: "", redirectTo: "villano", pathMatch: "full" },
  { path: "villanos", component: VillanoListComponent },
  { path: "addVillano", component: CreateVillanoComponent },
  { path: "update/:id", component: UpdateVillanoComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {}
