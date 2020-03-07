import { Component, OnInit } from '@angular/core';
import { Cart } from '../../cart';
import { EmartService } from '../../emart.service';
import { Item } from '../../item';

@Component({
  selector: 'app-cart-list',
  templateUrl: './cart-list.component.html',
  styleUrls: ['./cart-list.component.css']
})
export class CartListComponent implements OnInit {
  cartItems: any;
  showCart: boolean;


  constructor(protected emartService: EmartService) { }

  ngOnInit(): void {
     
    this.cartItems = this.emartService.getAllCart();
    

    if (this.cartItems.length == 0) {
      this.showCart = false;
    }
    else {
      this.showCart = true;
    }
  }
  deleteCartItem(itemNo: number) {
      this.emartService.deleteCartItem(itemNo);
    this.cartItems=this.emartService.getAllCart();

  
  }
  
}