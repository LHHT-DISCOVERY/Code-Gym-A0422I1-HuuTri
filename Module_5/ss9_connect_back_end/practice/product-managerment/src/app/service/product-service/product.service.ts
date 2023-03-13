import { Observable } from "rxjs/internal/Observable";
import { HttpClient } from "@angular/common/http";

import { Injectable } from "@angular/core";
import { environment } from "src/environments/environment";
import { Product } from "src/app/model/product";
const API_URL = `${environment.apiUrl}`;

@Injectable({
  providedIn: "root",
})
export class ProductService {
  constructor(private httpClient: HttpClient) {}

  getAllProduct(): Observable<Product[]> {
    return this.httpClient.get<Product[]>(`${API_URL}/productList`);
  }
  saveProduct(product: Product): Observable<Product> {
    return this.httpClient.post<Product>(`${API_URL}/productList`, product);
  }
  findById(id: number): Observable<Product> {

    return this.httpClient.get<Product>(`${API_URL}/productList/${id}`);
  }

  updateProduct(id : number  , product: Product): Observable<Product> {
    return this.httpClient.put<Product>(`${API_URL}/productList/${id}`, product)}

  deleteProduct(id : number) : Observable<Product> {
    return this.httpClient.delete<Product>(`${API_URL}/productList/${id}`);
  }

}
