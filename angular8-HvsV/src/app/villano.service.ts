import { Injectable } from "@angular/core";
import { HttpClient } from "@angular/common/http";
import { Observable } from "rxjs";

@Injectable({
  providedIn: "root"
})
export class VillanoService {
  private baseUrl = "http://localhost:8080/api/villanos";

  constructor(private http: HttpClient) {}

  getVillano(id: number): Observable<any> {
    return this.http.get(`${this.baseUrl}/${id}`);
  }

  createVillano(villano: Object): Observable<Object> {
    return this.http.post(`${this.baseUrl}`, villano);
  }

  updateVillano(id: number, value: any): Observable<Object> {
    return this.http.put(`${this.baseUrl}/${id}`, value);
  }

  deleteVillano(id: number): Observable<any> {
    return this.http.delete(`${this.baseUrl}/${id}`, { responseType: "text" });
  }

  getListaVillanos(): Observable<any> {
    return this.http.get(`${this.baseUrl}`);
  }
}
