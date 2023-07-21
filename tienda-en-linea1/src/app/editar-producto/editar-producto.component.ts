import { Component } from '@angular/core';
import Swal from 'sweetalert2';

@Component({
  selector: 'app-editar-producto',
  templateUrl: './editar-producto.component.html',
  styleUrls: ['./editar-producto.component.css']
})
export class EditarProductoComponent{
  producto = {
    nombre: '',
    descripcion: '',
    oferta: false,
    precio: 0,
    imagen: ''
  };

  editarProducto() {
    // Aquí puedes agregar la lógica para guardar el nuevo producto
    console.log(this.producto);
    // También puedes redirigir a otra página después de guardar el producto
    Swal.fire(
      'Producto Editado!',
      'Da Click Para Continuar!',
      'success'
    )
  }
}
