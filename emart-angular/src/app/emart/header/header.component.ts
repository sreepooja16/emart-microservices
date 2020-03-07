import { Component, OnInit } from '@angular/core';

import { EmartService } from '../emart.service';
import { LoginService } from 'src/app/login.service';
;

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent implements OnInit {
  currentBuyer: any;
  constructor(protected loginService: LoginService, protected emartService: EmartService) { }

  ngOnInit(): void {
    this.currentBuyer = this.emartService.getCurrentBuyer();
  }

  getLoggedIn() {
    return this.loginService.loggedIn;

  }
}