import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ItemListComponent } from './emart/item/item-list/item-list.component';
import { ItemDisplayComponent } from './emart/item/item-display/item-display.component';
import { CartListComponent } from './emart/cart/cart-list/cart-list.component';
import { BillViewComponent } from './emart/bill/bill-view/bill-view.component';
import { BillListComponent } from './emart/bill/bill-list/bill-list.component';
import { LoginComponent } from './emart/signup/login/login.component';


const routes: Routes = [{

  path: 'login',
  component: LoginComponent
},
{
  path: 'item-list',
  component: ItemListComponent
},
{
  path: 'item-display/:iId',
  component: ItemDisplayComponent
},
{
  path: 'cart-list',
  component: CartListComponent
},
{
  path: 'bill-view',
  component: BillViewComponent
},
{

  path: 'bill-list',
  component: BillListComponent
}];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
