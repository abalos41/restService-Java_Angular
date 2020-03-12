import { Observable } from "rxjs";
import { VillanoService } from "./../villano.service";
import { Villano } from "./../villano";
import { Component, OnInit } from "@angular/core";
import { Router } from "@angular/router";

@Component({
  selector: "app-villano-list",
  templateUrl: "./villano-list.component.html",
  styleUrls: ["./villano-list.component.css"]
})
export class VillanoListComponent implements OnInit {
  villanos: Observable<Villano[]>;

  constructor(private villanoService: VillanoService, private router: Router) {}

  ngOnInit() {
    this.reloadData();
  }

  reloadData() {
    this.villanos = this.villanoService.getListaVillanos();
  }

  deleteVillano(id: number) {
    this.villanoService.deleteVillano(id).subscribe(
      data => {
        console.log(data);
        this.reloadData();
      },
      error => console.log(error)
    );
  }

  updateVillano(id: number) {
    this.router.navigate(["update", id]);
  }
}
