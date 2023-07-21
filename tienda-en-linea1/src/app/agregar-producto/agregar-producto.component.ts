import { Component } from '@angular/core';
import Swal from 'sweetalert2';

@Component({
  selector: 'app-agregar-producto',
  templateUrl: './agregar-producto.component.html',
  styleUrls: ['./agregar-producto.component.css']
})
export class AgregarProductoComponent {
  producto = {
    nombre: '',
    descripcion: '',
    oferta: false,
    precio: 0,
    imagen: ''

  };



  agregarProducto() {
    // Aquí puedes agregar la lógica para guardar el nuevo producto
    console.log(this.producto);
    // También puedes redirigir a otra página después de guardar el producto
    Swal.fire(
      'Producto Agregado!',
      'Da Click Para Continuar!',
      'success'
    )
  }
}
