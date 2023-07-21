import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { UsuarioService } from './services/usuario/usuario.service';



declare var $: any; // Importa jQuery

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {
  title = 'tienda-en-linea'; //titulo

  //variable tipo formgroup
  usuarioForm: FormGroup;


  //constructor usando el usuarioService.ts
  constructor(
    public fb: FormBuilder,
    public usuarioService: UsuarioService

  ) {

  }

  ngOnInit(): void {

    this.usuarioForm = this.fb.group({

      nombre: ['', Validators.required],
      apellido_paterno: ['', Validators.required],
      apellido_materno: ['', Validators.required],
      fecha_nacimiento: ['', Validators.required],
      telefono: ['', Validators.required],
      email: ['', Validators.required],
      password: ['', Validators.required],

    })

  }

  guardar(): void {
    //recuperar los datos del form
    this.usuarioService.saveUsuario(this.usuarioForm.value).subscribe(resp => {

    },
      error => console.error(error))

  }


};













//guardarTarjeta() {
  // Aquí puedes agregar la lógica para guardar la tarjeta de pago
 // console.log(this.tarjeta);
  // También puedes cerrar el modal después de guardar los datos
 // $('#tarjetaModal').modal('hide');
//}
//}
