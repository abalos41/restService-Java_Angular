import { Component, OnInit } from "@angular/core";
import { ActivatedRoute, Router } from "@angular/router";

import { VillanoService } from "../villano.service";
import { Villano } from "../villano";

@Component({
  selector: "app-update-villano",
  templateUrl: "./update-villano.component.html",
  styleUrls: ["./update-villano.component.css"]
})
export class UpdateVillanoComponent implements OnInit {
  id: number;
  villano: Villano;

  constructor(
    private route: ActivatedRoute,
    private router: Router,
    private villanoService: VillanoService
  ) {}

  ngOnInit() {
    this.villano = new Villano();

    this.id = this.route.snapshot.params["id"];

    this.villanoService.getVillano(this.id).subscribe(
      data => {
        console.log(data);
        this.villano = data;
      },
      error => console.log(error)
    );
  }

  updateVillano() {
    this.villanoService.updateVillano(this.id, this.villano).subscribe(
      data => console.log(data),
      error => console.log(error)
    );
    this.villano = new Villano();
    this.gotoList();
  }

  onSubmit() {
    this.updateVillano();
  }

  gotoList() {
    this.router.navigate(["/villanos"]);
  }
}
