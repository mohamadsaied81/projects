import { Component, OnInit } from '@angular/core';
import { FormControl } from '@angular/forms';

import { VehicalservicedataService } from '../vehicalservicedata.service';
import { Vehicledata } from '../vehicledata';
import { FilterPipe } from './filter.pipe';

@Component({
  selector: 'app-vehicaldata',
  templateUrl: './vehicaldata.component.html',
  styleUrls: ['./vehicaldata.component.css']
})
export class VehicaldataComponent implements OnInit {
  searchText: string = "";
  selected_count: number = 0;
  checkList: any[] = [];

  // Data Object to List vehicles
  vehicles = [
    {
      name: 'Chess',
      id: 1,
      selected: true
    },
    {
      name: 'Ludo',
      id: 2,
      selected: false
    },
    {
      name: 'Snakes & Ladders',
      id: 3,
      selected: false
    },
    {
      name: 'Carrom',
      id: 4,
      selected: false
    },
    {
      name: 'Scrabble',
      id: 5,
      selected: false
    },
    {
      name: 'Monopoly',
      id: 6,
      selected: true
    },
    {
      name: 'Uno',
      id: 7,
      selected: false
    }
  ]

  public getall!: Vehicledata;

  public example: Array<any> = new Array;
  public arr: Array<any> = new Array;
  public myControl = new FormControl();

  getInfo: Array<any> = new Array<any>()
  selected_vehicles: any[] = []

  ngOnInit(): void {

    this.dataservice.getApi().subscribe((response: Vehicledata) => {

      this.checkList = response.data;
      console.log('result', this.checkList);
      this.getall = response;


      console.log("called Backend API getAll() method :" + JSON.stringify(this.getall));
    })
  }

  public click(event: any) {
    //alert(event.id);
    if(event!=''){
    this.getInfo.push(event)
    console.log('clicked', this.getInfo);
    }
  }

  public productDel(event: any) {
    const index = this.getInfo.findIndex(user => user.id === event);
    this.getInfo.splice(index, 1);

    console.log('delete id', event)

  }

  public product() {
    console.log('test')
  }
  AddVtuCommand() {


  }
  // Getting Selected vehicles and Count
  getSelected() {
    this.selected_vehicles = this.checkList.filter(x => {
      return x.selected;
    });
    console.log(' this.selected_vehicles', this.selected_vehicles);

    this.selected_count = this.selected_vehicles.length;
    // //alert(this.selected_vehicles);
    console.log("selected_count() called", this.selected_count);
  }

  // Clearing All Selections
  clearSelection() {
    this.searchText = "";
    this.checkList = this.checkList.filter(g => {
      g.selected = false;
      return true;
    });
    this.getSelected();
    console.log("clearSelection() called ", this.getSelected())
  }

  //Delete Single Listed vehicle Tag
  deletevehicle(id: number) {
    this.searchText = "";
    this.checkList = this.checkList.filter(g => {
      if (g.id == id)
        g.selected = false;

      return true;
    });
    this.getSelected();
  }

  //Clear term types by user
  clearFilter() {
    this.searchText = "";
  }

  constructor(private dataservice: VehicalservicedataService) {
    // this.name = `Angular! v${VERSION.full}`;
    this.getSelected();
  }
}


