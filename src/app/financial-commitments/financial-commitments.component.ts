import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-financial-commitments',
  templateUrl: './financial-commitments.component.html',
  styleUrls: ['./financial-commitments.component.css']
})
export class FinancialCommitmentsComponent implements OnInit {

  appTitle:string='Welcome'
  blog:string='testing'
  

  constructor() {
    console.log('test')
   }

  ngOnInit(): void {
  }

}
