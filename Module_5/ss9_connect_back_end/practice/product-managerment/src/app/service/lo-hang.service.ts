import { LoHang } from './../model/lo-hang';
import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { environment } from 'src/environments/environment';
import { Observable } from "rxjs/internal/Observable";
const API_URL = `${environment.apiUrl}`;

@Injectable({
  providedIn: 'root'
})
export class LoHangService {

  constructor(private httpClient: HttpClient) {}
  // loHangList giống vs list trong file json 
    getAllLoHang(): Observable<LoHang[]> {
      return this.httpClient.get<LoHang[]>(`${API_URL}/loHangList`);
    }
    saveLoHang(loHang: LoHang): Observable<LoHang> {
      return this.httpClient.post<LoHang>(`${API_URL}/loHangList`, loHang);
    }
    findById(id: number): Observable<LoHang> {
  
      return this.httpClient.get<LoHang>(`${API_URL}/loHangList/${id}`);
    }
  
    updateLoHang(id : number  , loHang: LoHang): Observable<LoHang> {
      return this.httpClient.put<LoHang>(`${API_URL}/loHangList/${id}`, loHang)}
  
    deleteLoHang(id : number) : Observable<LoHang> {
      return this.httpClient.delete<LoHang>(`${API_URL}/loHangList/${id}`);
    }
}
