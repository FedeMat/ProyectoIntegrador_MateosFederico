import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { TokenService } from 'src/app/services/token.service';

@Component({
  selector: 'app-logo-arg-prog',
  templateUrl: './logo-arg-prog.component.html',
  styleUrls: ['./logo-arg-prog.component.css']
})
export class LogoArgProgComponent implements OnInit {
logueado = false

  constructor(private router:Router, private tokenService: TokenService) { }

  ngOnInit(): void {
  if(this.tokenService.getToken()){
    this.logueado = true;
  }else{
    this.logueado = false;
  }
  }

  onLogOut():void{
    this.tokenService.logOut();
    window.location.reload();
  }

  login(){
    this.router.navigate(['/login'])
  }
}
