import {IWord} from './../iword';
import {Injectable} from "@angular/core";

@Injectable({
  providedIn: "root",
})
export class DictionaryServiceService {
  dictionaries : IWord[] = [
    {word: "English", mean: "Tiếng Anh"},
    {word: "Hello", mean: "Xin Chào"},
    {word: "Sorry", mean: "Xin lỗi"},
    {word: "ISP", mean: " Nhà cung cấp dịch vụ"},
    {word: "hunger", mean: "Đói"}
  ];

  constructor() {
  }

  getAll() {
    return this.dictionaries;
  }

  translate(word: string | null): string {
    if (!word) {
      return '';
    }
    const wordTranslate = this.dictionaries.find(item => item.word === word.toLowerCase());
    if (wordTranslate) {
      return wordTranslate.mean;
    }
    return 'Not found';
  }
}
