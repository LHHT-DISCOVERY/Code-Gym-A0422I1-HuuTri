import {Component, OnInit} from '@angular/core';
import {FormControl, FormGroup} from "@angular/forms";
import {Product} from "../../../model/product";
import {ProductService} from "../../../service/product.service";
import {ActivatedRoute, Router} from "@angular/router";

@Component({
  selector: 'app-product-edit',
  templateUrl: './product-edit.component.html',
  styleUrls: ['./product-edit.component.css']
})
export class ProductEditComponent implements OnInit {
  productForm: FormGroup;
  product: Product;
  constructor(private productService: ProductService,
              private activatedRoute: ActivatedRoute,
              private router: Router) {
    this.activatedRoute.paramMap.subscribe(next => {
      const id = next.get('id');
      if (id != null) {
        this.product = this.productService.findById(parseInt(id));
      }
    }, error => {

    }, () => {

    });

    this.productForm = new FormGroup ({
      id: new FormControl(this.product.id),
      name: new FormControl(this.product.name),
      price: new FormControl(this.product.price),
      description: new FormControl(this.product.description),
    })
  }

  ngOnInit(): void {
  }

  updateProduct() {
    this.productService.updateProduct(this.product.id, this.productForm.value);
    this.router.navigateByUrl('product/list');
  }
}
