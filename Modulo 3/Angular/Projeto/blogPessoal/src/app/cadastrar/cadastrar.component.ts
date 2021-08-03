import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { user } from '../model/user';
import { userLogin } from '../model/userLogin';
import { AuthService } from '../service/auth.service';

@Component({
  selector: 'app-cadastrar',
  templateUrl: './cadastrar.component.html',
  styleUrls: ['./cadastrar.component.css']
})
export class CadastrarComponent implements OnInit {

  user: user = new user 
  confirmarSenha: string 
  tipoUsuario: string

  constructor(
    private authService: AuthService,
    private router: Router
  ) {}

  ngOnInit(): void {
    window.scroll(0,0)
  }

   confirmSenha(event: any) {
    this.confirmarSenha = event.targe.value
   }

   tipoUser(event: any) {
    this.tipoUsuario = event.targ.value
   }

   cadastrar() {
    this.user.tipo = this.tipoUsuario

    if(this.user.senha != this.confirmarSenha){
      alert('A senha esta incorreta.')

    }else{
      this.authService.cadastrar(this.user).subscribe((resp: user) => {
        this.user = resp
        this.router.navigate(['/entrar'])
        alert('Usuário cadastrado com sucesso!')
      })
    }
   }

}
