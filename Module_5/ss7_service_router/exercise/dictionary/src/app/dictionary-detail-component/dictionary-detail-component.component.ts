import { Component, OnInit } from '@angular/core';
import {IWord} from "../iword";
import {DictionaryServiceService} from "../service/dictionary-service.service";
import {ActivatedRoute, ParamMap} from "@angular/router";
import {Subscription} from "rxjs";

@Component({
  selector: 'app-dictionary-detail-component',
  templateUrl: './dictionary-detail-component.component.html',
  styleUrls: ['./dictionary-detail-component.component.css']
})
export class DictionaryDetailComponentComponent implements OnInit {
  wordDetail: IWord;
  sub: Subscription;

  constructor(private dictionaryService: DictionaryServiceService,
              private activatedRoute: ActivatedRoute) {
  }

  ngOnInit(): void {
    this.sub = this.activatedRoute.paramMap.subscribe((paramMap: ParamMap) => {
      const word = paramMap.get('word');
      const mean = this.dictionaryService.translate(word);
      this.wordDetail = {word, mean};
    });
    console.log(this.wordDetail)
  }

  ngOnDestroy(): void {
    this.sub.unsubscribe();
  }

}
