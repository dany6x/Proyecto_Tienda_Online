import { Component } from '@angular/core';
import Swal from 'sweetalert2';



@Component({
  selector: 'app-tablaadmin',
  templateUrl: './tablaadmin.component.html',
  styleUrls: ['./tablaadmin.component.css']
})
export class TablaadminComponent {
  eliminarProducto() {
    Swal.fire({
      title: 'Deseas Eliminar Este Producto?',
      text: "Una Vez Eliminado No Existira Mas!",
      icon: 'warning',
      showCancelButton: true,
      confirmButtonColor: '#3085d6',
      cancelButtonColor: '#d33',
      confirmButtonText: 'Si, Eliminar!'
    }).then((result) => {
      if (result.isConfirmed) {
        Swal.fire(
          'Eliminado!',
          'El Producto ah sido eliminado.',
          'success'
        )
      }
    })
  }

}
