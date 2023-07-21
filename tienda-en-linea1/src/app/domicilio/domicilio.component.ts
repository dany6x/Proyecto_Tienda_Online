import { Component } from '@angular/core';
import Swal from 'sweetalert2';

@Component({
  selector: 'app-domicilio',
  templateUrl: './domicilio.component.html',
  styleUrls: ['./domicilio.component.css']
})
export class DomicilioComponent {
  domicilio = {
    calle: '',
    numeroInterior: '',
    numeroExterior: '',
    codigoPostal: '',
    colonia: '',
    municipio: '',
    ciudad: '',
    pais: '',
    calle2: '',
    calle3: '',
    numeroContacto: '',
    referencias: ''
  };

  onSubmit() {
    // Aquí puedes agregar la lógica para registrar el domicilio
    console.log(this.domicilio);
    // ... lógica adicional ...
    Swal.fire(
      'Domicilio Registrado!',
      'Favor de dar click en inicio!',
      'success'
    )
  }
}
