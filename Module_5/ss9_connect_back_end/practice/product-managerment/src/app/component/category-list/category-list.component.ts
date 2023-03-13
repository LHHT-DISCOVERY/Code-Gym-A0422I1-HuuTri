import { CategoryService } from "src/app/service/category-service/category.service";
import { Component, OnInit } from "@angular/core";
import { Category } from "src/app/model/category";

@Component({
  selector: "app-category-list",
  templateUrl: "./category-list.component.html",
  styleUrls: ["./category-list.component.css"],
})
export class CategoryListComponent implements OnInit {
  categories: Category[] = [];

  constructor(private categoryService: CategoryService) {
  }

  ngOnInit(): void {
    this.getAll();
  }

  getAll() {
    this.categoryService.getAllCategory().subscribe(categories => {
      this.categories = categories;
    });
  }
}
