import { VillanoService } from "../villano.service";
import { Villano } from "../villano";
import { Component, OnInit } from "@angular/core";
import { Router } from "@angular/router";

@Component({
  selector: "app-create-villano",
  templateUrl: "./create-villano.component.html",
  styleUrls: ["./create-villano.component.css"]
})
export class CreateVillanoComponent implements OnInit {
  villano: Villano = new Villano();
  submitted = false;

  constructor(private villanoService: VillanoService, private router: Router) {}

  ngOnInit() {}

  newVillano(): void {
    this.submitted = false;
    this.villano = new Villano();
  }

  save() {
    this.villanoService.createVillano(this.villano).subscribe(
      data => console.log(data),
      error => console.log(error)
    );
    this.villano = new Villano();
    this.gotoList();
  }

  onSubmit() {
    this.submitted = true;
    this.save();
  }

  gotoList() {
    this.router.navigate(["/villanos"]);
  }
}
