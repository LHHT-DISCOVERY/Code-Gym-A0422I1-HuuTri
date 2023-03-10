import {IWord} from './../iword';
import {Component, OnInit} from '@angular/core';
import {DictionaryServiceService} from "../service/dictionary-service.service";

@Component({
  selector: 'app-dictionay-page-component',
  templateUrl: './dictionay-page-component.component.html',
  styleUrls: ['./dictionay-page-component.component.css']
})
export class DictionayPageComponentComponent implements OnInit {

  listDictionaries : IWord[] = [];

  constructor(private  dictionaries: DictionaryServiceService) {
    this.listDictionaries = this.dictionaries.getAll();
  }
  ngOnInit(): void {
    console.log(this.listDictionaries)
  }

  getAll(){
    this.dictionaries.getAll();
  }



}
