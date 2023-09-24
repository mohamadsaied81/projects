import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Vehicledata } from './vehicledata';


@Injectable({
  providedIn: 'root'
})
export class VehicalservicedataService {
  constructor(private httpclient:HttpClient) { }

  url = "http://localhost:3000/vtucomm";
  apiurl="http://localhost:3000/vtutypedata";

  getApi(): Observable<Vehicledata>{
    return this.httpclient.get<Vehicledata>(this.url);
  }
  create(data:any):Observable<Vehicledata>{
    return this.httpclient.post<Vehicledata>(this.apiurl,data);
  }
}
