import { ContractService } from "./../../service-logic/contract/contract.service";
import { Contract } from "./../../model/contract";
import { Component, OnInit } from "@angular/core";

@Component({
  selector: "app-contract-list",
  templateUrl: "./contract-list.component.html",
  styleUrls: ["./contract-list.component.css"],
})
export class ContractListComponent implements OnInit {
  contractList: Contract[] = [];

  constructor(private contractService: ContractService) {
    this.contractList = this.contractService.getAll();
  }

  ngOnInit(): void {}
}
