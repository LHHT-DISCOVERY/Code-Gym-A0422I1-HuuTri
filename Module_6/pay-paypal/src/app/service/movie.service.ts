import { HttpClient, HttpClientModule } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Movie } from '../model/movie';
import { environment } from 'src/environments/environment';

const API_URL = `${environment.apiUrl}`

@Injectable({
  providedIn: 'root'
})
export class MovieService {

  constructor(private http : HttpClient) { } 
  getAllMovie():Observable<Movie[]> {
      return this.http.get<Movie[]>(`${API_URL}/movieList`);
  };
}
